package by.atmm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/blog")
public class MainController {

    @RequestMapping
    public String mainPage(Model model) {

        return "main";

    }

}
