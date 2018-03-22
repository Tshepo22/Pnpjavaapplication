package com.pnp.services;

import com.pnp.repositories.BankNamesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * 
 */

@Service
public class BankNamesService{
   
    @Autowired
    private BankNamesRepository bankNameRepository;
    
    public Object findAllBankNames()
    {
        return bankNameRepository.findAll();
    }
} // end of code
