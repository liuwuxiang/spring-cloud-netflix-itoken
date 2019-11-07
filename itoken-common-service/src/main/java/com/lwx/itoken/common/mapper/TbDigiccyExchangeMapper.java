package com.lwx.itoken.common.mapper;

import com.lwx.itoken.common.domain.TbDigiccyExchange;
import com.lwx.itoken.common.utils.RedisCache;
import org.apache.ibatis.annotations.CacheNamespace;
import tk.mybatis.mapper.MyMapper;

@CacheNamespace(implementation = RedisCache.class)
public interface TbDigiccyExchangeMapper extends MyMapper<TbDigiccyExchange> {
}