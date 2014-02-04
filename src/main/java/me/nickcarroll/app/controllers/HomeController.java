package me.nickcarroll.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showHome() {
        return "index";
    }

    @RequestMapping(value = "/index2", method = RequestMethod.GET)
    public String showHome3() {
        return "index2";
    }

}
