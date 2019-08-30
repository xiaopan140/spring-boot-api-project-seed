package com.it10086.university.web;
import com.alibaba.fastjson.JSONObject;
import com.it10086.university.core.Result;
import com.it10086.university.core.ResultGenerator;
import com.it10086.university.model.UniversityBigDataUnDay;
import com.it10086.university.service.UniversityBigDataUnDayService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.it10086.university.util.JsonPara;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
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
    public Result byApp(HttpServletRequest request){
        JSONObject jsonObject = JsonPara.getJSONParam(request);
        String statisDay2=jsonObject.get("statisDay").toString();
        String areaCode=jsonObject.get("areaCode").toString();
        Integer statisDay=Integer.parseInt(statisDay2);
        List<Map<String, Object>> list = universityBigDataUnDayService.byUniversityForApp(statisDay, areaCode);
        return ResultGenerator.genSuccessResult(list);
    }
    @PostMapping("/byKeyMan")
    public Result byKeyMan(HttpServletRequest request){
        JSONObject jsonObject = JsonPara.getJSONParam(request);
        String statisDay2=jsonObject.get("statisDay").toString();
        String areaCode=jsonObject.get("areaCode").toString();
        Integer statisDay=Integer.parseInt(statisDay2);
        List<Map<String, Object>> list = universityBigDataUnDayService.byUniversityForKeyMan(statisDay, areaCode);
        return ResultGenerator.genSuccessResult(list);
    }
    @PostMapping("/byRentention")
    public Result byRentention(HttpServletRequest request){
        JSONObject jsonObject = JsonPara.getJSONParam(request);
        String statisDay2=jsonObject.get("statisDay").toString();
        String areaCode=jsonObject.get("areaCode").toString();
        Integer statisDay=Integer.parseInt(statisDay2);
        List<Map<String, Object>> list = universityBigDataUnDayService.byUniversityForRetention(statisDay, areaCode);
        return ResultGenerator.genSuccessResult(list);
    }
}
