package com.pnp.repositories;

import com.pnp.model.Provinces;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 *
 * 
 */
@RepositoryRestResource
public interface ProvinceRepositiory extends CrudRepository<Provinces, Integer> {
    
}
