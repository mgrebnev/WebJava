package com.example.demo.web.api;

import com.example.demo.models.AccountGroup;
import com.example.demo.models.Group;
import com.example.demo.repositories.AccountGroupRepository;
import com.example.demo.repositories.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/group")
public class GroupController {
    @Autowired
    private GroupRepository groupRepository;
    @Autowired
    private AccountGroupRepository accountGroupRepository;

    @GetMapping
    public Iterable<Group> getAccounts(){
        return groupRepository.findAll();
    }

    @GetMapping("/groupAccountsById/{id}")
    public List<AccountGroup> getGroupAccountsById(@PathVariable("id") Integer id){
        return accountGroupRepository.findAccountGroupByGroupId(id);
    }
}
