package com.it10086.university.service.impl;

import com.it10086.university.dao.AccumulateCurrentDataMapper;
import com.it10086.university.model.AccumulateCurrentData;
import com.it10086.university.service.AccumulateCurrentDataService;
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
public class AccumulateCurrentDataServiceImpl extends AbstractService<AccumulateCurrentData> implements AccumulateCurrentDataService {
    @Resource
    private AccumulateCurrentDataMapper accumulateCurrentDataMapper;

    @Override
    public List<Map<String, Object>> byArea(int dataTime,String isOpenData) {
        return accumulateCurrentDataMapper.byArea(dataTime,isOpenData);
    }

    @Override
    public List<Map<String, Object>> byUniversity(int dataTime, String areaCode,String isOpenData) {
        return accumulateCurrentDataMapper.byUniversity(dataTime,areaCode,isOpenData);
    }
}
