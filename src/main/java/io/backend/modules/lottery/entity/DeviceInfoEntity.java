package io.backend.modules.lottery.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 设备信息
 * 
 * @author srq
 * @email siruiqi@siruiqi.com
 * @date 2020-01-20 13:51:20
 */
@Data
@TableName("lt_device_info")
public class DeviceInfoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 编号
	 */
	@TableId
	private Long id;
	/**
	 * 外部存储是否可用
	 */
	private String isExternalStorageAvailable;
	/**
	 * cpu占用率
	 */
	private String cpuUsed;
	/**
	 * 可用内存
	 */
	private String availMemory;
	/**
	 * 总内存
	 */
	private String totalMemory;
	/**
	 * 内部可用空间
	 */
	private String availableInternalMemorySize;
	/**
	 * 内部总空间
	 */
	private String totalInternalMemorySize;
	/**
	 * 外部可用空间
	 */
	private String availableExternalMemorySize;
	/**
	 * 外部总空间
	 */
	private String totalExternalMemorySize;
	/**
	 * 设备唯一标识
	 */
	private String deviceId;

}
