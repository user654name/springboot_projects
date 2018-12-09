package com.tuomingfen.springboot.service;

import com.tuomingfen.springboot.bean.Account;
import com.tuomingfen.springboot.mapper.AccountMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author Tianqi.Zhang
 * @date 2018/12/10
 * @time 0:08
 * @package com.tuomingfen.springboot.service
 * @project springboot_2018_12
 * @description
 */
@Service
public class AccountServiceImpl implements AccountService {
    @Mapper
    AccountMapper mapper;

    @Override
    public boolean addRecord(Account account) {
        account.setInsertDate(new Date());
        int insert = mapper.insert(account);
        return insert == 1 ? true : false;
    }
}
