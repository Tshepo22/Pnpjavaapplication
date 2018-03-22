package com.pnp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * 
 */

@Controller
public class PnpRequestPageController {
    
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String homePage()
    {
        return "home";
    }
    
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String registerPage()
    {
        return "register";
    }
    
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginPage()
    {
        return "login";
    }
    
    
    @RequestMapping(value = "/adminHomePage", method = RequestMethod.GET)
    public String adminPage()
    {
        return "adminHomePage";
    }
    
    @RequestMapping(value = "/SupplierHomePage", method = RequestMethod.GET)
    public String SupplierPage()
    {
        return "SupplierHomePage";
    }
    
    @RequestMapping(value = "/addCategory", method = RequestMethod.GET)
    public String addCategory()
    {
        return "addCategory";
    }
    
    @RequestMapping(value = "/addProduct", method = RequestMethod.GET)
    public String addProduct()
    {
        return "addProduct";
    }
    
    @RequestMapping(value = "/updateProduct", method = RequestMethod.GET)
    public String updateProduct()
    {
        return "updateProduct";
    }
    
    @RequestMapping(value = "/registerAdmin", method = RequestMethod.GET)
    public String registerAdmin()
    {
        return "registerAdmin";
    }
    
    @RequestMapping(value = "/viewOrders", method = RequestMethod.GET)
    public String viewOrders()
    {
        return "viewOrders";
    }
    
    //Customer Pages
    @RequestMapping(value = "/customerHomePage", method = RequestMethod.GET)
    public String customerHomePage()
    {
        return "customerHomePage";
    }
    
    @RequestMapping(value = "/customerOrders", method = RequestMethod.GET)
    public String customerOrders()
    {
        return "customerOrders";
    }
    
    @RequestMapping(value = "/registerSupplier", method = RequestMethod.GET)
    public String registerSupplier()
    {
        return "registerSupplier";
    }
    
     @RequestMapping(value = "/registerDriver", method = RequestMethod.GET)
    public String registerDriver()
    {
        return "registerDriver";
    }
  
     @RequestMapping(value = "/driverHomePage", method = RequestMethod.GET)
    public String driverPage()
    {
        return "driverHomePage";
    }
} //end of code
