package com.pnp.repositories;

import com.pnp.model.Addresstypes;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

/**
 *
 * 
 */
@RepositoryRestController
public interface AddressTypesRepository extends CrudRepository<Addresstypes, Integer>{
    
} //end of code
