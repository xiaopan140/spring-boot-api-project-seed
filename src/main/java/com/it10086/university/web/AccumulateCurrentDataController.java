package com.it10086.university.web;
import com.it10086.university.core.Result;
import com.it10086.university.core.ResultGenerator;
import com.it10086.university.model.AccumulateCurrentData;
import com.it10086.university.service.AccumulateCurrentDataService;
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
* Created by CodeGenerator on 2019/08/18.
*/
@RestController
@RequestMapping("/accumulateCurrentData")
public class AccumulateCurrentDataController {
    @Resource
    private AccumulateCurrentDataService accumulateCurrentDataService;

    @PostMapping("/byArea")
    public Result byArea(@RequestParam(defaultValue = "-1") Integer dataTime,@RequestParam(defaultValue = "-1") String isOpenData) {
        List<Map<String, Object>> list = accumulateCurrentDataService.byArea(dataTime,isOpenData);
        return ResultGenerator.genSuccessResult(list);
    }

    @PostMapping("/byUniversity")
    public Result byUniversity(@RequestParam(defaultValue = "-1") Integer dataTime, @RequestParam() String areaCode,@RequestParam(defaultValue = "-1") String isOpenData) {
        List<Map<String, Object>> list = accumulateCurrentDataService.byUniversity(dataTime,areaCode,isOpenData);
        return ResultGenerator.genSuccessResult(list);
    }
}
