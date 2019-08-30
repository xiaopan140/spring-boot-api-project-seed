package com.it10086.university.service.impl;

import com.it10086.university.dao.CurrentDataMapper;
import com.it10086.university.model.CurrentData;
import com.it10086.university.service.CurrentDataService;
import com.it10086.university.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


/**
 * Created by CodeGenerator on 2019/08/17.
 */
@Service
@Transactional
public class CurrentDataServiceImpl extends AbstractService<CurrentData> implements CurrentDataService {
    @Resource
    private CurrentDataMapper currentDataMapper;

    @Override
    public List<Map<String, Object>> byArea(int dataTime,String authCode) {
        return currentDataMapper.byArea(dataTime,authCode);
    }

    @Override
    public List<Map<String, Object>> byUniversity(int dataTime, String areaCode) {
        return currentDataMapper.byUniversity(dataTime,areaCode);
    }

    @Override
    public List<Map<String, Object>> bySingalUniversity(int dataTime, String universityCode) {
        return currentDataMapper.bySingalUniversity(dataTime,universityCode);
    }
}
