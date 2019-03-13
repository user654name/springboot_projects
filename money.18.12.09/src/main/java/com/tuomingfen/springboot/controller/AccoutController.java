package com.tuomingfen.springboot.controller;

import com.tuomingfen.springboot.mapper.AccountMapper;
import com.tuomingfen.springboot.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

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

    @Autowired
    private AccountMapper accountMapper;

    @RequestMapping("account")
    @ResponseBody
    public List show() {
        Account record= new Account();
        record.setChuxuGongshang((double) 99);
        record.setInsertDate(new Date());

        int insert = accountMapper.insert(record);
        System.out.println("insert = " + insert);
        List<Account> accounts = accountMapper.selectByExample(null);
        return accounts;

    }
}
