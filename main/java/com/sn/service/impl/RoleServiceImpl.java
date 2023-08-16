package com.sn.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sn.dao.RoleDao;
import com.sn.entity.Role;
import com.sn.service.RoleService;
import org.springframework.stereotype.Service;

/**
 * 角色表:用于权限的限制(Role)表服务实现类
 *
 * @author makejava
 * @since 2023-07-11 08:52:05
 */
@Service("roleService")
public class RoleServiceImpl extends ServiceImpl<RoleDao, Role> implements RoleService {

}

