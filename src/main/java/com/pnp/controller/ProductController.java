package com.pnp.controller;

import com.pnp.exceptions.DataNotFoundException;
import com.pnp.model.Product;
import com.pnp.services.ProductService;
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
@RequestMapping(value = "/product")
public class ProductController{
  
    @Autowired
    private ProductService productService;
    
     //Find products
    @RequestMapping(value = "/findAllProducts" , method = RequestMethod.GET)
    @ResponseBody
    public Object findAllProduct()
    {
        Object products = productService.findAllProduct();
        if(products == null)
        {
            throw new DataNotFoundException("Products Not Found...");
        }
        return products;
    }
    
    //Find product based using product id
    @RequestMapping(value = "/findProductById/{productId}" , method = RequestMethod.GET)
    @ResponseBody
    public Product findProductByProductID(@PathVariable int productId)
    {
        Product product = productService.findProductByProductId(productId);
        if(product == null)
        {
            throw new DataNotFoundException("Product Do Not exists...");
        }
        return product;
    }
    
    //Save Products
    @RequestMapping(value = "/saveProduct" , method = RequestMethod.POST)
    @ResponseBody
    public Product saveProduct(@RequestBody Product product) {
        
       Product products = productService.saveProduct(product);
       
       if(products == null)
       {
           throw new DataNotFoundException("Product could not be added...");
       }
       return products;
    }
    
    //delete products using product id
    @RequestMapping(value = "/deleteProduct/{productId}" , method = RequestMethod.DELETE)
    @ResponseBody
    public int deleteProduct(@PathVariable int productId)
    {
        int deleted = productService.deleteProduct(productId);
        
        if(deleted == 0)
        {
            throw new DataNotFoundException("Product could not be deleted...");
        }
       return deleted;
    }
     
    //Update products
    @RequestMapping(value = "/updateProduct/{productId}/{name}/{category}/{price}" , method = RequestMethod.PUT)
    @ResponseBody
    public int updateProduct(@PathVariable int productId, @PathVariable String name, @PathVariable String category, @PathVariable double price )
    {
        int updated = productService.updateProduct(productId, name, category, price);
        if(updated != 1)
        {
           throw new DataNotFoundException("Product not updated...");
        } 
        return updated;
    }
    
    //Get Product on Category name
    @RequestMapping(value = "/findProductByCategory/{category}" , method = RequestMethod.GET)
    @ResponseBody
    public ArrayList<Product> retrieveProductsByCategory(@PathVariable String category)
    {
        ArrayList<Product> listProducts = productService.findProductByCategory(category);
    
        if(listProducts == null)
        {
            throw new DataNotFoundException("Category name doesn't seem to exist!");
        }
        return listProducts;
    }     
} // end of code
