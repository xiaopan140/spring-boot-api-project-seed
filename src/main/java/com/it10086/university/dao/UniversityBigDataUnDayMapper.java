package com.it10086.university.dao;

import com.it10086.university.core.Mapper;
import com.it10086.university.model.UniversityBigDataUnDay;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UniversityBigDataUnDayMapper extends Mapper<UniversityBigDataUnDay> {
    public abstract List<Map<String, Object>> byUniversityForPortion(@Param("areaCode") String areaCode);
    public abstract List<Map<String, Object>> byUniversityForApp(@Param("statisDay") int statisDay, @Param("areaCode") String areaCode);
    public abstract List<Map<String, Object>> byUniversityForKeyMan(@Param("statisDay") int statisDay, @Param("areaCode") String areaCode);
    public abstract List<Map<String, Object>> byUniversityForRetention(@Param("statisDay") int statisDay, @Param("areaCode") String areaCode);
}