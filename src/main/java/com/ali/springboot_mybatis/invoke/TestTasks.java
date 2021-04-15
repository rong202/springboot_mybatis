package com.ali.springboot_mybatis.invoke;

import org.springframework.stereotype.Service;

@Service
@Tasks("ENTRY_DECLARATION")
public class TestTasks {
    @Task(code = TaskConst.ENTRY_WAREHOUSING_SINGLE)
    public String c(String c){
        TestTasks.class.getClassLoader();
        return c;
    }
}
