package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CurrencyConverterApplication {

    @GetMapping("/converter")
    public String converter() {
        return "index";
    }

    @GetMapping("/result")
    public String result(@RequestParam float rate,float usd ,Model model){
        float vnd = rate * usd;
        model.addAttribute("result",vnd);
        return "result";
    }
}
