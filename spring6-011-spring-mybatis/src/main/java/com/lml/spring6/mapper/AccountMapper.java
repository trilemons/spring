package com.lml.spring6.mapper;

import com.lml.spring6.pojo.Account;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface AccountMapper {//不需要实现，是mybatis通过动态代理机制生成的实现类

    int insert(Account account);

    int deleteByActno(String actno);

    int update(Account account);

    Account selectByActno(String actno);

    List<Account> selectAll();
}
