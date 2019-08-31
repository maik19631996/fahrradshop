/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.ostfalia.database.shopFactory;

import de.ostfalia.businesslogic.database.Rahmenfarbe;

/**
 *
 * @author maik
 */
class RahmenFarbeImpl implements Rahmenfarbe{
    private String farbe;

    public RahmenFarbeImpl(String farbe) {
        this.farbe = farbe;
    }
    
    @Override
    public String toString(){
        return farbe;
    }
    
}
