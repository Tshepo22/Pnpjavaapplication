package com.pnp.controller;

import com.pnp.exceptions.DataNotFoundException;
import com.pnp.model.Users;
import com.pnp.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * 
 */

@RestController
@RequestMapping(value = "/user")
public class UsersController {
    
    @Autowired
    private UsersService usersService;
  
    //Find User using user id
    @RequestMapping(value = "/findUserByUserId/{userId}" , method = RequestMethod.GET)
    @ResponseBody
    public Users findUsersByUserId(@PathVariable int userId)
    {
        Users user = usersService.findUserByUserId(userId);
        if(user == null)
        {
            throw new DataNotFoundException("User doesn't exists contact adminstrator or register");
        }
        return user;
    }
    
    //register  User
   @RequestMapping(method = RequestMethod.POST, value="/register")
   @ResponseBody
    public Users registerUsers(@RequestBody Users users) throws Exception 
    {
        Users  user = usersService.saveUser(users);
        if(user != null)
        {
            return user;
        }
        else{
            throw new DataNotFoundException("User Not Registered...Email already in-User!!!");
        }     
    }
    
    //User Login Using username and password
    @RequestMapping(value="/login/{username}/{password}", method = RequestMethod.GET)
    @ResponseBody
    public Users userLogin(@PathVariable String username, @PathVariable String password)
    { 
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder(); 
        Users user = usersService.userLogin(username);
        if(user != null)
        {
           if(passwordEncoder.matches(password, user.getPassword()))
           {
              return user;
           }else
           {
              throw new DataNotFoundException("Password Incorrect, enter password again!!!");
           }
        }else{
             throw new DataNotFoundException("Email Don't exist, enter password again!!!");
        }
    }
    
} // end of code
