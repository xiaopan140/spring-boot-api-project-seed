package com.it10086.university.web;
import com.it10086.university.core.Result;
import com.it10086.university.core.ResultGenerator;
import com.it10086.university.model.UniversityBigDataUnDay;
import com.it10086.university.service.UniversityBigDataUnDayService;
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
@RequestMapping("/universityBigDataUnDay")
public class UniversityBigDataUnDayController {
    @Resource
    private UniversityBigDataUnDayService universityBigDataUnDayService;

    @PostMapping("/byPortion")
    public Result byPortion(@RequestParam() String areaCode) {
        List<Map<String, Object>> list = universityBigDataUnDayService.byUniversityForPortion(areaCode);
        return ResultGenerator.genSuccessResult(list);
    }
    @PostMapping("/byApp")
    public Result byApp(@RequestParam(defaultValue = "-1") Integer statisDay,@RequestParam() String areaCode) {
        List<Map<String, Object>> list = universityBigDataUnDayService.byUniversityForApp(statisDay, areaCode);
        return ResultGenerator.genSuccessResult(list);
    }
    @PostMapping("/byKeyMan")
    public Result byKeyMan(@RequestParam(defaultValue = "-1") Integer statisDay,@RequestParam() String areaCode) {
        List<Map<String, Object>> list = universityBigDataUnDayService.byUniversityForKeyMan(statisDay, areaCode);
        return ResultGenerator.genSuccessResult(list);
    }
    @PostMapping("/byRentention")
    public Result byRentention(@RequestParam(defaultValue = "-1") Integer statisDay,@RequestParam() String areaCode) {
        List<Map<String, Object>> list = universityBigDataUnDayService.byUniversityForRetention(statisDay, areaCode);
        return ResultGenerator.genSuccessResult(list);
    }
}
