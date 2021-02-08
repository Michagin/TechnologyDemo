package kea.dat20b.technology.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Locale;

@Controller
public class FirstController {

    @GetMapping("/")
    @ResponseBody
    public String landing(){
        return "<b>index</b>";
    }

    @GetMapping("/calc")
    @ResponseBody
    public String hello(@RequestParam int input){
        return String.valueOf(input*input);
    }
}
