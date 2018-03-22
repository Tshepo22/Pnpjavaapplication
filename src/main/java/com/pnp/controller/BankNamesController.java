package com.pnp.controller;

import com.pnp.exceptions.DataNotFoundException;
import com.pnp.services.BankNamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * 
 */

@Controller
@RequestMapping(value = "/bankNames")
public class BankNamesController {
    
    @Autowired
    private BankNamesService bankNameService;
   
    //find bank names
    @RequestMapping(value = "/findAllBankNames", method = RequestMethod.GET)
    @ResponseBody
    public Object findAllBankNames()
    {
        Object object = bankNameService.findAllBankNames();
        if(object == null)
        {
            throw new DataNotFoundException("Bank Names don't exist...");
        }
        return object;
    }
} //end of code
