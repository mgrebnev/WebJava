package com.example.demo.utils;

import com.example.demo.models.Account;
import com.example.demo.models.AccountGroup;
import com.example.demo.models.Group;
import com.example.demo.repositories.AccountGroupRepository;
import com.example.demo.repositories.AccountRepository;
import com.example.demo.repositories.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;

@Component
public class DBRecordsInitializer {
    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private GroupRepository groupRepository;
    @Autowired
    private AccountGroupRepository accountGroupRepository;

    @Transactional
    @PostConstruct
    public void checkCorrectWorkWithModels() {
        Account account1 = new Account(null,"Maxim Grebnev",null);
        Account account2 = new Account(null,"Petr Ivanov",null);
        accountRepository.save(account1);
        accountRepository.save(account2);

        Group group = new Group(null,"Devs",null);
        groupRepository.save(group);

        accountGroupRepository.save(new AccountGroup(null,group,account1,true));
        accountGroupRepository.save(new AccountGroup(null,group,account2,false));
    }
}
