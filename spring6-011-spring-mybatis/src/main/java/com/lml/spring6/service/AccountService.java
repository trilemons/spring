package com.lml.spring6.service;

import com.lml.spring6.pojo.Account;

import java.util.List;

public interface AccountService {

    int save(Account act);

    int delete(String actno);

    int modify(Account act);

    Account getByActno(String actno);

    List<Account> getAll();

    void transferMoney(String ano1,String ano2,Double money);
}
