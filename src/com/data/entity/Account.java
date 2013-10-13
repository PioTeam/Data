/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.data.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Camilo
 */
@Entity
@Table(name = "account")
public class Account {
    @Id
    private String numberAccount;
    private double balance;
    @OneToOne
    private Profile profile;

    public String getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(String numberAccount) {
        this.numberAccount = numberAccount;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }
    
}
