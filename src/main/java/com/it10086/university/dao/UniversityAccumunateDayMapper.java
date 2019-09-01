package com.it10086.university.dao;

import com.it10086.university.core.Mapper;
import com.it10086.university.model.UniversityAccumunateDay;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UniversityAccumunateDayMapper extends Mapper<UniversityAccumunateDay> {
    public abstract List<Map<String, Object>> byArea(@Param("statisDay") int statisDay, @Param("isOpenData") String isOpenData, @Param("authCode") String authCode);
    public abstract List<Map<String, Object>> byUniversity(@Param("statisDay") int statisDay,@Param("areaCode") String areaCode,@Param("isOpenData") String isOpenData);
}