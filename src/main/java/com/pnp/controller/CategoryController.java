package com.pnp.controller;

import com.pnp.exceptions.DataNotFoundException;
import com.pnp.model.Category;
import com.pnp.services.CategoryService;
import java.sql.SQLException;
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
@RequestMapping(value = "/category")
public class CategoryController{
     
    @Autowired
    private CategoryService categoryService;
    
    //Find all categories
    @RequestMapping(value = "/findAllCategories", method = RequestMethod.GET)
    @ResponseBody
    public Object getAllRep()
    {
        Object object = categoryService.findAllCategories();
        if(object == null)
        {
            throw new DataNotFoundException("Category Not Deleted...");
        }
       return object; 
    }
  
    //Saves Categories
    @RequestMapping(value = "/saveCategory", method = RequestMethod.POST)
    @ResponseBody
    public Category saveCategory(@RequestBody Category category) throws SQLException
    {
        Category categorys = categoryService.saveCategory(category);
        
        if(categorys == null)
        {
            throw new DataNotFoundException("Category could not be Saved...");
        }
        return categorys;         
    }
   
    //Delete Categories using category id
    @RequestMapping(value = "/deleteCategory/{name}", method = RequestMethod.DELETE)
    @ResponseBody
    public int deleteCategory(@PathVariable String name)
    {
        int deleteRow = categoryService.deleteCategory(name);
        
        if(deleteRow != 1)
        {
            throw new DataNotFoundException("Category could not be deleted...");
        }   
        return deleteRow;         
    }   
} //end of code
