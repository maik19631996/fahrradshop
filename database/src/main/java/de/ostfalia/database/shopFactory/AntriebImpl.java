/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.ostfalia.database.shopFactory;

import de.ostfalia.businesslogic.database.Antrieb;


/**
 *
 * @author maik
 */
class AntriebImpl implements Antrieb{
    private double price;
    private String name;

    public AntriebImpl(double price,String name) {
        this.price = price;
        this.name = name;
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
