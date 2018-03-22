package com.pnp.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

/**
 *
 * 
 */

@Entity
@NamedQueries({
    @NamedQuery(name = "Banknames.findAll", query = "SELECT b FROM Banknames b")
    , @NamedQuery(name = "Banknames.findByBankID", query = "SELECT b FROM Banknames b WHERE b.bankID = :bankID")
    , @NamedQuery(name = "Banknames.findByName", query = "SELECT b FROM Banknames b WHERE b.name = :name")})
public class Banknames implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name = "bankID")
    private Integer bankID;
   
    @Column(name = "name")
    private String name;

    public Banknames() {
    }

    public Banknames(Integer bankID) {
        this.bankID = bankID;
    }

    public Banknames(Integer bankID, String name) {
        this.bankID = bankID;
        this.name = name;
    }
    
    //setters and getters
    public Integer getBankID() {
        return bankID;
    }
    public void setBankID(Integer bankID) {
        this.bankID = bankID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
} //end of code
