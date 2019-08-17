package com.it10086.university.service;
import com.it10086.university.model.GroupTest;
import com.it10086.university.model.Test;
import com.it10086.university.core.Service;

import java.util.List;


/**
 * Created by CodeGenerator on 2019/08/15.
 */
public interface TestService extends Service<Test> {
    public abstract List<GroupTest> groupTest(int id);
}
