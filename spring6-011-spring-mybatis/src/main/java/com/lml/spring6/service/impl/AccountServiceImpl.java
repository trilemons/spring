package com.lml.spring6.service.impl;

import com.lml.spring6.mapper.AccountMapper;
import com.lml.spring6.pojo.Account;
import com.lml.spring6.service.AccountService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Resource(name = "accountMapper")
    private AccountMapper accountMapper;

    @Override
    public int save(Account act) {
        return accountMapper.insert(act);
    }

    @Override
    public int delete(String actno) {
        return accountMapper.deleteByActno(actno);
    }

    @Override
    public int modify(Account act) {
        return accountMapper.update(act);
    }

    @Override
    public Account getByActno(String actno) {
        return accountMapper.selectByActno(actno);
    }

    @Override
    public List<Account> getAll() {
        return accountMapper.selectAll();
    }

    @Override
    public void transferMoney(String ano1, String ano2, Double money) {

        Account account1 = accountMapper.selectByActno(ano1);
        Account account2 = accountMapper.selectByActno(ano2);
        if (account1.getBalance()<money){
            throw new RuntimeException("余额不足");
        }
        account1.setBalance(account1.getBalance()-money);
        account2.setBalance(account2.getBalance()+money);

        int count = accountMapper.update(account1);

        count += accountMapper.update(account2);

        if (count != 2){
            throw new RuntimeException("转账失败");
        }

    }
}
