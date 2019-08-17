package com.it10086.university.dao;

import com.it10086.university.core.Mapper;
import com.it10086.university.model.GroupTest;
import com.it10086.university.model.Test;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TestMapper extends Mapper<Test> {
    public abstract List<GroupTest> groupTest(@Param("id") int id);
}