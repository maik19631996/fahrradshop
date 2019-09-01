/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.bikeshopmodular;

import de.ostfalia.businesslogic.businesslogic.FacBusinessLogic;
import de.ostfalia.businesslogic.businesslogic.FacBusinessLogicImpl;
import de.ostfalia.businesslogic.businesslogic.InvalidConfigException;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Rene Hellmuth
 */
public class FahrradKonfiguratorAppImplTest {
    private FahrradKonfiguratorApp instance;
    
    FahrradKonfiguratorAppImplTest() {
        FacFahrradKonfiguratorApp fkFac = new FacFahrradKonfiguratorAppImpl();
        FacBusinessLogic facB = new FacBusinessLogicImpl();        
        instance = fkFac.create(facB.create(new DbTestImpl()));
    }

    /**
     * Test of getRahmentypen method, of class FahrradKonfiguratorAppImpl.
     */
    @Test
    public void testGetRahmentypen() {
        System.out.println("getRahmentypen");
        List<String> expResult = new ArrayList<>();
        expResult.add("rahmen 1");
        expResult.add("rahmen 2");
        
        List<String> result = instance.getRahmentypen();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRahmenfarben method, of class FahrradKonfiguratorAppImpl.
     */
    @Test
    public void testGetRahmenfarben() {
        System.out.println("getRahmenfarben");
        List<String> expResult = new ArrayList<>();
        expResult.add("rahmenfarbe 1");
        expResult.add("rahmenfarbe 2");
        
        List<String> result = instance.getRahmenfarben();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAllReifen method, of class FahrradKonfiguratorAppImpl.
     */
    @Test
    public void testGetAllReifen() {
        System.out.println("getAllReifen");
        List<String> expResult = new ArrayList<>();
        expResult.add("reifen 1");
        expResult.add("reifen 2");
        
        List<String> result = instance.getAllReifen();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAntriebe method, of class FahrradKonfiguratorAppImpl.
     */
    @Test
    public void testGetAntriebe() {
        System.out.println("getAntriebe");
        List<String> expResult = new ArrayList<>();
        expResult.add("antrieb 1");
        expResult.add("antrieb 2");
        
        List<String> result = instance.getAntriebe();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRahmentyp method, of class FahrradKonfiguratorAppImpl.
     */
    @Test
    public void testSetRahmentyp() {
        System.out.println("setRahmentyp");
        String rahmentyp = "rahmen 2";
        instance.setRahmentyp(rahmentyp);
    }

    /**
     * Test of setRahmenfarbe method, of class FahrradKonfiguratorAppImpl.
     */
    @Test
    public void testSetRahmenfarbe() {
        System.out.println("setRahmenfarbe");
        String rahmenfarbe = "rahmenfarbe 1";
        instance.setRahmenfarbe(rahmenfarbe);
    }

    /**
     * Test of setReifen method, of class FahrradKonfiguratorAppImpl.
     */
    @Test
    public void testSetReifen() {
        System.out.println("setReifen");
        String reifen = "reifen 1";
        instance.setReifen(reifen);
    }

    /**
     * Test of setAntrieb method, of class FahrradKonfiguratorAppImpl.
     */
    @Test
    public void testSetAntrieb() {
        System.out.println("setAntrieb");
        String antrieb = "antrieb 2";
        instance.setAntrieb(antrieb);
    }

    /**
     * Test of setSchrittlaenge method, of class FahrradKonfiguratorAppImpl.
     */
    @Test
    public void testSetSchrittlaenge() {
        System.out.println("setSchrittlaenge");
        int schrittlaenge = 10;
        instance.setSchrittlaenge(schrittlaenge);
    }

    /**
     * Test of setKoerpergroesse method, of class FahrradKonfiguratorAppImpl.
     */
    @Test
    public void testSetKoerpergroesse() {
        System.out.println("setKoerpergroesse");
        int koerpergroesse = 10;
        instance.setKoerpergroesse(koerpergroesse);
    }

    /**
     * Test of setFahrradKonfiguration method, of class FahrradKonfiguratorAppImpl.
     */
    @Test
    public void testSetFahrradKonfiguration() {
        System.out.println("setFahrradKonfiguration");
        try {
            instance.setFahrradKonfiguration();
        } catch (InvalidConfigException er) {
            System.out.println(er);
        }
    }

    /**
     * Test of getSumPriceAsString method, of class FahrradKonfiguratorAppImpl.
     */
    @Test
    public void testGetSumPriceAsString() {
        System.out.println("getSumPriceAsString");
        String expResult = "150.0";
        
        try {
            String result = instance.getSumPriceAsString();
            assertEquals(expResult, result);
        } catch (InvalidConfigException er) {
           System.out.println(er);
        }
    }
}
