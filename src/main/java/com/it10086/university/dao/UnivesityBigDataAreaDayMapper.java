package com.it10086.university.dao;

import com.it10086.university.core.Mapper;
import com.it10086.university.model.UnivesityBigDataAreaDay;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UnivesityBigDataAreaDayMapper extends Mapper<UnivesityBigDataAreaDay> {
    public abstract List<Map<String, Object>> byAreaForPortion(@Param("authCode") String authCode);
    public abstract List<Map<String, Object>> byAreaForApp(@Param("statisDay") int statisDay,@Param("authCode") String authCode);
    public abstract List<Map<String, Object>> byAreaForKeyMan(@Param("statisDay") int statisDay,@Param("authCode") String authCode);
    public abstract List<Map<String, Object>> byAreaForRetention(@Param("statisDay") int statisDay,@Param("authCode") String authCode);
}