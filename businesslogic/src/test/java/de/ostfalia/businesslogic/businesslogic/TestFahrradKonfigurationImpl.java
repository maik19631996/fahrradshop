/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.ostfalia.businesslogic.businesslogic;

import de.ostfalia.businesslogic.database.Antrieb;
import de.ostfalia.businesslogic.database.Fahrradkonfiguration;
import de.ostfalia.businesslogic.database.Rahmen;
import de.ostfalia.businesslogic.database.Rahmenfarbe;
import de.ostfalia.businesslogic.database.Reifen;

/**
 *
 * @author z
 */
public class TestFahrradKonfigurationImpl implements Fahrradkonfiguration {
    
    private Antrieb antrieb;
    private Rahmen rahmen;
    private Rahmenfarbe rahmenfarbe;
    private Reifen reifen;
    private int schrittlaenge;
    private int koerpergroesse;
    
    public TestFahrradKonfigurationImpl() {
        antrieb = new TestConfigItemImpl("antrieb");
        rahmen = new TestConfigItemImpl("rahmen");
        rahmenfarbe = new TestConfigItemImpl("rahmenfarbe");
        reifen = new TestConfigItemImpl("reifen");
        schrittlaenge = 10;
        koerpergroesse = 11;
    }
    
    @Override
    public Antrieb getAntrieb(){
        return antrieb;
    }
    
    @Override
    public Rahmen getRahmen(){
        return rahmen;
    }
    
    @Override
    public Rahmenfarbe getRahmenfarbe() {
        return rahmenfarbe;
    }
    
    @Override
    public Reifen getReifen(){
        return reifen;
    }
    
    @Override
    public int getSchrittlaengel(){
        return schrittlaenge;
    }
    
    @Override
    public int getKoerpergroesse(){
        return koerpergroesse;
    }   
}
