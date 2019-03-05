package com.north.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.north.entity.sys.SysRole;

import java.util.List;

public interface SysRoleService extends IService<SysRole> {

    List<SysRole> getRoleByResourceId(int resourceId) ;

}