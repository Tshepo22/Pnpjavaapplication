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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * 
 */

@Entity
@Table(name = "provinces")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Provinces.findAll", query = "SELECT p FROM Provinces p")
    , @NamedQuery(name = "Provinces.findByProvinceID", query = "SELECT p FROM Provinces p WHERE p.provinceID = :provinceID")
    , @NamedQuery(name = "Provinces.findByName", query = "SELECT p FROM Provinces p WHERE p.name = :name")})
public class Provinces implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "provinceID")
    private Integer provinceID;
    @Column(name = "name")
    private String name;

    public Provinces() {
    }

    public Provinces(Integer provinceID) {
        this.provinceID = provinceID;
    }

    public Provinces(Integer provinceID, String name) {
        this.provinceID = provinceID;
        this.name = name;
    }

    public Integer getProvinceID() {
        return provinceID;
    }
    
    //setters and getters
    public void setProvinceID(Integer provinceID) {
        this.provinceID = provinceID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }   
} //end of code
