package com.example.demo.models.keys;

import com.example.demo.models.Account;
import com.example.demo.models.Group;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
public class AccountGroupId implements Serializable{
    @OneToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "account_id")
    private Account account;

    @OneToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "group_id")
    private Group group;
}
