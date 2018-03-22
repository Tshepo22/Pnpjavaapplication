package com.pnp.services;

import com.pnp.repositories.OrderStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * 
 */
@Service
public class OrderStatusService {
    
    @Autowired
    private OrderStatusRepository orderStatusRepository;
    
    public Object findAllOrderStatus()
    {
        return orderStatusRepository.findAll();
    }  
} // end of code
