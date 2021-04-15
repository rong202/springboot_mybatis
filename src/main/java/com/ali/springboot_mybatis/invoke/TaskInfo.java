package com.ali.springboot_mybatis.invoke;

import lombok.Data;
import lombok.ToString;

import java.lang.reflect.Method;

@Data
@ToString
public class TaskInfo {
    private Long taskId;
    private String[] taskCode;
    private String flowCode;
    private Class beanClass;
    private Class paramClass;
    private String methodName;
    private Method method;
    private Boolean autoReceive = false;
    private Boolean autoFinish = false;
}
