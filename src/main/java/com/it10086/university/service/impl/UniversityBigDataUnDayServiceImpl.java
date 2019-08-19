package com.it10086.university.service.impl;

import com.it10086.university.dao.UniversityBigDataUnDayMapper;
import com.it10086.university.model.UniversityBigDataUnDay;
import com.it10086.university.service.UniversityBigDataUnDayService;
import com.it10086.university.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


/**
 * Created by CodeGenerator on 2019/08/19.
 */
@Service
@Transactional
public class UniversityBigDataUnDayServiceImpl extends AbstractService<UniversityBigDataUnDay> implements UniversityBigDataUnDayService {
    @Resource
    private UniversityBigDataUnDayMapper universityBigDataUnDayMapper;

    @Override
    public List<Map<String, Object>> byUniversityForPortion(String areaCode) {
        return universityBigDataUnDayMapper.byUniversityForPortion(areaCode);
    }

    @Override
    public List<Map<String, Object>> byUniversityForApp(int statisDay, String areaCode) {
        return universityBigDataUnDayMapper.byUniversityForApp(statisDay,areaCode);
    }

    @Override
    public List<Map<String, Object>> byUniversityForKeyMan(int statisDay, String areaCode) {
        return universityBigDataUnDayMapper.byUniversityForKeyMan(statisDay,areaCode);
    }

    @Override
    public List<Map<String, Object>> byUniversityForRetention(int statisDay, String areaCode) {
        return universityBigDataUnDayMapper.byUniversityForRetention(statisDay,areaCode);
    }
}
