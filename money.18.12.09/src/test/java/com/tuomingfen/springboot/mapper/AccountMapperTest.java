package com.tuomingfen.springboot.mapper;

import com.tuomingfen.springboot.MavenAndSpringBootApplication;
import com.tuomingfen.springboot.model.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.Date;
import java.util.List;

/**
 * @author Tianqi.Zhang
 * @date 2019/3/11
 * @time 13:21
 * @package com.tuomingfen.springboot.mapper
 * @project springboot_2018_12
 * @description
 */
@RunWith(SpringRunner.class)
@SpringBootTest
// @WebAppConfiguration
public class AccountMapperTest {

    @Autowired
    AccountMapper mapper ;

    @Test
    public void testA() {
        System.out.println("true = " + true);

        List<Account> accounts = mapper.selectByExample(null);
        System.out.println("————————开始——————————");
        System.out.println("Record");
        for (Account account : accounts) {
//            System.out.println("account = " + account);
            Double realAccount = account.getRealAccount();
            Date recordDate = account.getRecordDate();
            long time = recordDate.getTime();
            System.out.println("time = " + time);
            System.out.println(recordDate.getMonth()+"月"+recordDate.getDay()+"日 : " + realAccount);
        }
        System.out.println("————————结束——————————");

    }
}
