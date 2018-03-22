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
    @NamedQuery(name = "Bank.findAll", query = "SELECT b FROM Bank b")
    , @NamedQuery(name = "Bank.findByBankID", query = "SELECT b FROM Bank b WHERE b.bankID = :bankID")
    , @NamedQuery(name = "Bank.findByCardno", query = "SELECT b FROM Bank b WHERE b.cardno = :cardno")
    , @NamedQuery(name = "Bank.findByCardholder", query = "SELECT b FROM Bank b WHERE b.cardholder = :cardholder")
    , @NamedQuery(name = "Bank.findByBankname", query = "SELECT b FROM Bank b WHERE b.bankname = :bankname")
    , @NamedQuery(name = "Bank.findByBalance", query = "SELECT b FROM Bank b WHERE b.balance = :balance")})

public class Bank implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bankID")
    private Integer bankID;
    @Column(name = "cardno")
    private int cardno;
    @Column(name = "cardholder")
    private String cardholder;
    @Column(name = "bankname")
    private String bankname;
    @Column(name = "balance")
    private double balance;

    public Bank() {
    }

    public Bank(Integer bankID) {
        this.bankID = bankID;
    }

    public Bank(Integer bankID, int cardno, String cardholder, String bankname, double balance) {
        this.bankID = bankID;
        this.cardno = cardno;
        this.cardholder = cardholder;
        this.bankname = bankname;
        this.balance = balance;
    }
    //setters and getters
    public Integer getBankID() {
        return bankID;
    }

    public void setBankID(Integer bankID) {
        this.bankID = bankID;
    }

    public int getCardno() {
        return cardno;
    }

    public void setCardno(int cardno) {
        this.cardno = cardno;
    }

    public String getCardholder() {
        return cardholder;
    }

    public void setCardholder(String cardholder) {
        this.cardholder = cardholder;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
} //end of code
