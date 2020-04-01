package io.backend.modules.lottery.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.backend.common.utils.PageUtils;
import io.backend.modules.lottery.entity.TaxgoEntity;

import java.util.Map;

/**
 * 
 *
 * @author huangrui
 * @email sunlightcs@gmail.com
 * @date 2020-04-01 12:00:50
 */
public interface TaxgoService extends IService<TaxgoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

