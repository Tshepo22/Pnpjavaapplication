package com.pnp.repositories;

import com.pnp.model.Address;
import java.util.ArrayList;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.webmvc.RepositoryRestController;

/**
 *
 * 
 */

@RepositoryRestController
public interface AddressRepository extends CrudRepository<Address, Integer>{
    @Query("SELECT a FROM Address a WHERE a.orderno = :orderno")
    public ArrayList<Address> findAddressByOrderNo(@Param("orderno") int orderNo);
    
    @Transactional
    @Modifying
    @Query("Delete FROM Address a WHERE a.orderno = :orderno")
    public int deleteAddress(@Param("orderno") int orderNo);
    
} // end of code
