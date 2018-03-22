package com.pnp.services;

import com.pnp.model.Address;
import com.pnp.repositories.AddressRepository;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * 
 */

@Service
public class AddressService {
  
    @Autowired
    private AddressRepository addressRepository;
  
     public Address saveAddress(Address address)
    {
        return addressRepository.save(address);
    }  
    public ArrayList<Address> findAddressByOrderNo(int orderNo)
    {
        return addressRepository.findAddressByOrderNo(orderNo);
    } 
    public int deleteDelivary(int orderNo)
    {
        return addressRepository.deleteAddress(orderNo);
    }
} // end of code
