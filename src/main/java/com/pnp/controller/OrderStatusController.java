package com.pnp.controller;

import com.pnp.exceptions.DataNotFoundException;
import com.pnp.services.OrderStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * 
 */

@Controller
@RequestMapping(value = "/orderStatus")
public class OrderStatusController {
    
    @Autowired
    private OrderStatusService orderStatusService;
    
    //gets order status
    @RequestMapping(method = RequestMethod.GET, value = "/findAllOrderStatus")
    @ResponseBody
    public Object viewOrderStatus()
    {
        Object object =  orderStatusService.findAllOrderStatus();
        if(object == null)
        {
            throw new DataNotFoundException("Status could not be found!");
        }
        return object;
    } 
} //end of code
