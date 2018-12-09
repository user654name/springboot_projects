package com.tuomingfen.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Tianqi.Zhang
 * @date 2018/12/9
 * @time 18:57
 * @package com.tuomingfen.controller
 * @project springboot_2018_12
 * @description
 */

@Controller
public class AccountController {

    @RequestMapping("/account")
    public ModelAndView toPage(){


        return new ModelAndView("account");
    }
}
