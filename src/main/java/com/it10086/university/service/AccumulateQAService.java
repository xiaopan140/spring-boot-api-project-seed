package com.it10086.university.service;
import com.it10086.university.model.AccumulateQA;
import com.it10086.university.core.Service;

import java.util.List;
import java.util.Map;


/**
 * Created by CodeGenerator on 2019/08/18.
 */
public interface AccumulateQAService extends Service<AccumulateQA> {
    public abstract List<Map<String, Object>> byArea(int statisDay, String isOpenData,String authCode);
    public abstract List<Map<String, Object>> byUniversity(int statisDay, String areaCode,String isOpenData);
}
