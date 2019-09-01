package com.it10086.university.dao;

import com.it10086.university.core.Mapper;
import com.it10086.university.model.UniversityDay;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UniversityDayMapper extends Mapper<UniversityDay> {
    public abstract List<Map<String, Object>> byArea(@Param("dataTime") int dataTime, @Param("authCode") String authCode);
    public abstract List<Map<String, Object>> byUniversity(@Param("dataTime") int dataTime,@Param("areaCode") String areaCode);
}