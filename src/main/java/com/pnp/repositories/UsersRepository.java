package com.pnp.repositories;

import com.pnp.model.Users;
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
public interface UsersRepository extends CrudRepository<Users, Integer> {
    
    //Login using email And password
    @Query("SELECT u FROM Users u WHERE u.email = :email")
    public Users login(@Param("email") String email);
     
    //Login using email And password
    @Query("SELECT u FROM Users u WHERE u.email = :email")
    public Users forgotPassword(@Param("email") String email);
    
    //Update Password/Forgot Password
    @Transactional
    @Modifying
    @Query("Update Users u SET u.password = :password WHERE u.email = :email")
    public int updatePassword(@Param("password") String password, @Param("email") String email);

} //end of code
