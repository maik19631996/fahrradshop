/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.bikeshopmodular;

import de.ostfalia.businesslogic.businesslogic.BusinessLogic;
import java.util.List;
import java.util.Map;

/**
 *
 * @author m
 */
public class FahrradKonfiguratorAppImpl implements FahrradKonfiguratorApp {
    private String rahmentyp;
    private String rahmenfarbe;
    private String reifen;
    private String antrieb;
    private int schrittlaenge;
    private int koerpergroesse;

    private BusinessLogic businesslogic;
    private List<String> antriebe;
    private List<String> rahmentypen;
    private List<String> rahmenfarben;
    private List<String> allReifen;

    private Map m;

    public FahrradKonfiguratorAppImpl(BusinessLogic businesslogic) {
        this.businesslogic = businesslogic;
        antriebe = this.businesslogic.getAllAntriebe();
        rahmentypen = this.businesslogic.getAllRahmenTypen();
        rahmenfarben = this.businesslogic.getAllRahmenfarben();
        allReifen = this.businesslogic.getAllReifen();
    }

    @Override
    public List<String> getRahmentypen() {
        return rahmentypen;
    }

    @Override
    public List<String> getRahmenfarben() {
        return rahmenfarben;
    }

    @Override
    public List<String> getAllReifen() {
        return allReifen;
    }

    @Override
    public List<String> getAntriebe() {
        return antriebe;
    }

    @Override
    public void setRahmentyp(String rahmentyp) {
        this.rahmentyp = rahmentyp;
    }

    @Override
    public void setRahmenfarbe(String rahmenfarbe) {
        this.rahmenfarbe = rahmenfarbe;
    }

    @Override
    public void setReifen(String reifen) {
        this.reifen = reifen;
    }

    @Override
    public void setAntrieb(String antrieb) {
        this.antrieb = antrieb;
    }

    @Override
    public void setSchrittlaenge(int schrittlaenge) {
        this.schrittlaenge = schrittlaenge;
    }

    @Override
    public void setKoerpergroesse(int koerpergroesse) {
        this.koerpergroesse = koerpergroesse;
    }

    @Override
    public void setFahrradKonfiguration() throws RuntimeException {
        businesslogic.setFahrradKonfiguration(rahmentyp, rahmenfarbe, reifen, antrieb, schrittlaenge, koerpergroesse);
    }

    @Override
    public String getSumPriceAsString() throws RuntimeException{
        setFahrradKonfiguration();
        m = businesslogic.getPrices();
        return String.format("%.2f", m.get("sum"));
    }
}
