package com.sn.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sn.dao.UserDao;
import com.sn.entity.User;
import com.sn.entity.common.ResultMap;
import com.sn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 用户信息表(User)表服务实现类
 *
 * @author makejava
 * @since 2023-07-10 09:12:37
 */
@Service("userService")
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

    private final ResultMap resultMap;

    @Autowired
    public UserServiceImpl(ResultMap resultMap) {
        this.resultMap = resultMap;
    }

    @Resource
    private UserDao userDao;

    @Cacheable(value = "User", key = "'account-' + #map.get('account')")
    @Override
    public User getOneUser(Map<String, Object> map) {
        return userDao.selectByMap(map).get(0);
    }

    @Cacheable(value = "Roles", key = "'account-' + #account")
    @Override
    public List<String> getRoles(String account) {
        return userDao.getRoles(account);
    }

    @Cacheable(value = "RolePermission", key = "'roleIds-' + #roleIds")
    @Override
    public List<String> getRolePermission(String roleIds) {
        return userDao.getRolePermission(roleIds);
    }
}

