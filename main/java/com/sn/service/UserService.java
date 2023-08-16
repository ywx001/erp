package com.sn.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sn.entity.User;

import java.util.List;
import java.util.Map;

/**
 * 用户信息表(User)表服务接口
 *
 * @author makejava
 * @since 2023-07-10 09:12:37
 */
public interface UserService extends IService<User> {

    User getOneUser(Map<String, Object> map);

    List<String> getRoles(String account);

    List<String> getRolePermission(String roleIds);

}

