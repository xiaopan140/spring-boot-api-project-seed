package com.it10086.university.service.impl;

import com.it10086.university.dao.UniversityAccumunateDayMapper;
import com.it10086.university.model.UniversityAccumunateDay;
import com.it10086.university.service.UniversityAccumunateDayService;
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
public class UniversityAccumunateDayServiceImpl extends AbstractService<UniversityAccumunateDay> implements UniversityAccumunateDayService {
    @Resource
    private UniversityAccumunateDayMapper universityAccumunateDayMapper;
    @Override
    public List<Map<String, Object>> byArea(int statisDay, String isOpenData, String authCode) {
        return universityAccumunateDayMapper.byArea(statisDay,isOpenData,authCode);
    }

    @Override
    public List<Map<String, Object>> byUniversity(int statisDay, String areaCode, String isOpenData) {
        return universityAccumunateDayMapper.byUniversity(statisDay,areaCode,isOpenData);
    }

}
