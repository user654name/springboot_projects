package com.tuomingfen.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Tianqi.Zhang
 * @date 2019/3/5
 * @time 14:25
 * @package com.tuomingfen.springboot.controller
 * @project springboot_2018_12
 * @description
 */
@Controller
public class AccoutController {


    @RequestMapping("account")
    @ResponseBody
    public void show() {

    }
}
