package com.it10086.university.service;
import com.it10086.university.model.CurrentData;
import com.it10086.university.core.Service;
import com.it10086.university.model.GroupTest;

import java.util.List;
import java.util.Map;


/**
 * Created by CodeGenerator on 2019/08/17.
 */
public interface CurrentDataService extends Service<CurrentData> {
    public abstract List<Map<String, Object>> byArea(int dataTime);
    public abstract List<Map<String, Object>> byUniversity(int dataTime, String areaCode);
    public abstract List<Map<String, Object>> bySingalUniversity(int dataTime, String universityCode);

}
