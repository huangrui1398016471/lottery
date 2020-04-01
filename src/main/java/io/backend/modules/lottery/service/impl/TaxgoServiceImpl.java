package io.backend.modules.lottery.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.backend.common.utils.PageUtils;
import io.backend.common.utils.Query;

import io.backend.modules.lottery.dao.TaxgoDao;
import io.backend.modules.lottery.entity.TaxgoEntity;
import io.backend.modules.lottery.service.TaxgoService;


@Service("taxgoService")
public class TaxgoServiceImpl extends ServiceImpl<TaxgoDao, TaxgoEntity> implements TaxgoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<TaxgoEntity> page = this.page(
                new Query<TaxgoEntity>().getPage(params),
                new QueryWrapper<TaxgoEntity>()
        );

        return new PageUtils(page);
    }

}