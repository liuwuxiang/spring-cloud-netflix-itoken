package com.lwx.itoken.service.sso.service.impl;

import com.lwx.itoken.common.domain.TbSysUser;
import com.lwx.itoken.common.utils.MapperUtils;
import com.lwx.itoken.service.sso.mapper.TbSysUserMapper;
import com.lwx.itoken.service.sso.service.LoginService;
import com.lwx.itoken.service.sso.service.consumer.RedisCacheService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;
import tk.mybatis.mapper.entity.Example;
/**
 * 功能说明:登录业务实现
 * @author 刘武祥
 * @date 2019/8/22 0022 14:00
 */
@Service
public class LoginServiceImpl implements LoginService {
    /**
     * 日志
     */
    private static final Logger logger = LoggerFactory.getLogger(LoginServiceImpl.class);

    @Autowired
    private RedisCacheService redisService;

    @Autowired
    private TbSysUserMapper tbSysUserMapper;

    /**
     * 功能说明:登录
     *
     * @param loginCode     账号
     * @param plantPassword 密码
     * @return com.lwx.itoken.common.domain.TbSysUser
     * @author 刘武祥
     * @date 2019/8/22 0022 14:02
     */
    @Override
    public TbSysUser login(String loginCode, String plantPassword) {
        TbSysUser tbSysUser = null;

        String json = redisService.get(loginCode);

        // 缓存中没有数据，从数据库取数据
        if (json == null) {
            Example example = new Example(TbSysUser.class);
            example.createCriteria().andEqualTo("loginCode", loginCode);

            tbSysUser = tbSysUserMapper.selectOneByExample(example);
            String password = DigestUtils.md5DigestAsHex(plantPassword.getBytes());
            if (tbSysUser != null && password.equals(tbSysUser.getPassword())) {
                try {
                    redisService.put(loginCode, MapperUtils.obj2json(tbSysUser), 60 * 60 * 24);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return tbSysUser;
            }

            else {
                return null;
            }
        }

        // 缓存中有数据
        else {
            try {
                tbSysUser = MapperUtils.json2pojo(json, TbSysUser.class);
            } catch (Exception e) {
                logger.warn("触发熔断：{}", e.getMessage());
            }
        }

        return tbSysUser;
    }
}
