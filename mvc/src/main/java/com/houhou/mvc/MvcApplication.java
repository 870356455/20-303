package com.houhou.mvc;

import com.houhou.mvc.controller.WorkerController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MvcApplication {

    public static void main(String[] args) {
        WorkerController.init();

        SpringApplication.run(MvcApplication.class, args);
    }

}
