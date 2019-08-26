/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic;

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
    private Antrieb a;
    private Rahmen ra;
    private Reifen re;
    
    @Override
    public Map getPrices(FahrradKonfiguration f, Antrieb a, Rahmen ra, Reifen re) {
        this.f = f;
        this.a = a;
        this.ra = ra;
        this.re = re;
        
        Map<String,Double> m = new HashMap<String,Double>();
        
        m.put("Antrieb", a.getPreis());
        m.put("Rahmen", ra.getPreis());
        m.put("Reifen", re.getPreis());
        m.put("sum", a.getPreis() + ra.getPreis() + re.getPreis());
        return m;
    }
    
    // todo
    @Override
    public List<Antrieb> getListAntrieb() {
        return new ArrayList<Antrieb>();
    }
    
    // todo
    @Override
    public List<Rahmen> getListRahmen() {
        return new ArrayList<Rahmen>();
    }
    
    // todo
    @Override
    public List<Reifen> getListReifen() {
        return new ArrayList<Reifen>();
    }
}