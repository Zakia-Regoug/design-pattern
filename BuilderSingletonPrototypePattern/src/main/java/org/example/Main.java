package org.example;

import org.example.models.AccountStatus;
import org.example.models.AccountType;
import org.example.models.BankAccount;
import org.example.models.BankDirector;
import org.example.repository.AccountRepositoryImpl;

import java.io.IOException;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) throws IOException {


        // pas de new : Singleton
        AccountRepositoryImpl accountRepository=AccountRepositoryImpl.getInstance();
        //remplir la liste
        for(int i=0;i<10;i++){
            new Thread(()->{
                accountRepository.populateData();
            }).start();
        }
        System.out.println("taper caratere");
        System.in.read();
        //findAll
        List<BankAccount> bankAccounts=accountRepository.findAll();

        //search : predicate is a condition
        List<BankAccount> bankAccounts1=accountRepository.searchAccounts(bankAccount -> bankAccount.getType().equals(AccountType.CURRENT_ACCOUNT));
        bankAccounts1.forEach(System.out::println);
    }
}
