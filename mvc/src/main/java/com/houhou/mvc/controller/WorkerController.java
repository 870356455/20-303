package com.houhou.mvc.controller;

import com.houhou.mvc.pojo.Worker;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.List;

@RestController
public class WorkerController {
    static List<Worker> workers = new ArrayList<>();
    public static void init(){
        workers.add(new Worker(1001,"陈蓬林001",20,"中","语文"));
        workers.add(new Worker(1002,"陈蓬林002",22,"女","数学"));
        workers.add(new Worker(1003,"陈蓬林003",19,"男","汉语言"));
        workers.add(new Worker(1004,"陈蓬林005",25,"女",".英语"));
    }


    @RequestMapping("/allinfo")
    public List getAllInfo(){
        return workers;
    }

}
