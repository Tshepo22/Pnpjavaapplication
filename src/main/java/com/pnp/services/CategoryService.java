package com.pnp.services;

import com.pnp.model.Category;
import com.pnp.repositories.CatagoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * 
 */
@Service
public class CategoryService{
    
    @Autowired
    private CatagoryRepository categoryRepository;
    
    public int deleteCategory(String name)
    {
        return categoryRepository.deleteCategory(name);
    }
    public Object findAllCategories()
    {
        return categoryRepository.findAll();
    }
    public Category saveCategory(Category category)
    {
        return categoryRepository.save(category);
    }
} // end of code
