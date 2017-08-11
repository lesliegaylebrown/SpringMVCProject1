package com.test.util;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")

    public ModelAndView helloWorld()
    {
        return new
                ModelAndView("welcome","message","Hello World");

    }


    @RequestMapping("/userform")
    public ModelAndView userform(){
        return  new ModelAndView("form","inst","Please enter your ID number: ");
    }
    @RequestMapping("/formhandler")
    public ModelAndView formhandler (
        @RequestParam("name")String name,
        @RequestParam("email") String email,
        @RequestParam("gender")String gender,
        @RequestParam("citizen") String citizen,
        @RequestParam("ssnum") String ssnum,
        @RequestParam ("favcolor")String favcolor

    ){ ModelAndView mv = new ModelAndView("formresponse");
        mv.addObject("name", name);
        mv.addObject("email", email);
        mv.addObject("gender", gender);
        mv.addObject("citizen", citizen);
        mv.addObject("ssnum",ssnum);
        mv.addObject("favcolor",favcolor);
                return mv;
    }
}


