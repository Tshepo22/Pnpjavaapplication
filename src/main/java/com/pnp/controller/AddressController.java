package com.pnp.controller;

import com.pnp.exceptions.DataNotFoundException;
import com.pnp.model.Address;
import com.pnp.services.AddressService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * 
 */
@RestController
@RequestMapping(value = "/address")
public class AddressController {
    
    @Autowired
    private AddressService addressService;
    
    //Save Delivary information
    @RequestMapping(value = "/saveAddress", method = RequestMethod.POST)
    @ResponseBody
    public Address saveAddress(@RequestBody Address address)
    {
        Address addresses = addressService.saveAddress(address);
          if(addresses == null)
          {
              throw new DataNotFoundException("Address Not Saved...");
          }
        return addresses;
    }
 
    //Get Delivary based using order number
    @RequestMapping(value = "/findAddressByOrderNo/{orderno}", method = RequestMethod.GET)
    @ResponseBody
    public ArrayList<Address> viewByOrderNo(@PathVariable int orderno)
    {
        ArrayList<Address> addressList =  addressService.findAddressByOrderNo(orderno);
        if(addressList == null)
        {
            throw new DataNotFoundException("Address doesn't Exist in the database...");
        }  
        return addressList;
    }
} //end of code
