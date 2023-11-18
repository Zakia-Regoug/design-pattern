package org.example.repository;

import org.example.models.AccountStatus;
import org.example.models.AccountType;
import org.example.models.BankAccount;
import org.example.models.BankDirector;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class AccountRepositoryImpl implements AccountRepository {

    private static  AccountRepositoryImpl accountRepository;
//    static {
//        System.out.println("Singleton Instatiation ");
//        accountRepository=new AccountRepositoryImpl();
//    }
    private AccountRepositoryImpl(){

    }
    private Map<Long, BankAccount> bankAccountMap=new HashMap<>();
    private long accountsCount=0;
    @Override
    public  BankAccount save(BankAccount bankAccount) {
        Long accountId;
        synchronized (this){
            accountId=++accountsCount; //critical zone
        }
        bankAccount.setAccountId(accountId);
        synchronized (this) {
            bankAccountMap.put(accountId, bankAccount);
        }
        return bankAccount;
    }

    @Override
    public List<BankAccount> findAll() {
        return bankAccountMap.values().stream().toList();
    }

    @Override
    public Optional<BankAccount> findById(Long id) {
        BankAccount account=bankAccountMap.get(id);
        if(account==null)
            return Optional.empty();
        else
            return Optional.of(account);
    }

    @Override
    public List<BankAccount> searchAccounts(Predicate<BankAccount> predicate) {
        return bankAccountMap.values().stream().filter(predicate).collect(Collectors.toList());
    }

    @Override
    public BankAccount update(BankAccount bankAccount) {
        bankAccountMap.put(bankAccount.getAccountId(),bankAccount);
        return bankAccount;
    }

    @Override
    public void deleteById(Long id) {
        bankAccountMap.remove(id);
    }

    public void populateData(){
        for(int i=0;i<10;i++){
            BankAccount bankAccount= BankDirector.accountBuilder()
                    .balance(20000+Math.random()*12000)
                    .type(Math.random()>0.5? AccountType.SAVING_ACCOUNT:AccountType.CURRENT_ACCOUNT)
                    .status(Math.random()>0.5? AccountStatus.CREATED:AccountStatus.ACTIVATED)
                    .currency(Math.random()>0.3?"USD":"MAD")
                    .build();
            save(bankAccount);
        }
        System.out.println("***************");
        System.out.println(Thread.currentThread().getName());
        System.out.println("Account counter : "+accountsCount);
        System.out.println(bankAccountMap.values().size());
        System.out.println("*****************");
    }

    public static AccountRepositoryImpl getInstance(){
        if(accountRepository==null) {
            System.out.println("Singleton Instatiation");
            accountRepository = new AccountRepositoryImpl();
        }
        return accountRepository;
    }
}
