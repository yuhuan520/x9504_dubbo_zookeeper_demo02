package com.java.zd.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.transaction.annotation.Transactional;
import com.java.zd.model.GoodsSortEntity;
import com.java.zd.service.GoodsSortService;

/**
 * 
 * @author djin
 *    GoodsSort业务层实现类
 * @date 2020-04-11 19:48:56
 */
@Service(version = "1.0.0")
@Transactional
public class GoodsSortServiceImpl extends BaseServiceImpl<GoodsSortEntity> implements GoodsSortService {
	
}
