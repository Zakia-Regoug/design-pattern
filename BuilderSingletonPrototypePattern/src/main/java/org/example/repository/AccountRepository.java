package org.example.repository;

import org.example.models.BankAccount;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public interface AccountRepository {
    BankAccount save(BankAccount bankAccount);
    List<BankAccount> findAll();
    Optional<BankAccount> findById(Long id); // retourner un compte ou rien
    List<BankAccount> searchAccounts(Predicate<BankAccount> predicate);//predicate retourne oui ou non
    BankAccount update(BankAccount bankAccount);
    void deleteById(Long id);
}
