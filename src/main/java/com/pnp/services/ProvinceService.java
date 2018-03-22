package com.pnp.services;

import com.pnp.repositories.ProvinceRepositiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * 
 */
@Service
public class ProvinceService{
    @Autowired
    private ProvinceRepositiory provinceRepository;
    public Object findAllProvinces()
    {
        return provinceRepository.findAll();
    }    
} // end of code
