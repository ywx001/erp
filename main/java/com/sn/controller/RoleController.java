package com.sn.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sn.entity.Role;
import com.sn.service.RoleService;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 角色表:用于权限的限制(Role)表控制层
 *
 * @author makejava
 * @since 2023-07-11 08:52:02
 */
@RestController
@RequestMapping("role")
public class RoleController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private RoleService roleService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param role 查询实体
     * @return 所有数据
     */
    @Cacheable(value = "roles", key = "'roleId-' + #role.id")
    @GetMapping("list")
    @RequiresRoles( value = { "系统管理员"})
    public R selectAll(Page<Role> page, Role role) {
        return success(this.roleService.page(page, new QueryWrapper<>(role)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.roleService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param role 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody Role role) {
        return success(this.roleService.save(role));
    }

    /**
     * 修改数据
     *
     * @param role 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody Role role) {
        return success(this.roleService.updateById(role));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.roleService.removeByIds(idList));
    }
}

