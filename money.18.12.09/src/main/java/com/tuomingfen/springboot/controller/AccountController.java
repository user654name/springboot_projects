package com.tuomingfen.springboot.controller;

import com.tuomingfen.springboot.bean.Account;
import com.tuomingfen.springboot.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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


    @Autowired
    AccountService accountService;


//    /**
//     * 解决日期乱码
//     *
//     * @param request
//     * @param binder
//     */
//    @InitBinder
//    protected void init(HttpServletRequest request, ServletRequestDataBinder binder) {
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        dateFormat.setLenient(false);
//        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
//    }


    @RequestMapping("/account")
    public ModelAndView toPage() {

       return new ModelAndView("account");
    }

    @RequestMapping("/insertaccountrecord")
    public ModelAndView insert(Account account) {
        System.out.println("【待插入的内容为】account = " + account);
        accountService.addRecord(account);
        return new ModelAndView("redirect:success.html");
    }
}
