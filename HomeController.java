package com.guzman.gettingFamiliar;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {
	 // 1. Annotation
    @RequestMapping( value = "/", method = RequestMethod.GET)
    // 3. Method that maps to the request route above
    public String hello() { // 3
            return "Hello Coding Dojo!";
    }
    
    @RequestMapping("/python/django")
    // 3. Method that maps to the request route above
    public String python() { // 3
            return "Python/Django was awesome!";
    }
    @RequestMapping("/java/spring")
    // 3. Method that maps to the request route above
    public String java() { // 3
            return "Java/Spring is better!";
    }

}
