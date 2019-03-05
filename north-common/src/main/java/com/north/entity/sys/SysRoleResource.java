package com.north.entity.sys;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

public class SysRoleResource {
    @TableId(type=IdType.ID_WORKER_STR)
    private String id;
    private String roleId;
    private String resourceId;

    public SysRoleResource setId(String id){
        this.id = id;
        return this;
    }
    public String getId(){
        return this.id;
    }

    public SysRoleResource setRoleId(String roleId){
        this.roleId = roleId;
        return this;
    }
    public String getRoleId(){
        return this.roleId;
    }

    public SysRoleResource setResourceId(String resourceId){
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId(){
        return this.resourceId;
    }

    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
    	sb.append("SysRoleResource[");
        sb.append("id=" + id + ", ");
        sb.append("roleId=" + roleId + ", ");
        sb.append("resourceId=" + resourceId + ", ");
    	sb.append("]");
        return sb.toString();
    }
}