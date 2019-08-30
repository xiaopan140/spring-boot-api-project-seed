package com.it10086.university.web;
import com.alibaba.fastjson.JSONObject;
import com.it10086.university.core.Result;
import com.it10086.university.core.ResultGenerator;
import com.it10086.university.model.AccumulateQA;
import com.it10086.university.service.AccumulateQAService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.it10086.university.util.JsonPara;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
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
    public Result byArea(HttpServletRequest request){
        JSONObject jsonObject = JsonPara.getJSONParam(request);
        String statisDay2=jsonObject.get("statisDay").toString();
        String isOpenData=jsonObject.get("isOpenData").toString();
        String authCode=jsonObject.get("authCode").toString();
        Integer statisDay=Integer.parseInt(statisDay2);
        List<Map<String, Object>> list = accumulateQAService.byArea(statisDay,isOpenData,authCode);
        return ResultGenerator.genSuccessResult(list);
    }

    @PostMapping("/byUniversity")
    public Result byUniversity(HttpServletRequest request){
        JSONObject jsonObject = JsonPara.getJSONParam(request);
        String statisDay2=jsonObject.get("statisDay").toString();
        String areaCode=jsonObject.get("areaCode").toString();
        String isOpenData=jsonObject.get("isOpenData").toString();
        Integer statisDay=Integer.parseInt(statisDay2);
        List<Map<String, Object>> list = accumulateQAService.byUniversity(statisDay,areaCode,isOpenData);
        return ResultGenerator.genSuccessResult(list);
    }
}
