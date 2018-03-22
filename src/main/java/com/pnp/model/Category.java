package com.pnp.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 *
 * 
 */

@Entity
@Table(name = "category")
@NamedQueries({
    @NamedQuery(name = "Category.findAll", query = "SELECT c FROM Category c")
    , @NamedQuery(name = "Category.findByCatID", query = "SELECT c FROM Category c WHERE c.categoryID = :categoryID")
    , @NamedQuery(name = "Category.findByName", query = "SELECT c FROM Category c WHERE c.name = :name")})

public class Category implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "categoryID")
    private Integer categoryID;
    @Column(name = "name")
    private String name;

    public Category() {
    }

    public Category(Integer categoryID) {
        this.categoryID = categoryID;
    }
    public Category(Integer categoryID, String name) {
        this.categoryID = categoryID;
        this.name = name;
    }
    
    //setters and getters
    public Integer getCategoryID() {
        return categoryID;
    }
    public void setCategoryID(Integer categoryID) {
        this.categoryID = categoryID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
} // end of code
