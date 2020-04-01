package io.backend.modules.lottery.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author huangrui
 * @email sunlightcs@gmail.com
 * @date 2020-04-01 12:00:50
 */
@Data
@TableName("qrtz_taxgo")
public class TaxgoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Integer id;
	/**
	 * 
	 */
	private String ssssssssmmmuuun;
	/**
	 * 
	 */
	private String zhouqi;
	/**
	 * 
	 */
	private String tongdao;
	/**
	 * 
	 */
	private Date shangshengtime;
	/**
	 * 
	 */
	private String jishu;
	/**
	 * 
	 */
	private Date chixutime;
	/**
	 * 
	 */
	private String fuzhi;
	/**
	 * 
	 */
	private String pingjupinglv;
	/**
	 * 
	 */
	private String rms;
	/**
	 * 
	 */
	private String fengzhipinglv;
	/**
	 * 
	 */
	private String mengkan;
	/**
	 * 
	 */
	private String fanshuanpinglv;
	/**
	 * 
	 */
	private String chushipinglv;
	/**
	 * 
	 */
	private String xinhaoqiangdu;
	/**
	 * 
	 */
	private String jueduinengliang;
	/**
	 * 
	 */
	private String zhongxinpinlv;
	/**
	 * 
	 */
	private String fengpin;
	/**
	 * 
	 */
	private String fuzhiv;
	/**
	 * 
	 */
	private String ra;
	/**
	 * 
	 */
	private String lna;
	/**
	 * 
	 */
	private String lnn;
	/**
	 * 
	 */
	private String a;
	/**
	 * 
	 */
	private String a20;
	/**
	 * 
	 */
	private String lgqiuhen;
	/**
	 * 
	 */
	private String qiuhen;

}
