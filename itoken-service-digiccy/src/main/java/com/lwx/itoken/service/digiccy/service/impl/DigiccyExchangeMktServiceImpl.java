package com.lwx.itoken.service.digiccy.service.impl;

import com.lwx.itoken.common.domain.TbDigiccyExchangeMkt;
import com.lwx.itoken.common.mapper.TbDigiccyExchangeMktMapper;
import com.lwx.itoken.common.service.impl.BaseServiceImpl;
import com.lwx.itoken.service.digiccy.service.DigiccyExchangeMktService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class DigiccyExchangeMktServiceImpl extends BaseServiceImpl<TbDigiccyExchangeMkt, TbDigiccyExchangeMktMapper> implements DigiccyExchangeMktService {
}
