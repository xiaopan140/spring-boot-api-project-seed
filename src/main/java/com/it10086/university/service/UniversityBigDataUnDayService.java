package com.it10086.university.service;
import com.it10086.university.model.UniversityBigDataUnDay;
import com.it10086.university.core.Service;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * Created by CodeGenerator on 2019/08/19.
 */
public interface UniversityBigDataUnDayService extends Service<UniversityBigDataUnDay> {
    public abstract List<Map<String, Object>> byUniversityForPortion(String areaCode);
    public abstract List<Map<String, Object>> byUniversityForApp(int statisDay, String areaCode);
    public abstract List<Map<String, Object>> byUniversityForKeyMan(int statisDay, String areaCode);
    public abstract List<Map<String, Object>> byUniversityForRetention(int statisDay, String areaCode);
}
