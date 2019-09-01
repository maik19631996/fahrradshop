/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.ostfalia.businesslogic.database;

/**
 *
 * @author Rubyn Angelo Stark
 */
public interface Fahrradkonfiguration {
    public Antrieb getAntrieb();
    public Rahmen getRahmen();
    public Rahmenfarbe getRahmenfarbe();
    public Reifen getReifen();
    public int getSchrittlaengel();
    public int getKoerpergroesse();
}
