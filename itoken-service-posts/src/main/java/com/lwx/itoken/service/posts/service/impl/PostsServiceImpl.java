package com.lwx.itoken.service.posts.service.impl;

import com.lwx.itoken.common.domain.TbPostsPost;
import com.lwx.itoken.common.mapper.TbPostsPostMapper;
import com.lwx.itoken.common.service.impl.BaseServiceImpl;
import com.lwx.itoken.service.posts.service.PostsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class PostsServiceImpl extends BaseServiceImpl<TbPostsPost, TbPostsPostMapper> implements PostsService {
}
