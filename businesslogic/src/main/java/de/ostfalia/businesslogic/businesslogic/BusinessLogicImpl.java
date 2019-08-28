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
import java.util.Hashtable;
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
    private List<Rahmen> rahmenList = null;
    private List<Rahmenfarbe> rahmenfarbenList = null;
    private List<Reifen> reifenList = null;
    private List<Antrieb> antriebeList = null; 
    
    public BusinessLogicImpl(Database db) {
        this.db = db;
    }
    
    @Override
    public List<String> getAllRahmenTypen() {
        List<String> AllRahmenTypen = new ArrayList<String>();
        rahmenList = db.getAllRahmenTypen();
        
        for(Rahmen r : rahmenList) {
            AllRahmenTypen.add(r.toString());
        }
        
        return AllRahmenTypen;
    }
    
    @Override
    public List<String> getAllRahmenfarben(){
        List<String> AllRahmenfarben = new ArrayList<String>();
        rahmenfarbenList = db.getAllRahmenfarben();
        
        for(Rahmenfarbe r : rahmenfarbenList) {
            AllRahmenfarben.add(r.toString());
        }
        
        return AllRahmenfarben;
    }
    @Override
    public List<String> getAllReifen(){
        List<String> AllReifen = new ArrayList<String>();
        reifenList = db.getAllReifen();
        
        for(Reifen r: reifenList) {
            AllReifen.add(r.toString());
        }
        
        return AllReifen;
    }
    @Override
    public List<String> getAllAntriebe(){
        List<String> AllAntriebe = new ArrayList<String>();
        antriebeList = db.getAllAntriebe();
        
        for (Antrieb a: antriebeList) {
            AllAntriebe.add(a.toString());
        }
        
        return AllAntriebe;
    }
    
    @Override
    public void setFahrradKonfiguration(String rahmen, String rahmenfarbe, String reifen, String antrieb, String schrittlaenge, String koerpergroesse) {
        for (Rahmen r : rahmenList) {
            if (r.toString() == rahmen) {
                this.rahmen = r;
            }
        }
        
        for (Rahmenfarbe r : rahmenfarbenList) {
            if (r.toString() == rahmenfarbe) {
                this.rahmenfarbe = r;
            }
        }
        
        for (Reifen r : reifenList) {
            if (r.toString() == reifen) {
                this.reifen = r;
            }
        }       
        
        for (Antrieb a : antriebeList) {
            if (a.toString() == antrieb) {
                this.antrieb = a;
            }
        }
        
        if (rahmen == null || rahmenfarbe == null || reifen == null || antrieb == null) {
            String m = "";
            if (rahmen == null)
                m = "Rahmen nicht in Rahmenliste gefunden";
            if (rahmenfarbe == null)
                m = "Rahmenfarbe nicht in Rahmenfarbenliste gefunden";
            if (reifen == null)
                m = "Reifen nicht in Reifenliste gefunden";
            if (antrieb == null)
                m = "Antrieb nicht in Antriebsliste gefunden";
            
            rahmen = null;
            rahmenfarbe = null;
            reifen = null;
            antrieb = null;
            
            throw new InvalidConfigException(m);
        }           
    }
    
    @Override
    public Map getPrices() {
        if (rahmen == null || rahmenfarbe == null || reifen == null || antrieb == null)
            throw new InvalidConfigException("Konfiguration ist nicht gesetzt worden");
        
        else if (rahmen == null || rahmenfarbe == null || reifen == null || antrieb == null) {
            String m = "";
            if (rahmen == null)
                m = "Rahmen nicht in Rahmenliste gefunden";
            if (rahmenfarbe == null)
                m = "Rahmenfarbe nicht in Rahmenfarbenliste gefunden";
            if (reifen == null)
                m = "Reifen nicht in Reifenliste gefunden";
            if (antrieb == null)
                m = "Antrieb nicht in Antriebsliste gefunden";
            
            rahmen = null;
            rahmenfarbe = null;
            reifen = null;
            antrieb = null;
            
            throw new InvalidConfigException(m);
        }
        
        Map m = new Hashtable();
        m.put("rahmen", rahmen.getPrice());
        m.put("reifen", reifen.getPrice());
        m.put("antrieb", antrieb.getPrice());
        m.put("sum", rahmen.getPrice() + reifen.getPrice() + antrieb.getPrice());
            
        return m;
    }
}