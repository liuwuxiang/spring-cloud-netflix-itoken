package com.lwx.itoken.service.digiccy.service.impl;

import com.lwx.itoken.common.domain.TbDigiccyExchange;
import com.lwx.itoken.common.service.impl.BaseServiceImpl;
import com.lwx.itoken.service.digiccy.mapper.TbDigiccyExchangeExtendMapper;
import com.lwx.itoken.service.digiccy.service.DigiccyExchangeService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class DigiccyExchangeServiceImpl extends BaseServiceImpl<TbDigiccyExchange, TbDigiccyExchangeExtendMapper> implements DigiccyExchangeService {
}
