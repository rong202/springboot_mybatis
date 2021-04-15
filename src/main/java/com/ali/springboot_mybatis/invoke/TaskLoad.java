package com.ali.springboot_mybatis.invoke;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
@Component
public class TaskLoad {
    public static Map<String[],TaskInfo> TaskInfos = new HashMap<>();

    @Autowired
    private A a;
    @PostConstruct
    public void init(){
        //为什么使用“com.ali.springboot_mybatis” 加载不到 Task 注解code ？？？
        Set<Class<?>> classes = ClassUtil.classesFromPkg(a.getScanPackage());
        classes.forEach(cls -> {
            //判断当前类上是否有@Tasks注解存在
            if (cls.isAnnotationPresent(Tasks.class)) {
                Tasks annotation = cls.getAnnotation(Tasks.class);
                //得到@Tasks注解上的值
                String name = annotation.value();
                //得到类对象里的各个方法
                Method[] methods = cls.getMethods();
                Arrays.stream(methods).forEach(method -> {
                    //得到方法上标注@Task的方法
                    Task task = method.getAnnotation(Task.class);
                    if (task != null) {
                        //TaskInfo 实体
                        TaskInfo TaskInfo = new TaskInfo();
                        TaskInfo.setMethod(method);
                        // task 方法所属的类
                        TaskInfo.setBeanClass(cls);
                        TaskInfo.setFlowCode(name);
                        TaskInfo.setTaskCode(task.code());
                        //String 数组为key TaskInfo对象为value
                        TaskLoad.TaskInfos.put(task.code(), TaskInfo);
                        // Logger.getLogger("加载任务方法--{}",Arrays.toString(task.code()));
                        System.out.println("加载任务方法--{}"+Arrays.toString(task.code()));
                    }
                });
            }
        });
    }
}
