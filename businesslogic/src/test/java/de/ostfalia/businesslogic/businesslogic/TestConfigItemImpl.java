/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.ostfalia.businesslogic.businesslogic;

import de.ostfalia.businesslogic.database.Antrieb;
import de.ostfalia.businesslogic.database.Rahmen;
import de.ostfalia.businesslogic.database.Rahmenfarbe;
import de.ostfalia.businesslogic.database.Reifen;

/**
 *
 * @author z
 */
public class TestConfigItemImpl implements Antrieb, Rahmen, Rahmenfarbe, Reifen {
    private String type;
    
    public TestConfigItemImpl(String type) {
        this.type = type;
    }
        
    @Override
    public String toString() {
        return String.format("%s", type);
    }
    
    @Override
    public double getPrice() {
        return 50.0;
    }
}