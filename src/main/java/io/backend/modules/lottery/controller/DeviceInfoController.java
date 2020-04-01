package io.backend.modules.lottery.controller;

import io.backend.common.utils.PageUtils;
import io.backend.common.utils.R;
import io.backend.modules.lottery.entity.DeviceInfoEntity;
import io.backend.modules.lottery.service.DeviceInfoService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;



/**
 * 设备信息
 *
 * @author srq
 * @email siruiqi@siruiqi.com
 * @date 2020-01-20 13:51:20
 */
@RestController
@RequestMapping("lottery/deviceinfo")
public class DeviceInfoController {
    @Autowired
    private DeviceInfoService deviceInfoService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("lottery:deviceinfo:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = deviceInfoService.queryPage(params);
        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("lottery:deviceinfo:info")
    public R info(@PathVariable("id") Long id){
		DeviceInfoEntity deviceInfo = deviceInfoService.getById(id);

        return R.ok().put("deviceInfo", deviceInfo);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
//    @RequiresPermissions("lottery:deviceinfo:save")
    public R save(@RequestBody DeviceInfoEntity deviceInfo){
        System.out.println("执行");
        deviceInfoService.save(deviceInfo);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("lottery:deviceinfo:update")
    public R update(@RequestBody DeviceInfoEntity deviceInfo){
		deviceInfoService.updateById(deviceInfo);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("lottery:deviceinfo:delete")
    public R delete(@RequestBody Long[] ids){
		deviceInfoService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
