/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.bikeshopmodular;

/**
 *
 * @author maik
 */
public interface FahrradKonfiguration {
    public int getID();
    public Rahmen getRahmen();
    public Reifen getReifen();
    public Antrieb getAntrieb();
    public int getKoepergroesse();
    public int getSchrittlaenge();
    
    
}
