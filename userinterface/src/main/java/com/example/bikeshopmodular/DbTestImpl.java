/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.bikeshopmodular;

import de.ostfalia.businesslogic.database.Antrieb;
import de.ostfalia.businesslogic.database.Database;
import de.ostfalia.businesslogic.database.Rahmen;
import de.ostfalia.businesslogic.database.Rahmenfarbe;
import de.ostfalia.businesslogic.database.Reifen;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rubyn Angelo Stark
 */
public class DbTestImpl implements Database {
    private List<Rahmen> rahmen;
    private List<Rahmenfarbe> rahmenfarben;
    private List<Reifen> reifen;
    private List<Antrieb> antriebe;
    
    public DbTestImpl() {
        rahmen = new ArrayList<>();
        rahmen.add(new TestConfigItemImpl("rahmen 1"));
        rahmen.add(new TestConfigItemImpl("rahmen 2"));
        
        rahmenfarben = new ArrayList<>();
        rahmenfarben.add(new TestConfigItemImpl("rahmenfarbe 1"));
        rahmenfarben.add(new TestConfigItemImpl("rahmenfarbe 2"));
        
        reifen = new ArrayList<>();
        reifen.add(new TestConfigItemImpl("reifen 1"));
        reifen.add(new TestConfigItemImpl("reifen 2"));
        
        antriebe = new ArrayList<>();
        antriebe.add(new TestConfigItemImpl("antrieb 1"));
        antriebe.add(new TestConfigItemImpl("antrieb 2"));
    }
    
    @Override
    public List<Rahmen> getAllRahmenTypen(){
        return rahmen;
    }
    
    @Override
    public List<Rahmenfarbe> getAllRahmenfarben(){
        return rahmenfarben;
    }
    
    @Override
    public List<Reifen> getAllReifen(){
        return reifen;
    }
    
    @Override
    public List<Antrieb> getAllAntriebe(){
        return antriebe;
    }
}
