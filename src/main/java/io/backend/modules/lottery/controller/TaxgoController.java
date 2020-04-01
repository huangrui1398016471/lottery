package io.backend.modules.lottery.controller;

import java.util.Arrays;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.backend.modules.lottery.entity.TaxgoEntity;
import io.backend.modules.lottery.service.TaxgoService;
import io.backend.common.utils.PageUtils;
import io.backend.common.utils.R;



/**
 * 
 *
 * @author huangrui
 * @email sunlightcs@gmail.com
 * @date 2020-04-01 12:00:50
 */
@RestController
@RequestMapping("lottery/taxgo")
public class TaxgoController {
    @Autowired
    private TaxgoService taxgoService;

    /**
     * 列表
     */
    @RequestMapping("/list")
//    @RequiresPermissions("lottery:taxgo:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = taxgoService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
//    @RequiresPermissions("lottery:taxgo:info")
    public R info(@PathVariable("id") Integer id){
		TaxgoEntity taxgo = taxgoService.getById(id);

        return R.ok().put("taxgo", taxgo);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
//    @RequiresPermissions("lottery:taxgo:save")
    public R save(@RequestBody TaxgoEntity taxgo){
		taxgoService.save(taxgo);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
//    @RequiresPermissions("lottery:taxgo:update")
    public R update(@RequestBody TaxgoEntity taxgo){
		taxgoService.updateById(taxgo);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
//    @RequiresPermissions("lottery:taxgo:delete")
    public R delete(@RequestBody Integer[] ids){
		taxgoService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
