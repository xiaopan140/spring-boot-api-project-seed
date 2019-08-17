package com.it10086.university.service.impl;

import com.it10086.university.dao.TestMapper;
import com.it10086.university.model.GroupTest;
import com.it10086.university.model.Test;
import com.it10086.university.service.TestService;
import com.it10086.university.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by CodeGenerator on 2019/08/15.
 */
@Service
@Transactional
public class TestServiceImpl extends AbstractService<Test> implements TestService {
    @Resource
    private TestMapper testMapper;

    public List<GroupTest> groupTest(int id){
        return testMapper.groupTest(id);
    }
}
