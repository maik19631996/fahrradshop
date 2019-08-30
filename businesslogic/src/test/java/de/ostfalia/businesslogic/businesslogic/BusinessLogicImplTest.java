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
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author z
 */
public class BusinessLogicImplTest {
    private static BusinessLogic instance;    
    
    BusinessLogicImplTest() {
        instance = new BusinessLogicImpl(new DbTestImpl());
    }

    /**
     * Test of getAllRahmenTypen method, of class BusinessLogicImpl.
     */
    @Test
    public void testGetAllRahmenTypen() {
        System.out.println("getAllRahmenTypen");
        List<String> expResult = new ArrayList<>();
        expResult.add("rahmen 1");
        expResult.add("rahmen 2");
        List<String> result = instance.getAllRahmenTypen();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAllRahmenfarben method, of class BusinessLogicImpl.
     */
    @Test
    public void testGetAllRahmenfarben() {
        System.out.println("getAllRahmenfarben");
        List<String> expResult = new ArrayList<>();
        expResult.add("rahmenfarbe 1");
        expResult.add("rahmenfarbe 2");
        List<String> result = instance.getAllRahmenfarben();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAllReifen method, of class BusinessLogicImpl.
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
     * Test of getAllAntriebe method, of class BusinessLogicImpl.
     */
    @Test
    public void testGetAllAntriebe() {
        System.out.println("getAllAntriebe");
        List<String> expResult = new ArrayList<>();
        expResult.add("antrieb 1");
        expResult.add("antrieb 2");
        List<String> result = instance.getAllAntriebe();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFahrradKonfiguration method, of class BusinessLogicImpl.
     */
    @Test
    public void testSetFahrradKonfiguration() {
        System.out.println("setFahrradKonfiguration");
        String rahmen = "rahmen 1";
        String rahmenfarbe = "rahmenfarbe 2";
        String reifen = "reifen 1";
        String antrieb = "antrieb 2";
        int schrittlaenge = 10;
        int koerpergroesse = 10;
        instance.setFahrradKonfiguration(rahmen, rahmenfarbe, reifen, antrieb, schrittlaenge, koerpergroesse);
    }

    /**
     * Test of getPrices method, of class BusinessLogicImpl.
     */
    @Test
    public void testGetPrices() throws RuntimeException {
        System.out.println("getPrices");        
       
        Map expResult = new HashMap();
        expResult.put("rahmen", 50.0);
        expResult.put("reifen", 50.0);
        expResult.put("antrieb", 50.0);
        expResult.put("sum", 150.0);
        
        try {
            Map result = instance.getPrices();
            assertEquals(expResult, result);
        } catch (InvalidConfigException er) {
           assertEquals(er.getMessage(), "Konfiguration ist nicht gesetzt worden");            
        }
    }
}