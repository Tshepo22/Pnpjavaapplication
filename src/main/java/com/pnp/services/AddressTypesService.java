package com.pnp.services;

import com.pnp.repositories.AddressTypesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * `````````````````````````````````````````````````
 */

@Service
public class AddressTypesService {
    
    @Autowired
    private AddressTypesRepository addressTypeRepepository;
    
    public Object findAllAddressTypes()
    {
        return addressTypeRepepository.findAll();
    }
} // end of code
