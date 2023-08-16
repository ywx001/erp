package com.sn.controller;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.sn.entity.User;
import com.sn.entity.common.ResultMap;
import com.sn.service.UserService;
import com.sn.shiro.MyCheckPermissions;
import com.sn.util.JWTUtil;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 用户信息表(User)表控制层
 *
 * @author makejava
 * @since 2023-07-10 09:12:35
 */
@RestController
@RequestMapping("user")
public class UserController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    private final ResultMap resultMap;

    @Autowired
    public UserController(ResultMap resultMap) {
        this.resultMap = resultMap;
    }


    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.userService.getById(id));
    }

    /**
     * 分页查询所有数据
     *
     * @param user 查询实体
     * @return 所有数据
     */
    @MyCheckPermissions
    @GetMapping("list")
    @RequiresRoles(logical = Logical.OR, value = {"user", "系统管理员"})
    public R selectAll(@RequestParam("privilegeId") Integer privilegeId
            ,@RequestParam("selectId")  Integer selectId
            , @RequestParam(defaultValue = "1") Integer pageNum
            , @RequestParam(defaultValue = "10") Integer pageSize, User user) {
        Page<User> page = new Page<>(pageNum, pageSize);
        return success(this.userService.page(page, new QueryWrapper<>(user)));
    }

    /**
     * 新增数据
     *
     * @param user 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody User user) {
        return success(this.userService.save(user));
    }

    /**
     * 修改数据
     *
     * @param user 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody User user) {
        return success(this.userService.updateById(user));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.userService.removeByIds(idList));
    }

    /**
     * 登录
     */
    @GetMapping("/login")
    public ResultMap userLogin(@RequestParam("account") String account,
                               @RequestParam("password") String password) {
        logger.info("用户登录，account={},password={}", account, password);

        //调用业务层获取用户信息
        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<User>();
        lqw.eq(User::getAccount, account);
        User user = userService.getOne(lqw);
        if (user == null) {
            logger.warn("账号:{}不存在", account);
            return resultMap.fail().msg("账号错误");
        }
        //获取数据库中的密码
        String dbPwd = user.getPassword();
        if (!dbPwd.equals(password)) {
            logger.warn("账号:{},密码:{} 输入错误", account, password);
            return resultMap.fail().msg("密码错误");
        } else {
            return resultMap.success().msg(JWTUtil.sign(account, user.getId()));
        }

    }

    @GetMapping("test")
    @RequiresRoles(logical = Logical.OR, value = {"user", "系统管理员"})
    public R test(String roleIds) {

        return success(userService.getRolePermission(roleIds));
    }


}

