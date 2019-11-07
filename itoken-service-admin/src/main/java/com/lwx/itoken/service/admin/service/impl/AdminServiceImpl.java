package com.lwx.itoken.service.admin.service.impl;

import com.lwx.itoken.common.domain.TbSysUser;
import com.lwx.itoken.common.mapper.TbSysUserMapper;
import com.lwx.itoken.common.service.impl.BaseServiceImpl;
import com.lwx.itoken.service.admin.service.AdminService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Administrator
 */
@Service
@Transactional(readOnly = true)
public class AdminServiceImpl extends BaseServiceImpl<TbSysUser, TbSysUserMapper> implements AdminService {

}
