package io.backend.modules.lottery.dao;

import io.backend.modules.lottery.entity.DeviceInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 设备信息
 * 
 * @author srq
 * @email siruiqi@siruiqi.com
 * @date 2020-01-20 13:51:20
 */
@Mapper
public interface DeviceInfoDao extends BaseMapper<DeviceInfoEntity> {
	
}
