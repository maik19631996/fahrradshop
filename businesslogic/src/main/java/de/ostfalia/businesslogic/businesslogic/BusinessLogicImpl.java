/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.ostfalia.businesslogic.businesslogic;

import de.ostfalia.businesslogic.database.Database;
import de.ostfalia.businesslogic.database.Rahmen;
import de.ostfalia.businesslogic.database.Rahmenfarbe;
import de.ostfalia.businesslogic.database.Reifen;
import de.ostfalia.businesslogic.database.Antrieb;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author z
 */
public class BusinessLogicImpl implements BusinessLogic {

    private Database db;
    private Rahmen rahmen;
    private Rahmenfarbe rahmenfarbe;
    private Reifen reifen;
    private Antrieb antrieb;
    private int schrittlaenge = -1;
    private int koerpergroesse = -1;
    private List<Rahmen> rahmenList = null;
    private List<Rahmenfarbe> rahmenfarbenList = null;
    private List<Reifen> reifenList = null;
    private List<Antrieb> antriebeList = null; 
    
    public BusinessLogicImpl(Database db) {
        this.db = db;
        rahmenList = db.getAllRahmenTypen();
        rahmenfarbenList = db.getAllRahmenfarben();
        reifenList = db.getAllReifen();
        antriebeList = db.getAllAntriebe();
    }
    
    @Override
    public List<String> getAllRahmenTypen() {
        List<String> AllRahmenTypen = new ArrayList<>();
        rahmenList = db.getAllRahmenTypen();
        
        for(Rahmen r : rahmenList) {
            AllRahmenTypen.add(r.toString());
        }
        
        return AllRahmenTypen;
    }
    
    @Override
    public List<String> getAllRahmenfarben(){
        List<String> AllRahmenfarben = new ArrayList<>();
        rahmenfarbenList = db.getAllRahmenfarben();
        
        for(Rahmenfarbe r : rahmenfarbenList) {
            AllRahmenfarben.add(r.toString());
        }
        
        return AllRahmenfarben;
    }
    @Override
    public List<String> getAllReifen(){
        List<String> AllReifen = new ArrayList<>();
        reifenList = db.getAllReifen();
        
        for(Reifen r: reifenList) {
            AllReifen.add(r.toString());
        }
        
        return AllReifen;
    }
    @Override
    public List<String> getAllAntriebe(){
        List<String> AllAntriebe = new ArrayList<>();
        antriebeList = db.getAllAntriebe();
        
        for (Antrieb a: antriebeList) {
            AllAntriebe.add(a.toString());
        }
        
        return AllAntriebe;
    }
    
    @Override
    public void setFahrradKonfiguration(String rahmen, String rahmenfarbe, String reifen, String antrieb, int schrittlaenge, int koerpergroesse) {
        this.rahmen = null;
        this.rahmenfarbe = null;
        this.reifen = null;
        this.antrieb = null;
        this.schrittlaenge = -1;
        this.koerpergroesse = -1; 
        
        for (Rahmen r : rahmenList) {
            if (r.toString().equals(rahmen)) {
                this.rahmen = r;
            }
        }
        
        for (Rahmenfarbe r : rahmenfarbenList) {
            if (r.toString().equals(rahmenfarbe)) {
                this.rahmenfarbe = r;
            }
        }
        
        for (Reifen r : reifenList) {
            if (r.toString().equals(reifen)) {
                this.reifen = r;
            }
        }       
        
        for (Antrieb a : antriebeList) {
            if (a.toString().equals(antrieb)) {
                this.antrieb = a;
            }
        }
        
        if (schrittlaenge >= 0) {
            this.schrittlaenge = schrittlaenge;            
        }
        
        if (koerpergroesse >= 0) {
            this.koerpergroesse = koerpergroesse;
        }
                
        if (this.rahmen == null || this.rahmenfarbe == null || this.reifen == null || this.antrieb == null || schrittlaenge == -1 || koerpergroesse == -1) {
            String m = "";
            if (this.rahmen == null)
                m = "Rahmen nicht in Rahmenliste gefunden";
            else if (this.rahmenfarbe == null)
                m = "Rahmenfarbe nicht in Rahmenfarbenliste gefunden";
            else if (this.reifen == null)
                m = "Reifen nicht in Reifenliste gefunden";
            else if (this.antrieb == null)
                m = "Antrieb nicht in Antriebsliste gefunden";
            else if (schrittlaenge == -1)
                m = "Schrittlänge muss größer als 0 sein!";
            else if (koerpergroesse == -1)
                 m = "Körpergröße muss größer als 0 sein!";        
            
            this.rahmen = null;
            this.rahmenfarbe = null;
            this.reifen = null;
            this.antrieb = null;
            this.schrittlaenge = -1;
            this.koerpergroesse = -1; 
            
            throw new InvalidConfigException(m);
        }           
    }
    
    @Override
    public Map getPrices() {
        if (rahmen == null && reifen == null && antrieb == null)
            throw new InvalidConfigException("Konfiguration ist nicht gesetzt worden");
        
        Map m = new HashMap();
        m.put("rahmen", rahmen.getPrice());
        m.put("reifen", reifen.getPrice());
        m.put("antrieb", antrieb.getPrice());
        m.put("sum", rahmen.getPrice() + reifen.getPrice() + antrieb.getPrice());
            
        return m;
    }
}