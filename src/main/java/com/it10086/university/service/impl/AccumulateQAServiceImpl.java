package com.it10086.university.service.impl;

import com.it10086.university.dao.AccumulateQAMapper;
import com.it10086.university.model.AccumulateQA;
import com.it10086.university.service.AccumulateQAService;
import com.it10086.university.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


/**
 * Created by CodeGenerator on 2019/08/18.
 */
@Service
@Transactional
public class AccumulateQAServiceImpl extends AbstractService<AccumulateQA> implements AccumulateQAService {
    @Resource
    private AccumulateQAMapper accumulateQAMapper;

    @Override
    public List<Map<String, Object>> byArea(int statisDay, String isOpenData) {
        return accumulateQAMapper.byArea(statisDay,isOpenData);
    }

    @Override
    public List<Map<String, Object>> byUniversity(int statisDay, String areaCode, String isOpenData) {
        return accumulateQAMapper.byUniversity(statisDay,areaCode,isOpenData);
    }
}
