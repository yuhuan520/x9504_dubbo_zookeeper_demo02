package com.java.zd.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.java.zd.model.GoodsDetailEntity;
import com.java.zd.service.GoodsDetailService;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 * @author djin
 *    GoodsDetail业务层实现类
 * @date 2020-04-11 19:48:55
 */
@Service(version = "1.0.0")
@Transactional
public class GoodsDetailServiceImpl extends BaseServiceImpl<GoodsDetailEntity> implements GoodsDetailService {
	
}
