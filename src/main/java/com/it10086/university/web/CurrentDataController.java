package com.it10086.university.web;
import com.it10086.university.core.Result;
import com.it10086.university.core.ResultGenerator;
import com.it10086.university.model.CurrentData;
import com.it10086.university.service.CurrentDataService;
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
* Created by CodeGenerator on 2019/08/17.
*/
@RestController
@RequestMapping("/currentData")
public class CurrentDataController {
    @Resource
    private CurrentDataService currentDataService;

    @PostMapping("/byArea")
    public Result byArea(@RequestParam(defaultValue = "-1") Integer dataTime) {
        List<Map<String, Object>> list = currentDataService.byArea(dataTime);
        return ResultGenerator.genSuccessResult(list);
    }

    @PostMapping("/byUniversity")
    public Result byUniversity(@RequestParam(defaultValue = "-1") Integer dataTime, @RequestParam() String areaCode) {
        List<Map<String, Object>> list = currentDataService.byUniversity(dataTime,areaCode);
        return ResultGenerator.genSuccessResult(list);
    }

    @PostMapping("/bySingalUniversity")
    public Result bySingalUniversity(@RequestParam(defaultValue = "-1") Integer dataTime, @RequestParam() String universityCode) {
        List<Map<String, Object>> list = currentDataService.bySingalUniversity(dataTime,universityCode);
        return ResultGenerator.genSuccessResult(list);
    }
}
