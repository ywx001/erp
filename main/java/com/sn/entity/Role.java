package com.sn.entity;


import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

/**
 * 角色表:用于权限的限制(Role)表实体类
 *
 * @author makejava
 * @since 2023-07-11 08:52:03
 */
@SuppressWarnings("serial")
public class Role extends Model<Role> {

    private Integer id;
    //角色名
    private String rolename;
    //此角色下所有的权限的id的集合（包含父菜单）
    private String privilegeids;
    //角色描述
    private String roledescribe;
    //被引用的次数，>0时不能被删除
    private Integer isInvoked;
    //特殊权限id集合
    private String otherprivilegeids;
    //是否展示全部出入库
    private Integer inoutstate;
    //是否伪删除标识 0 否 1 是
    private Integer softdeleteflag;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public String getPrivilegeids() {
        return privilegeids;
    }

    public void setPrivilegeids(String privilegeids) {
        this.privilegeids = privilegeids;
    }

    public String getRoledescribe() {
        return roledescribe;
    }

    public void setRoledescribe(String roledescribe) {
        this.roledescribe = roledescribe;
    }

    public Integer getIsInvoked() {
        return isInvoked;
    }

    public void setIsInvoked(Integer isInvoked) {
        this.isInvoked = isInvoked;
    }

    public String getOtherprivilegeids() {
        return otherprivilegeids;
    }

    public void setOtherprivilegeids(String otherprivilegeids) {
        this.otherprivilegeids = otherprivilegeids;
    }

    public Integer getInoutstate() {
        return inoutstate;
    }

    public void setInoutstate(Integer inoutstate) {
        this.inoutstate = inoutstate;
    }

    public Integer getSoftdeleteflag() {
        return softdeleteflag;
    }

    public void setSoftdeleteflag(Integer softdeleteflag) {
        this.softdeleteflag = softdeleteflag;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.id;
    }
}

