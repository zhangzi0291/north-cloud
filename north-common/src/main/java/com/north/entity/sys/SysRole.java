package com.north.entity.sys;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

import java.util.List;

public class SysRole {
    @TableId(type=IdType.ID_WORKER_STR)
    private String id;
    private String roleName;
    private String roleDesc;
    private String status;
    @TableField(exist = false)
    private List<SysResource> resourceList;
    public SysRole setId(String id){
        this.id = id;
        return this;
    }
    public String getId(){
        return this.id;
    }

    public SysRole setRoleName(String roleName){
        this.roleName = roleName;
        return this;
    }
    public String getRoleName(){
        return this.roleName;
    }

    public SysRole setRoleDesc(String roleDesc){
        this.roleDesc = roleDesc;
        return this;
    }
    public String getRoleDesc(){
        return this.roleDesc;
    }

    public SysRole setStatus(String status){
        this.status = status;
        return this;
    }
    public String getStatus(){
        return this.status;
    }

    public List<SysResource> getResourceList() {
        return resourceList;
    }

    public void setResourceList(List<SysResource> resourceList) {
        this.resourceList = resourceList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
    	sb.append("SysRole[");
        sb.append("id=" + id + ", ");
        sb.append("roleName=" + roleName + ", ");
        sb.append("roleDesc=" + roleDesc + ", ");
        sb.append("status=" + status + ", ");
    	sb.append("]");
        return sb.toString();
    }
}