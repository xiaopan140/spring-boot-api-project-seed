package com.it10086.university.web;
import com.alibaba.fastjson.JSONObject;
import com.it10086.university.core.Result;
import com.it10086.university.core.ResultGenerator;
import com.it10086.university.model.UnivesityBigDataAreaDay;
import com.it10086.university.service.UnivesityBigDataAreaDayService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.it10086.university.util.JsonPara;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
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
    public Result byPortion(HttpServletRequest request) {
        JSONObject jsonObject = JsonPara.getJSONParam(request);
        String authCode=jsonObject.get("authCode").toString();
        List<Map<String, Object>> list = univesityBigDataAreaDayService.byAreaForPortion(authCode);
        return ResultGenerator.genSuccessResult(list);
    }
    @PostMapping("/byApp")
    public Result byApp(HttpServletRequest request) {
        JSONObject jsonObject = JsonPara.getJSONParam(request);
        String statisDay2=jsonObject.get("statisDay").toString();
        String authCode=jsonObject.get("authCode").toString();
        Integer statisDay=Integer.parseInt(statisDay2);
        List<Map<String, Object>> list = univesityBigDataAreaDayService.byAreaForApp(statisDay,authCode);
        return ResultGenerator.genSuccessResult(list);
    }
    @PostMapping("/byKeyMan")
    public Result byKeyMan(HttpServletRequest request) {
        JSONObject jsonObject = JsonPara.getJSONParam(request);
        String statisDay2=jsonObject.get("statisDay").toString();
        String authCode=jsonObject.get("authCode").toString();
        Integer statisDay=Integer.parseInt(statisDay2);
        List<Map<String, Object>> list = univesityBigDataAreaDayService.byAreaForKeyMan(statisDay,authCode);
        return ResultGenerator.genSuccessResult(list);
    }
    @PostMapping("/byRentention")
    public Result byRentention(HttpServletRequest request) {
        JSONObject jsonObject = JsonPara.getJSONParam(request);
        String statisDay2=jsonObject.get("statisDay").toString();
        String authCode=jsonObject.get("authCode").toString();
        Integer statisDay=Integer.parseInt(statisDay2);
        List<Map<String, Object>> list = univesityBigDataAreaDayService.byAreaRetention(statisDay,authCode);
        return ResultGenerator.genSuccessResult(list);
    }
}
