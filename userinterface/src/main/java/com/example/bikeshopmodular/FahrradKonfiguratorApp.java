/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.bikeshopmodular;
import java.util.List;
/**
 *
 * @author Rene Hellmuth
 */
public interface FahrradKonfiguratorApp {
    public List<String> getRahmentypen();
    public List<String> getRahmenfarben(); 
    public List<String> getAllReifen();
    public List<String> getAntriebe();
    public void setRahmentyp(String rahmentyp);
    public void setRahmenfarbe(String rahmenfarbe);
    public void setReifen(String reifen);
    public void setAntrieb(String antrieb);
    public void setSchrittlaenge(int schrittlaenge);
    public void setKoerpergroesse(int koerpergroesse);
    public void setFahrradKonfiguration();
    public String getSumPriceAsString();
}
