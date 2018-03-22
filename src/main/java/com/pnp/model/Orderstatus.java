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
@Table(name = "orderstatus")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Orderstatus.findAll", query = "SELECT o FROM Orderstatus o")
    , @NamedQuery(name = "Orderstatus.findByStatusID", query = "SELECT o FROM Orderstatus o WHERE o.statusID = :statusID")
    , @NamedQuery(name = "Orderstatus.findByName", query = "SELECT o FROM Orderstatus o WHERE o.name = :name")})
public class Orderstatus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "statusID")
    private Integer statusID;
    
    @Column(name = "name")
    private String name;

    public Orderstatus() {
    }
    public Orderstatus(Integer statusID) {
        this.statusID = statusID;
    }
    public Orderstatus(Integer statusID, String name) {
        this.statusID = statusID;
        this.name = name;
    }
    public Integer getStatusID() {
        return statusID;
    }
    public void setStatusID(Integer statusID) {
        this.statusID = statusID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
} // end of code
