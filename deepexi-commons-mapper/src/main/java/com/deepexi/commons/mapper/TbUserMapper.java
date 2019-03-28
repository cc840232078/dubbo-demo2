package com.deepexi.commons.mapper;

import com.deepexi.commons.domain.TbUser;
import tk.mybatis.mapper.MyMapper;

//@CacheNamespace(implementation = RedisCache.class)
public interface TbUserMapper extends MyMapper<TbUser> {
}