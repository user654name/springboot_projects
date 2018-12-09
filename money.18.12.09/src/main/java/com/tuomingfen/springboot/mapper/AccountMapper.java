package com.tuomingfen.springboot.mapper;

import com.tuomingfen.springboot.bean.Account;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Account record);

    int insertSelective(Account record);

    Account selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Account record);

    int updateByPrimaryKeyWithBLOBs(Account record);

    int updateByPrimaryKey(Account record);
}