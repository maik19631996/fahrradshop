/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.ostfalia.database.shopFactory;

import de.ostfalia.businesslogic.database.Reifen;

/**
 *
 * @author maik
 */
class ReifenImpl implements Reifen{
    private String name;
    private double price;

    public ReifenImpl(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    
    
    @Override
    public double getPrice() {
        return price;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
}
