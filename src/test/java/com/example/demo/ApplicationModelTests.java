package com.example.demo;

import com.example.demo.models.Account;
import com.example.demo.models.AccountGroup;
import com.example.demo.models.Group;
import com.example.demo.repositories.AccountGroupRepository;
import com.example.demo.repositories.AccountRepository;
import com.example.demo.repositories.GroupRepository;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Scanner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationModelTests {
    @Autowired
    private AccountRepository accountRepository;
    @Autowired
    private GroupRepository groupRepository;

    @Test
    public void checkCorrectWorkWithModels() {
    }

}
