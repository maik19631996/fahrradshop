/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package injector;

import datamodell.Antrieb;
import datamodell.FahrradKonfiguration;
import datamodell.Rahmen;
import datamodell.Reifen;
import java.util.List;

/**
 *
 * @author maik
 */
public interface BikeShopInterface {
    public List<Antrieb> getAllAntriebe();
    public List<Rahmen> getAllRahmen();
    public List<Reifen> getAllReifen();
    public List<FahrradKonfiguration> getAllFahrradKonfiguration();
    public void persistNewRahmen(String typ,short farbe,double preis,String beschreibung);
    public void persistNewAntrieb(String name,String hersteller,String beschreibung,double preis);
    public void persistNewReifen(String typ, short farbe, double preis);
    public void persistNewFahrradKonfiguration(int reifen,int rahmen,int antrieb,int koerpergoesse,int schrittlaenge);
    
}
