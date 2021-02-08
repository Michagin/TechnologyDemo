package kea.dat20b.technology.controller;

import kea.dat20b.technology.Calculator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CalculatorController {

    @GetMapping("/calc")
    @ResponseBody
    public String calulator(@RequestParam int x, int y){
        Calculator calc = new Calculator();
        return String.valueOf(calc.multiply(x,y));
    }
}
