/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.ostfalia.businesslogic.businesslogic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author z
 */
public class BusinessLogicImpl implements BusinessLogic {
    private FahrradKonfiguration f;
    
    @Override
    public Map getPrices(FahrradKonfiguration f) {
        this.f = f;
        
        Map<String,Double> m = new HashMap<String,Double>();
        
        m.put("Antrieb", f.getAntrieb().getPreis());
        m.put("Rahmen", f.getRahmen().getPreis());
        m.put("Reifen", f.getReifen().getPreis());
        m.put("sum", f.getAntrieb().getPreis() + f.getRahmen().getPreis() + f.getReifen().getPreis());
        return m;
    }
}