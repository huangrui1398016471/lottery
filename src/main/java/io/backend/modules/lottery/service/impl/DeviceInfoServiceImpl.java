package io.backend.modules.lottery.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import io.backend.common.utils.PageUtils;
import io.backend.common.utils.Query;

import io.backend.modules.lottery.dao.DeviceInfoDao;
import io.backend.modules.lottery.entity.DeviceInfoEntity;
import io.backend.modules.lottery.service.DeviceInfoService;


@Service("deviceInfoService")
public class DeviceInfoServiceImpl extends ServiceImpl<DeviceInfoDao, DeviceInfoEntity> implements DeviceInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<DeviceInfoEntity> page = this.page(
                new Query<DeviceInfoEntity>().getPage(params),
                new QueryWrapper<DeviceInfoEntity>()
        );

        return new PageUtils(page);
    }

}