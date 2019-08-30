package com.it10086.university.service;
import com.it10086.university.model.UnivesityBigDataAreaDay;
import com.it10086.university.core.Service;

import java.util.List;
import java.util.Map;


/**
 * Created by CodeGenerator on 2019/08/19.
 */
public interface UnivesityBigDataAreaDayService extends Service<UnivesityBigDataAreaDay> {
    public abstract List<Map<String, Object>> byAreaForPortion(String authCode);
    public abstract List<Map<String, Object>> byAreaForApp(int statisDay,String authCode);
    public abstract List<Map<String, Object>> byAreaForKeyMan(int statisDay,String authCode);
    public abstract List<Map<String, Object>> byAreaRetention(int statisDay,String authCode);
}
