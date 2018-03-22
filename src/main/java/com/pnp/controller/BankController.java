package com.pnp.controller;

import com.pnp.exceptions.DataNotFoundException;
import com.pnp.model.Bank;
import com.pnp.services.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * 
 */

@Controller
@RequestMapping(value = "/bank")
public class BankController{
    
    @Autowired
    private BankService bankService;
    
  // find bank account details
    @RequestMapping(value = "/findBankAccount/{cardNo}/{cardHolder}/{bankName}", method = RequestMethod.GET)
    @ResponseBody
    public Bank findBankAccount(@PathVariable int cardNo, @PathVariable String cardHolder, @PathVariable String bankName)
    {
        Bank bank = bankService.findBankAccount(cardNo, cardHolder, bankName);
        
        if(bank == null)
        {
            throw new DataNotFoundException("Account Not Authorized..Verify your Banking card information...");
        }
        return bank;
    }
    
   // Updates Bank balance after deduction
    @RequestMapping(value = "/updateBankBalance/{cardNo}/{balance}", method = RequestMethod.PUT)
    @ResponseBody
    public int updateBankBalance(@PathVariable int cardNo, @PathVariable double balance)
    {
        
         int update = bankService.updateBankBalance(cardNo, balance);
         
         if(update == 0)
         {
            throw new DataNotFoundException("Bank Balance could not be updated!");
         }       
        return update;
    }  
} //end of code
