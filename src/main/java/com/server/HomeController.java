package com.server;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/home")
public class HomeController {

    @RequestMapping(value = "/show",method = RequestMethod.GET)
    public String show(ModelMap model) {
        model.addAttribute("message", "Hi , Spring 3 MVC Hello World");
        return "show";
    }
}
