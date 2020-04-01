package io.backend.modules.lottery.controller;

import io.backend.common.utils.R;
import io.backend.modules.app.annotation.Login;
import io.backend.modules.lottery.entity.DeviceInfoEntity;
import io.backend.modules.lottery.service.DeviceInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 彩票机设备信息
 *
 * @author srq
 * @email siruiqi@siruiqi.com
 * @date 2020-01-20 13:51:20
 */
@RestController
@RequestMapping("app/deviceinfo")
public class AppDeviceController {

    @Autowired
    private DeviceInfoService deviceInfoService;

    /**
     * 保存
     */
    @Login
    @RequestMapping("/save")
    public R save(@RequestBody DeviceInfoEntity deviceInfo){
        deviceInfoService.save(deviceInfo);

        return R.ok();
    }
}
