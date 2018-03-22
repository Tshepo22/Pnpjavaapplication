package com.pnp.repositories;

import com.pnp.model.Banknames;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

/**
 *
 * 
 */
@RepositoryRestController
public interface BankNamesRepository  extends CrudRepository<Banknames, Integer>{
    
} //end of code
