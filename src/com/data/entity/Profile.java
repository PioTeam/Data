/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.data.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Camilo
 */

@Entity
@Table(name = "profile")
public class Profile implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long cedule;
    private String name;
    private String email;
    private double localBalance;

    public long getCedule() {
        return cedule;
    }

    public void setCedule(long cedule) {
        this.cedule = cedule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getLocalBalance() {
        return localBalance;
    }

    public void setBalance(double localBalance) {
        this.localBalance = localBalance;
    }   
    
}
