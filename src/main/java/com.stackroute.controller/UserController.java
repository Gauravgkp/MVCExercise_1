package com.stackroute.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

   private User user = new User("Gaurav");
@RequestMapping(value = "/")
    public String greeting(ModelMap map){
    map.addAttribute("greetings", "Welcome " + user.getName() + " to stackroute");
    return "index";
}

//    private User user = new User("Gaurav");
//    @RequestMapping(value = "/")
//    public String greeting(ModelMap map){
//        map.addAttribute("greetings", user.toString());
//        return "index";
//    }

}
