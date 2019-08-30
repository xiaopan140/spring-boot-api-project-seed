package com.it10086.university.web;
import com.alibaba.fastjson.JSONObject;
import com.it10086.university.core.Result;
import com.it10086.university.core.ResultGenerator;
import com.it10086.university.model.CurrentData;
import com.it10086.university.service.CurrentDataService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.it10086.university.util.JsonPara;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
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
    public Result byArea(HttpServletRequest request) {
        JSONObject jsonObject = JsonPara.getJSONParam(request);
        String statisDay2=jsonObject.get("statisDay").toString();
        String authCode=jsonObject.get("authCode").toString();
        Integer statisDay=Integer.parseInt(statisDay2);
        List<Map<String, Object>> list = currentDataService.byArea(statisDay,authCode);
        return ResultGenerator.genSuccessResult(list);
    }

    @PostMapping("/byUniversity")
    public Result byUniversity(HttpServletRequest request){
        JSONObject jsonObject = JsonPara.getJSONParam(request);
        String statisDay2=jsonObject.get("statisDay").toString();
        String areaCode=jsonObject.get("areaCode").toString();
        Integer statisDay=Integer.parseInt(statisDay2);
        List<Map<String, Object>> list = currentDataService.byUniversity(statisDay,areaCode);
        return ResultGenerator.genSuccessResult(list);
    }

    @PostMapping("/bySingalUniversity")
    public Result bySingalUniversity(HttpServletRequest request){
        JSONObject jsonObject = JsonPara.getJSONParam(request);
        String statisDay2=jsonObject.get("statisDay").toString();
        String universityCode=jsonObject.get("universityCode").toString();
        Integer statisDay=Integer.parseInt(statisDay2);
        List<Map<String, Object>> list = currentDataService.bySingalUniversity(statisDay,universityCode);
        return ResultGenerator.genSuccessResult(list);
    }
}
