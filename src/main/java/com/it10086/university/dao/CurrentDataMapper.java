package com.it10086.university.dao;

import com.it10086.university.core.Mapper;
import com.it10086.university.model.CurrentData;
import com.it10086.university.model.GroupTest;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface CurrentDataMapper extends Mapper<CurrentData> {
    public abstract List<Map<String, Object>> byArea(@Param("dataTime") int dataTime,@Param("authCode") String authCode);
    public abstract List<Map<String, Object>> byUniversity(@Param("dataTime") int dataTime,@Param("areaCode") String areaCode);
    public abstract List<Map<String, Object>> bySingalUniversity(@Param("dataTime") int dataTime,@Param("universityCode") String universityCode);
}