package com.it10086.university.service;
import com.it10086.university.model.AccumulateCurrentData;
import com.it10086.university.core.Service;

import java.util.List;
import java.util.Map;


/**
 * Created by CodeGenerator on 2019/08/18.
 */
public interface AccumulateCurrentDataService extends Service<AccumulateCurrentData> {
    public abstract List<Map<String, Object>> byArea(int dataTime,String isOpenData,String authCode);
    public abstract List<Map<String, Object>> byUniversity(int dataTime, String areaCode,String isOpenData);
}
