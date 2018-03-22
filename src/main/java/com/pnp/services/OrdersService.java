package com.pnp.services;

import com.pnp.model.Orders;
import com.pnp.repositories.OrdersRepository;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * 
 */

@Service
public class OrdersService {
    
    @Autowired
    private OrdersRepository orderRepository;
    
    public ArrayList<Orders> findOrdersByOrderNo(int orderNo)
   {
       return orderRepository.findOrderByOrderNo(orderNo);
   }
    public Object findAllOrders()
    {
        return orderRepository.findAll();
    }
    public Orders saveOrders(Orders orders)
    {
        return orderRepository.save(orders);
    }
    public int updateOrdersStatus(int orderID, String statusStatus)
    {
        return orderRepository.updateOrderStatus(orderID, statusStatus);
    }
   public int deleteOrders(int orderNo)
   {
       return orderRepository.deleteOrder(orderNo);
   } 
} //end of code
