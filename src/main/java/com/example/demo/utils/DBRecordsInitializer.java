package com.example.demo.utils;

import com.example.demo.models.Account;
import com.example.demo.models.AccountGroup;
import com.example.demo.models.Group;
import com.example.demo.models.keys.AccountGroupId;
import com.example.demo.repositories.AccountGroupRepository;
import com.example.demo.repositories.AccountRepository;
import com.example.demo.repositories.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class DBRecordsInitializer {
    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private GroupRepository groupRepository;
    @Autowired
    private AccountGroupRepository accountGroupRepository;

    @PostConstruct
    public void checkCorrectWorkWithModels() {
        Account account1 = new Account(null,"Maxim Grebnev");
        Account account2 = new Account(null,"Petr Ivanov");
        accountRepository.save(account1);
        accountRepository.save(account2);

        Group group = new Group(null,"Devs");
        groupRepository.save(group);

        AccountGroupId pk1 = new AccountGroupId(account1,group);
        AccountGroupId pk2 = new AccountGroupId(account2,group);

        AccountGroup accountGroup1 = new AccountGroup(pk1,true);
        AccountGroup accountGroup2 = new AccountGroup(pk2,false);
        accountGroupRepository.save(accountGroup1);
        accountGroupRepository.save(accountGroup2);
    }
}
