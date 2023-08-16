package com.sn.shiro.config;

//import at.pollux.thymeleaf.shiro.dialect.ShiroDialect;
import com.sn.filter.JWTFilter;
import com.sn.shiro.realm.CustomRealm;
//import net.sf.ehcache.CacheManager;
//import org.apache.shiro.cache.ehcache.EhCacheManager;
//import org.apache.shiro.io.ResourceUtils;
import org.apache.shiro.authz.Authorizer;
import org.apache.shiro.authz.ModularRealmAuthorizer;
import org.apache.shiro.mgt.DefaultSessionStorageEvaluator;
import org.apache.shiro.mgt.DefaultSubjectDAO;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;
import javax.servlet.Filter;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@Configuration
public class ShiroConfig {
    @Resource
    private CustomRealm customRealm;

    /**
     * 使用AOP
     * @return
     */
    @Bean
    public static DefaultAdvisorAutoProxyCreator getDefaultAdvisorAutoProxyCreator(){

        DefaultAdvisorAutoProxyCreator defaultAdvisorAutoProxyCreator=new DefaultAdvisorAutoProxyCreator();
        defaultAdvisorAutoProxyCreator.setUsePrefix(true);

        return defaultAdvisorAutoProxyCreator;
    }


    @Bean
    public DefaultWebSecurityManager securityManager() {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        // 设置自定义 realm.
        securityManager.setRealm(customRealm);

        /*
         * 关闭shiro自带的session，详情见文档
         * http://shiro.apache.org/session-management.html#SessionManagement-StatelessApplications%28Sessionless%29
         */
        DefaultSubjectDAO subjectDAO = new DefaultSubjectDAO();
        DefaultSessionStorageEvaluator defaultSessionStorageEvaluator = new DefaultSessionStorageEvaluator();
        defaultSessionStorageEvaluator.setSessionStorageEnabled(false);
        subjectDAO.setSessionStorageEvaluator(defaultSessionStorageEvaluator);
        securityManager.setSubjectDAO(subjectDAO);
        return securityManager;
    }

    @Bean
    public ShiroFilterFactoryBean shiroFilterFactoryBean(SecurityManager securityManager) {
        ShiroFilterFactoryBean factoryBean = new ShiroFilterFactoryBean();
        // 添加自己的过滤器并且取名为jwt
        Map<String, Filter> filterMap = new LinkedHashMap<>();
        //设置我们自定义的JWT过滤器
        filterMap.put("jwt", new JWTFilter());
        factoryBean.setFilters(filterMap);
        factoryBean.setSecurityManager(securityManager);

        // 设置无权限时跳转的 url;
        factoryBean.setUnauthorizedUrl("/unauthorized/无权限");
        Map<String, String> filterRuleMap = new HashMap<>();
        // 所有请求通过我们自己的JWT Filter
        filterRuleMap.put("/**", "jwt");
        // 访问 /unauthorized/** 不通过JWTFilter
        filterRuleMap.put("/unauthorized/**", "anon");
        factoryBean.setFilterChainDefinitionMap(filterRuleMap);
        return factoryBean;
    }


/*    @Bean
    public ShiroFilterFactoryBean shiroFilterFactoryBean(SecurityManager securityManager) {
        ShiroFilterFactoryBean factoryBean = new ShiroFilterFactoryBean();

        *//*
         * filter配置规则参考官网
         * http://shiro.apache.org/web.html#urls-
         * 默认过滤器对照表
         * https://shiro.apache.org/web.html#default-filters
         *//*

        Map<String, String> filterRuleMap = new HashMap<>();

        filterRuleMap.put("/static/*", "anon");
        filterRuleMap.put("/error", "anon");
        filterRuleMap.put("/register", "anon");
        filterRuleMap.put("/login", "anon");
        //↑配置不参与验证的映射路径。

        // 关键：配置jwt验证过滤器。
        //↓ 此处即为shiro1.8新增的默认过滤器：authcBearer-BearerHttpAuthenticationFilter。jwt验证的很多操作都由该filter自动完成，以致我们只需理解其机制而无需亲手实现。
        filterRuleMap.put("/**", "authcBearer");
        //↑ 如果有其他过滤法则配在/**上，则在第二个参数的字符串里使用逗号间隔。

        factoryBean.setGlobalFilters(Arrays.asList("noSessionCreation"));
        //↑ 关键：全局配置NoSessionCreationFilter，把整个项目切换成无状态服务。

        factoryBean.setSecurityManager(securityManager);
        factoryBean.setFilterChainDefinitionMap(filterRuleMap);
        return factoryBean;
    }*/

    @Bean
    protected Authorizer authorizer() {
        ModularRealmAuthorizer authorizer = new ModularRealmAuthorizer();
        return authorizer;
    }

//    @Resource
//    private MyRealm myRealm;
//
//    // 配置SecurityManager
//    @Bean
//    public DefaultWebSecurityManager defaultWebSecurityManager() {
//        //1创建对象
//        DefaultWebSecurityManager defaultWebSecurityManager = new DefaultWebSecurityManager();
//        //4将myRealm存入
//        defaultWebSecurityManager.setRealm(myRealm);
//        //4.5设置rememberMe
//        defaultWebSecurityManager.setRememberMeManager(rememberMeManager());
//        //4.6设置缓存管理器
////        defaultWebSecurityManager.setCacheManager(getEhCacheManager());
//        //5返回
//        return defaultWebSecurityManager;
//    }
//
//
//
//
//    //缓存管理器
////    public EhCacheManager getEhCacheManager(){
////        EhCacheManager em = new EhCacheManager();
////        InputStream is = null;
////        try {
////            is = ResourceUtils.getInputStreamForPath("classpath:ehcache/ehcache-shiro.xml");
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
////        CacheManager cacheManager = new CacheManager(is);
////        em.setCacheManager(cacheManager);
////        return em;
////    }
//
//    //cookie属性设置
//    public SimpleCookie rememberMeCookie() {
//        SimpleCookie cookie = new SimpleCookie("rememberMe");
//        //设置跨域
//        cookie.setPath("/");
//        cookie.setHttpOnly(true);
//        cookie.setMaxAge(30 * 24 * 60 * 60);
//        return cookie;
//    }
//
//    //创建shiro的cookie管理对象
//    public CookieRememberMeManager rememberMeManager() {
//        CookieRememberMeManager cookieRememberMeManager = new CookieRememberMeManager();
//        cookieRememberMeManager.setCookie(rememberMeCookie());
//        cookieRememberMeManager.setCipherKey("1234567890987654".getBytes());
//        return cookieRememberMeManager;
//    }
//
//    //配置shiro内置拦截信息
//    @Bean
//    public DefaultShiroFilterChainDefinition shiroFilterChainDefinition() {
//        DefaultShiroFilterChainDefinition definition = new DefaultShiroFilterChainDefinition();
//        // 设置不认证可以访问的资源
//        definition.addPathDefinition("/user/userLogin", "anon");
//        definition.addPathDefinition("/user/login", "anon");
//        definition.addPathDefinition("/swagger-ui/index.html", "anon");
//        //配置登出过滤器
//        definition.addPathDefinition("/logout", "logout");
//        //设置需要进行登录认证的范围
//        definition.addPathDefinition("/**", "authc");
//        //添加存在用户的过滤器rememberMe
//        definition.addPathDefinition("/**", "user");
//        return definition;
//
//    }
//
////    /**
////     * 整合Shiro thymeleaf方言
////     */
////    @Bean
////    public ShiroDialect shiroDialect() {
////        return new ShiroDialect();
////    }


}
