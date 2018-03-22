package com.pnp.repositories;

import com.pnp.model.Orderstatus;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

/**
 *
 * 
 */
@RepositoryRestController
public interface OrderStatusRepository extends CrudRepository<Orderstatus, Integer>{
    
} //end of code
