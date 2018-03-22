package com.pnp.services;

import com.pnp.repositories.DelivaryTypeRepository;
import java.io.Serializable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * 
 */

@Service
public class DelivaryTypeService {
    
    @Autowired
    private DelivaryTypeRepository delivaryTypeRepepository;
    
    public Object findAllDeliveryTypes()
    {
        return delivaryTypeRepepository.findAll();
    }
} // end of code
