package com.it10086.university.service;
import com.it10086.university.model.UnivesityRealHour;
import com.it10086.university.core.Service;

import java.util.List;
import java.util.Map;


/**
 * Created by CodeGenerator on 2019/08/31.
 */
public interface UnivesityRealHourService extends Service<UnivesityRealHour> {
    public abstract List<Map<String, Object>> byArea(int dataTime, String authCode);
    public abstract List<Map<String, Object>> byUniversity(int dataTime, String areaCode);
    public abstract List<Map<String, Object>> bySingalUniversity(int dataTime, String universityCode);
}
