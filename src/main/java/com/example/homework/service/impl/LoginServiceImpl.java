package com.example.homework.service.impl;

import com.example.homework.mapper.AccountMapper;
import com.example.homework.model.Account;
import com.test.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private AccountMapper accountMapper;
    @Override
    public void
    list(String school, String number, String username, String password, String address, String wechat, String job) {
        Account account =new Account();
        account.setSchool(school);
        account.setNumber(number);
        account.setUsername(username);
        account.setPassword(password);
        account.setAddress(address);
        account.setWechat(wechat);
        account.setJob(job);
        accountMapper.insert(account);
    }
}
