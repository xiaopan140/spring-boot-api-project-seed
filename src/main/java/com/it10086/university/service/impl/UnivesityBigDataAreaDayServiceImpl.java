package com.it10086.university.service.impl;

import com.it10086.university.dao.UnivesityBigDataAreaDayMapper;
import com.it10086.university.model.UnivesityBigDataAreaDay;
import com.it10086.university.service.UnivesityBigDataAreaDayService;
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
public class UnivesityBigDataAreaDayServiceImpl extends AbstractService<UnivesityBigDataAreaDay> implements UnivesityBigDataAreaDayService {
    @Resource
    private UnivesityBigDataAreaDayMapper univesityBigDataAreaDayMapper;

    @Override
    public List<Map<String, Object>> byAreaForPortion() {
        return univesityBigDataAreaDayMapper.byAreaForPortion();
    }

    @Override
    public List<Map<String, Object>> byAreaForApp(int statisDay) {
        return univesityBigDataAreaDayMapper.byAreaForApp(statisDay);
    }

    @Override
    public List<Map<String, Object>> byAreaForKeyMan(int statisDay) {
        return univesityBigDataAreaDayMapper.byAreaForKeyMan(statisDay);
    }

    @Override
    public List<Map<String, Object>> byAreaRetention(int statisDay) {
        return univesityBigDataAreaDayMapper.byAreaForRetention(statisDay);
    }
}
