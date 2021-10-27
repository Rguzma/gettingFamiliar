package com.guzman.gettingFamiliar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DojoController {
    @RequestMapping(value = "/{dojo}")
    public String showDojo( @PathVariable String dojo) {
            return "The dojo is awesome!";
    }
    @RequestMapping(value = "/dojo1/{burbank}")
    public String showBurbank( @PathVariable  String burbank) {
            return "Burbank is located in South California";
    }
    @RequestMapping( "dojo2/{sanjose}")
    public String showSanJose( @PathVariable ("sanjose") String sanjose) {
            return "SJ is the headquarters";
    }
//    if (variable == "dojo") {
//    	return "The dojo is awesome!";
//    }
//    if (variable == "burbank") {
//    	return "Burbank is located in South California";
//    }
//    if (variable == "sanjose") {
//    	return "SJ is the headquarters"; 
//    }
//    }
   
}
    