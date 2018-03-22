package com.pnp.controller;

import com.pnp.exceptions.DataNotFoundException;
import com.pnp.services.AddressTypesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * 
 */
@RestController
@RequestMapping(value = "/addressTypes")
public class AddressTypesController {
    
    @Autowired
    private AddressTypesService addressTypeService;
    
    //Gets address type information
    @RequestMapping(value="/findAllAddressTypes", method = RequestMethod.GET)
    @ResponseBody
    public Object findAllDeliveryTypes()
    {
        Object object = addressTypeService.findAllAddressTypes();
        if(object == null)
        {
            throw new DataNotFoundException("Address types doesn't Exist in the database...");
        }
        return object;
    }
} //end of 
