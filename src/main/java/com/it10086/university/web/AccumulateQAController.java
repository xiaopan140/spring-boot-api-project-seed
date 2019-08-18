package com.it10086.university.web;
import com.it10086.university.core.Result;
import com.it10086.university.core.ResultGenerator;
import com.it10086.university.model.AccumulateQA;
import com.it10086.university.service.AccumulateQAService;
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
@RequestMapping("/accumulateQA")
public class AccumulateQAController {
    @Resource
    private AccumulateQAService accumulateQAService;

    @PostMapping("/byArea")
    public Result byArea(@RequestParam(defaultValue = "-1") Integer statisDay,@RequestParam(defaultValue = "-1") String isOpenData) {
        List<Map<String, Object>> list = accumulateQAService.byArea(statisDay,isOpenData);
        return ResultGenerator.genSuccessResult(list);
    }

    @PostMapping("/byUniversity")
    public Result byUniversity(@RequestParam(defaultValue = "-1") Integer statisDay, @RequestParam() String areaCode,@RequestParam(defaultValue = "-1") String isOpenData) {
        List<Map<String, Object>> list = accumulateQAService.byUniversity(statisDay,areaCode,isOpenData);
        return ResultGenerator.genSuccessResult(list);
    }
}
