package com.it10086.university.service.impl;

import com.it10086.university.dao.UnivesityRealHourMapper;
import com.it10086.university.model.UnivesityRealHour;
import com.it10086.university.service.UnivesityRealHourService;
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
public class UnivesityRealHourServiceImpl extends AbstractService<UnivesityRealHour> implements UnivesityRealHourService {
    @Resource
    private UnivesityRealHourMapper universityRealHourMapper;

    @Override
    public List<Map<String, Object>> byArea(int dataTime, String authCode) {
        return universityRealHourMapper.byArea(dataTime,authCode);
    }

    @Override
    public List<Map<String, Object>> byUniversity(int dataTime, String areaCode) {
        return universityRealHourMapper.byUniversity(dataTime,areaCode);
    }

    @Override
    public List<Map<String, Object>> bySingalUniversity(int dataTime, String universityCode) {
        return universityRealHourMapper.bySingalUniversity(dataTime,universityCode);
    }
}
