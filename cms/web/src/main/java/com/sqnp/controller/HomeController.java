package com.sqnp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by dongc on 2017/9/9.
 */
@Controller
public class HomeController {


    @RequestMapping("/index")
    public ModelAndView index() {
        ModelAndView mv =new ModelAndView("index");
        return mv;
    }
}
