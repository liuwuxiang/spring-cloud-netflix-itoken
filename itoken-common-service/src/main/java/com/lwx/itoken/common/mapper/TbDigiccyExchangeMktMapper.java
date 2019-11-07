package com.lwx.itoken.common.mapper;

import com.lwx.itoken.common.domain.TbDigiccyExchangeMkt;
import com.lwx.itoken.common.utils.RedisCache;
import org.apache.ibatis.annotations.CacheNamespace;
import tk.mybatis.mapper.MyMapper;

@CacheNamespace(implementation = RedisCache.class)
public interface TbDigiccyExchangeMktMapper extends MyMapper<TbDigiccyExchangeMkt> {
}