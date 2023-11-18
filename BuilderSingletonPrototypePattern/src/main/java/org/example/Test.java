package org.example;

import org.example.models.AccountStatus;
import org.example.models.AccountType;
import org.example.models.BankAccount;
import org.example.models.Costumer;
import org.example.repository.AccountRepositoryImpl;

import java.io.IOException;
import java.util.List;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {

        BankAccount account1=new BankAccount();
        account1.setAccountId(1L);
        account1.setBalance(40000);
        account1.setCurrency("MAD");
        account1.setType(AccountType.CURRENT_ACCOUNT);
        account1.setStatus(AccountStatus.ACTIVATED);
        account1.setCostumer(new Costumer(1L,"Mohammed"));

        BankAccount account2=account1.clone();

        account1.getCostumer().setNom("Hassan");

        System.out.println(account1.toString());
        System.out.println(account2.toString());

    }

}
