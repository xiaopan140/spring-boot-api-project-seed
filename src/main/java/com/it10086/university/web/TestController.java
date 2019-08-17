package com.it10086.university.web;
import com.it10086.university.core.Result;
import com.it10086.university.model.GroupTest;
import com.it10086.university.model.Test;
import com.it10086.university.service.TestService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.List;

import static com.it10086.university.core.ResultGenerator.genSuccessResult;

/**
* Created by CodeGenerator on 2019/08/15.
*/
@RestController
@RequestMapping("/test")
public class TestController {
    @Resource
    private TestService testService;

    @PostMapping("/add")
    public Result add(Test test) {
        testService.save(test);
        return genSuccessResult();
    }

//    @PostMapping("/delete")
//    public Result delete(@RequestParam Integer id) {
//        testService.deleteById(id);
//        return genSuccessResult();
//    }

    @PostMapping("/update")
    public Result update(Test test) {
        testService.update(test);
        return genSuccessResult();
    }

//    @PostMapping("/detail")
//    public Result detail(@RequestParam Integer id) {
//        Test test = testService.findById(id);
//        return genSuccessResult(test);
//    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<Test> list = testService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        //return ResultGenerator.genSuccessResult(pageInfo);
        return genSuccessResult(list);
    }

    @PostMapping("ttt")
    public Result ttt(@RequestParam Integer id){
        List<GroupTest> list = testService.groupTest(id);
        return genSuccessResult(list);
    }
}
