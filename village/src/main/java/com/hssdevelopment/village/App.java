package com.hssdevelopment.village;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Hello world!
 *
 */
@EnableAutoConfiguration
@ComponentScan(basePackageClasses =
        {com.hssdevelopment.village.api.rest.AttendeeController.class})

public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class);
    }
}
