package com.example.demo.models;

import com.example.demo.models.keys.AccountGroupId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.io.Serializable;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class AccountGroup implements Serializable{
    @EmbeddedId
    private AccountGroupId accountGroupId;
    private boolean isSubscribe;
}
