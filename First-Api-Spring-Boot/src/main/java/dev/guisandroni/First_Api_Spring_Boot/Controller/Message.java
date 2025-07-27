package dev.guisandroni.First_Api_Spring_Boot.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Message {
    @GetMapping
    public String message(){
        return "Hello world from spring boot";
    }

}
