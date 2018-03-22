package com.pnp.repositories;

import com.pnp.model.Delivarytpes;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * 
 */
@RepositoryRestResource
public interface DelivaryTypeRepository  extends CrudRepository<Delivarytpes, Integer>{
    
} //end of code
