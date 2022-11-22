package com.example.itsm.Repository;

import com.example.itsm.Entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, String> {
    Optional<Account> findAccountByFullName(String fullname);

    void deleteAccountByFullName(String fullname);
}
