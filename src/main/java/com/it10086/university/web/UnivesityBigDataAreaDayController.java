package com.it10086.university.web;
import com.it10086.university.core.Result;
import com.it10086.university.core.ResultGenerator;
import com.it10086.university.model.UnivesityBigDataAreaDay;
import com.it10086.university.service.UnivesityBigDataAreaDayService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
* Created by CodeGenerator on 2019/08/19.
*/
@RestController
@RequestMapping("/universityBigDataAreaDay")
public class UnivesityBigDataAreaDayController {
    @Resource
    private UnivesityBigDataAreaDayService univesityBigDataAreaDayService;

    @PostMapping("/byPortion")
    public Result byPortion() {
        List<Map<String, Object>> list = univesityBigDataAreaDayService.byAreaForPortion();
        return ResultGenerator.genSuccessResult(list);
    }
    @PostMapping("/byApp")
    public Result byApp(@RequestParam(defaultValue = "-1") Integer statisDay) {
        List<Map<String, Object>> list = univesityBigDataAreaDayService.byAreaForApp(statisDay);
        return ResultGenerator.genSuccessResult(list);
    }
    @PostMapping("/byKeyMan")
    public Result byKeyMan(@RequestParam(defaultValue = "-1") Integer statisDay) {
        List<Map<String, Object>> list = univesityBigDataAreaDayService.byAreaForKeyMan(statisDay);
        return ResultGenerator.genSuccessResult(list);
    }
    @PostMapping("/byRentention")
    public Result byRentention(@RequestParam(defaultValue = "-1") Integer statisDay) {
        List<Map<String, Object>> list = univesityBigDataAreaDayService.byAreaRetention(statisDay);
        return ResultGenerator.genSuccessResult(list);
    }
}
