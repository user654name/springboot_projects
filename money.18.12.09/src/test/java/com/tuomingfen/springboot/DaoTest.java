package com.tuomingfen.springboot;

import com.tuomingfen.springboot.bean.Account;
import com.tuomingfen.springboot.mapper.AccountMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.Date;

/**
 * @author Tianqi.Zhang
 * @date 2018/12/10
 * @time 0:14
 * @package com.tuomingfen.springboot
 * @project springboot_2018_12
 * @description
 */
@RunWith(SpringRunner.class)
@WebAppConfiguration
@SpringBootTest(classes = MavenAndSpringBootApplication.class)
public class DaoTest {

    @Autowired
    AccountMapper accountMapper;

    @Test
    public void test() {

        Account account = new Account();
        account.setInsertDate(new Date());
        accountMapper.insert(account);
    }
}
