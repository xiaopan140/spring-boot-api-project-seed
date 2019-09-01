package com.it10086.university.service.impl;

import com.it10086.university.dao.UniversityDayMapper;
import com.it10086.university.model.UniversityDay;
import com.it10086.university.service.UniversityDayService;
import com.it10086.university.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


/**
 * Created by CodeGenerator on 2019/08/31.
 */
@Service
@Transactional
public class UniversityDayServiceImpl extends AbstractService<UniversityDay> implements UniversityDayService {
    @Resource
    private UniversityDayMapper universityDayMapper;

    @Override
    public List<Map<String, Object>> byArea(int dataTime, String authCode) {
        return universityDayMapper.byArea(dataTime,authCode);
    }

    @Override
    public List<Map<String, Object>> byUniversity(int dataTime, String areaCode) {
        return universityDayMapper.byUniversity(dataTime,areaCode);
    }
}
