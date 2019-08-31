/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.ostfalia.database.shopFactory;

import de.ostfalia.businesslogic.database.Rahmen;

/**
 *
 * @author maik
 */
public class RahmenImpl implements Rahmen{
    private String typ;
    private double price;

    public RahmenImpl(String typ, double price) {
        this.typ = typ;
        this.price = price;
    }

    
    @Override
    public double getPrice() {
        return price;
    }
    
    @Override
    public String toString(){
        return typ;
    }
    
    
}
