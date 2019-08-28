/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.ostfalia.businesslogic.businesslogic;
import de.ostfalia.businesslogic.database.Database;
import java.util.List;
import java.util.Map;

/**
 *
 * @author z
 */
public interface BusinessLogic {    
    public List<String> getAllRahmenTypen();
    public List<String> getAllRahmenfarben();
    public List<String> getAllReifen();
    public List<String> getAllAntriebe();
    
    public void setFahrradKonfiguration(String rahmen, String rahmenfarbe, String reifen, String antrieb, int schrittlaenge, int koerpergroesse) throws RuntimeException;    
   
    public Map getPrices() throws RuntimeException;
}
