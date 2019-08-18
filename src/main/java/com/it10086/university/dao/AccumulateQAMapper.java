package com.it10086.university.dao;

import com.it10086.university.core.Mapper;
import com.it10086.university.model.AccumulateQA;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface AccumulateQAMapper extends Mapper<AccumulateQA> {
    public abstract List<Map<String, Object>> byArea(@Param("statisDay") int statisDay, @Param("isOpenData") String isOpenData);
    public abstract List<Map<String, Object>> byUniversity(@Param("statisDay") int statisDay,@Param("areaCode") String areaCode,@Param("isOpenData") String isOpenData);

}