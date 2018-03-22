package com.pnp.controller;

import com.pnp.exceptions.DataNotFoundException;
import com.pnp.model.Orders;
import com.pnp.services.AddressService;
import com.pnp.services.OrdersService;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping(value = "/orders")
public class OrdersController {
    
    @Autowired
    private OrdersService ordersServices;
    
    @Autowired
    private AddressService addressService;
    
     //Save orders
    @RequestMapping(value = "/saveOrders", method = RequestMethod.POST)
    @ResponseBody
    public Orders saveOrder(@RequestBody Orders orders)
    {
       Orders order = ordersServices.saveOrders(orders);
           
        if(order == null)
        {
            throw new DataNotFoundException("Order didn't save!");
        } 
        return order;
    }
    
     //find orders
    @RequestMapping(value = "/findAllOrders", method = RequestMethod.GET)
    @ResponseBody
    public Object findAllOrders()
    { 
        Object object =  ordersServices.findAllOrders();
        if(object == null)
        {
            throw new DataNotFoundException("Orders not Found!");
        }
       return object;
    }
    
    //Update Order Status using order id
    @RequestMapping(value = "/updateOrderStatus/{orderId}/{orderStatus}", method = RequestMethod.PUT)
    @ResponseBody
    public int updateOrderStatus(@PathVariable int orderId, @PathVariable String orderStatus )
    {
       int updated = ordersServices.updateOrdersStatus(orderId, orderStatus);
       if(updated != 1)
       {
           throw new DataNotFoundException("Order Status could not be Updated...");
       }
       return updated;
    }
    
    //Remove Orders
    @RequestMapping(value = "/deleteOrders/{orderNo}" , method = RequestMethod.DELETE)
    @ResponseBody
    public int removeOrderStatu(@PathVariable int orderNo )
    {
       int delete = ordersServices.deleteOrders(orderNo);
        
        if(delete != 1){
            throw new DataNotFoundException("Order could not be deleted!");
        }else{
            if(delete == 1)
            {
                 addressService.deleteDelivary(orderNo);
            }
        }
        return delete;
    }
    
    //View Order Status based using order number
    @RequestMapping(value = "/findByOrderNo/{orderno}", method = RequestMethod.GET)
    @ResponseBody
    public ArrayList<Orders> viewByOrderNo(@PathVariable int orderno)
    {
        ArrayList<Orders> orderList = ordersServices.findOrdersByOrderNo(orderno);
        
        if(orderList == null)
        {
            throw new DataNotFoundException("Orders not found...");
        }
        return orderList;
    }  
} //end of code
