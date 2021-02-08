package kea.dat20b.technology.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {

    @GetMapping("/")
    @ResponseBody
    public String landing(){
        return "<b>index</b>";
    }
}
