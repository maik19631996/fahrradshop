/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businesslogic;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Rubyn Angelo Stark
 */
public interface BusinessLogic {
    Map getPrices(FahrradKonfiguration f, Antrieb a, Rahmen ra, Reifen re);
    
    List<Antrieb> getListAntrieb();
    
    List<Rahmen> getListRahmen();
    
    List<Reifen> getListReifen();
}