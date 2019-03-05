package com.north.sys.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.north.entity.sys.SysUser;

public interface SysUserService extends IService<SysUser> {

    SysUser findByName(String username);

}