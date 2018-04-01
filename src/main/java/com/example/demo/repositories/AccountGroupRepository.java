package com.example.demo.repositories;

import com.example.demo.models.AccountGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountGroupRepository extends JpaRepository<AccountGroup,Integer>{
    @Query(value = "SELECT * FROM ACCOUNT_GROUP a WHERE a.GROUP_ID = :id",nativeQuery = true)
    List<AccountGroup> defaultFind(@Param("id") Integer id);
}
