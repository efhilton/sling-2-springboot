package com.edgar.my_app.controller;

import com.edgar.my_app.model.MyModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;


@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "home/index";
    }

    @GetMapping("/forms")
    public String getForm(@RequestParam("state") String stateName,
                          @RequestParam("type") String customerType,
                          Model model) {
        MyModel testModel = new MyModel(5, "John", "Williams", "Composer", "(555)555-5555", Arrays.asList("Woodworking", "Biking", "Scuba Diving"));

        model.addAttribute("user", testModel);

        return "forms/" + stateName + "/" + customerType;

    }

}
