package com.lwx.itoken.web.admin.service.fallback;

import com.lwx.itoken.common.domain.TbSysUser;
import com.lwx.itoken.common.hystrix.Fallback;
import com.lwx.itoken.common.utils.MapperUtils;
import com.lwx.itoken.web.admin.service.AdminService;
import org.springframework.stereotype.Component;

@Component
public class AdminServiceFallback implements AdminService {

    @Override
    public String get(String userCode) {
        try {
            String json = MapperUtils.obj2json(new TbSysUser());
            return json;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String save(String tbSysUserJson, String optsBy) {
        return Fallback.badGateway();
    }

    @Override
    public String page(int pageNum, int pageSize, String tbSysUserJson) {
        return Fallback.badGateway();
    }
}
