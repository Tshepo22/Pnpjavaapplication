package com.pnp.repositories;


import com.pnp.model.Orders;
import java.util.ArrayList;
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
public interface OrdersRepository  extends CrudRepository<Orders, Integer>{
    
    @Transactional
    @Modifying
    @Query("Update Orders o SET o.orderstatus = :orderstatus WHERE o.orderID = :orderID")
    public int updateOrderStatus(@Param("orderID") int orderId, @Param("orderstatus") String orderstatus);

    @Transactional
    @Modifying
    @Query("Delete FROM Orders o WHERE o.orderno = :orderno")
    public int deleteOrder(@Param("orderno") int orderNo);
     
    @Query("SELECT o FROM Orders o WHERE o.orderno = :orderno")
    public ArrayList<Orders> findOrderByOrderNo(@Param("orderno") int orderNo);
} // end of code
