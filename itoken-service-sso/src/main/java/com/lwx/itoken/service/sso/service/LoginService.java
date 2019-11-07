package com.lwx.itoken.service.sso.service;

import com.lwx.itoken.common.domain.TbSysUser;

/**
 * 登录业务
 * <p>Title: LoginService</p>
 * <p>Description: </p>
 *
 * @author 刘武祥
 * @version 1.0.0
 * @date 2018/8/8 10:48
 */
public interface LoginService {

    /**
     * 功能说明:登录
     *
     * @param loginCode     账号
     * @param plantPassword 密码
     * @return com.lwx.itoken.common.domain.TbSysUser
     * @author 刘武祥
     * @date 2019/8/22 0022 14:02
     */
    public TbSysUser login(String loginCode, String plantPassword);
}
