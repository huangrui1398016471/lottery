package io.backend.modules.lottery.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.backend.common.utils.PageUtils;
import io.backend.modules.lottery.entity.DeviceInfoEntity;

import java.util.Map;

/**
 * 设备信息
 *
 * @author srq
 * @email siruiqi@siruiqi.com
 * @date 2020-01-20 13:51:20
 */
public interface DeviceInfoService extends IService<DeviceInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

