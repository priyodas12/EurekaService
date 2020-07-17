package io.microservice.EurekaService.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/service")
@RestController
@PropertySource("classpath:application.yml")
public class GenericController {

    @Autowired
    private Environment env;

    @GetMapping("/info")
    public String getInstanceInfo(){
        return "Reply from  Instance id:" +env.getProperty("eureka.instance.instance-id");
    }
}
