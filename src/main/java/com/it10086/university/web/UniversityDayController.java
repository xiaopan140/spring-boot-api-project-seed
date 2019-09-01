package com.it10086.university.web;
import com.alibaba.fastjson.JSONObject;
import com.it10086.university.core.Result;
import com.it10086.university.core.ResultGenerator;
import com.it10086.university.model.UniversityDay;
import com.it10086.university.service.UniversityDayService;
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
* Created by CodeGenerator on 2019/08/31.
*/
@RestController
@RequestMapping("/accumulateCurrentData")
public class UniversityDayController {
    @Resource
    private UniversityDayService universityDayService;

    @PostMapping("/byArea")
    public Result byArea(HttpServletRequest request) {
        JSONObject jsonObject = JsonPara.getJSONParam(request);
        String statisDay2=jsonObject.get("statisDay").toString();
        String authCode=jsonObject.get("authCode").toString();
        Integer statisDay=Integer.parseInt(statisDay2);
        List<Map<String, Object>> list = universityDayService.byArea(statisDay,authCode);
        return ResultGenerator.genSuccessResult(list);
    }

    @PostMapping("/byUniversity")
    public Result byUniversity(HttpServletRequest request){
        JSONObject jsonObject = JsonPara.getJSONParam(request);
        String statisDay2=jsonObject.get("statisDay").toString();
        String areaCode=jsonObject.get("areaCode").toString();
        Integer statisDay=Integer.parseInt(statisDay2);
        List<Map<String, Object>> list = universityDayService.byUniversity(statisDay,areaCode);
        return ResultGenerator.genSuccessResult(list);
    }

}
