package com.lwx.itoken.service.sso.service.consumer;

import com.lwx.itoken.service.sso.service.consumer.fallback.RedisCacheServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 功能说明:数据缓存熔断器
 * @author 刘武祥
 * @date 2019/8/22 0022 13:55
 */
@FeignClient(value = "itoken-service-redis", fallback = RedisCacheServiceFallback.class)
public interface RedisCacheService {

    /**
     * 功能说明:
     *
     * @param key
     * @param value
     * @param seconds
     * @return java.lang.String
     * @author 刘武祥
     * @date 2019/8/22 0022 13:53
     */
    @RequestMapping(value = "put", method = RequestMethod.POST)
    public String put(
            @RequestParam(value = "key") String key,
            @RequestParam(value = "value") String value,
            @RequestParam(value = "seconds") long seconds);

    @RequestMapping(value = "get", method = RequestMethod.GET)
    public String get(@RequestParam(value = "key") String key);
}
