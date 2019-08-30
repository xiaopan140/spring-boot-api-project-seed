package com.it10086.university.dao;

import com.it10086.university.core.Mapper;
import com.it10086.university.model.AccumulateCurrentData;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface AccumulateCurrentDataMapper extends Mapper<AccumulateCurrentData> {
    public abstract List<Map<String, Object>> byArea(@Param("dataTime") int dataTime,@Param("isOpenData") String isOpenData,@Param("authCode") String authCode);
    public abstract List<Map<String, Object>> byUniversity(@Param("dataTime") int dataTime,@Param("areaCode") String areaCode,@Param("isOpenData") String isOpenData);
}