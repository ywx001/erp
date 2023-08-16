package com.sn.shiro.realm;

import com.sn.entity.JWTToken;
import com.sn.entity.User;
import com.sn.service.UserService;
import com.sn.util.JWTUtil;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.*;

@Component
public class CustomRealm extends AuthorizingRealm {

    @Resource
    @Lazy
    private UserService userService;

//    private final UserService userService;
//
//    @Autowired
//    @Lazy
//    public CustomRealm(UserService userService) {
//        this.userService = userService;
//    }

    private static Logger logger = LoggerFactory.getLogger(CustomRealm.class);



    /**
     * 必须重写此方法，不然会报错
     */
    @Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof JWTToken;
    }

    /**
     * 默认使用此方法进行用户名正确与否验证，错误抛出异常即可。
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {

        String token = (String) authenticationToken.getCredentials();
        logger.info("身份认证方法开始,请求token:{}", token);
        // 解密获得account，用于和数据库进行对比
        String account = JWTUtil.getAccount(token);
        if (account == null || !JWTUtil.checkToken(token)) {
            throw new AuthenticationException("token认证失败！");
        }

        return new SimpleAuthenticationInfo(token, token, "CustomRealm");
    }

    /**
     * 只有当需要检测用户权限的时候才会调用此方法，例如checkRole,checkPermission之类的
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        logger.info("权限认证开始，请求参数:{}", principals);
        String account = JWTUtil.getAccount(principals.toString());
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();

        //调用业务层获取用户信息
        Map<String, Object> map = new HashMap<>();
        map.put("account", account);
        User user = userService.getOneUser(map);

        //获得该用户角色id
        List<String> roles = userService.getRoles(account);
        //每个角色拥有的权限
        List<String> rolePermission = userService.getRolePermission(user.getRoleids());
        //用户的特殊权限
//        String specpermisson = userMapper.getPermission(account);
        String specpermisson = null;

        Set<String> roleSet = new HashSet<>();
        Set<String> permissionSet = new HashSet<>();


        //需要将 role, permission 封装到 Set 作为 info.setRoles(), info.setStringPermissions() 的参数
        roleSet.addAll(roles);

        permissionSet.addAll(rolePermission);
        if (specpermisson != null) {
            permissionSet.add(specpermisson);
        }
//        logger.info("当前用户角色:{}", roleSet.toString());
//        logger.info("当前用户权限:{}", permissionSet.toString());


        //设置该用户拥有的角色和权限
        info.setRoles(roleSet);
        info.setStringPermissions(permissionSet);
        return info;
    }
}

