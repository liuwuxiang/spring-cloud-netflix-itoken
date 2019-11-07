package com.lwx.itoken.service.sso.service.consumer.fallback;

import com.lwx.itoken.service.sso.service.consumer.RedisCacheService;
import org.springframework.stereotype.Component;
/**
 * 功能说明: 熔断回调方法
 * @author 刘武祥
 * @date 2019/8/22 0022 13:55
 */
@Component
public class RedisCacheServiceFallback implements RedisCacheService {
    @Override
    public String put(String key, String value, long seconds) {
        return null;
    }

    @Override
    public String get(String key) {
        return null;
    }
}
