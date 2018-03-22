package com.pnp.services;

import com.pnp.model.Bank;
import com.pnp.repositories.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * 
 */

@Service
public class BankService{
    
    @Autowired
    private BankRepository bankRepository;
    
    //gets bank account details
    public Bank findBankAccount(int cardNo, String cardHolder, String bankName)
    {
        return bankRepository.findBankAccount(cardNo, cardHolder, bankName);
    }
    //updates Bank Balance
    public int updateBankBalance(int cardNo, double balance)
    {
        return bankRepository.updateBankBalance(cardNo, balance);
    }
} // end of code
