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
@Table(name = "addresstypes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Addresstypes.findAll", query = "SELECT a FROM Addresstypes a")
    , @NamedQuery(name = "Addresstypes.findByAddresstypeID", query = "SELECT a FROM Addresstypes a WHERE a.addresstypeID = :addresstypeID")
    , @NamedQuery(name = "Addresstypes.findByName", query = "SELECT a FROM Addresstypes a WHERE a.name = :name")})
public class Addresstypes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "addresstypeID")
    private Integer addresstypeID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "name")
    private String name;

    public Addresstypes() {
    }

    public Addresstypes(Integer addresstypeID) {
        this.addresstypeID = addresstypeID;
    }

    public Addresstypes(Integer addresstypeID, String name) {
        this.addresstypeID = addresstypeID;
        this.name = name;
    }

    public Integer getAddresstypeID() {
        return addresstypeID;
    }

    public void setAddresstypeID(Integer addresstypeID) {
        this.addresstypeID = addresstypeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (addresstypeID != null ? addresstypeID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Addresstypes)) {
            return false;
        }
        Addresstypes other = (Addresstypes) object;
        if ((this.addresstypeID == null && other.addresstypeID != null) || (this.addresstypeID != null && !this.addresstypeID.equals(other.addresstypeID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.florist.NetFlorist.model.Addresstypes[ addresstypeID=" + addresstypeID + " ]";
    }   
} //end of code
