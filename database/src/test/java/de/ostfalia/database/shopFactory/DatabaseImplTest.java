/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.ostfalia.database.shopFactory;

import de.ostfalia.businesslogic.database.Antrieb;
import de.ostfalia.businesslogic.database.Rahmen;
import de.ostfalia.businesslogic.database.Rahmenfarbe;
import de.ostfalia.businesslogic.database.Reifen;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author maik
 */
public class DatabaseImplTest {
    
    public DatabaseImplTest() {
    }

    

    /**
     * Test of getAllRahmenTypen method, of class DatabaseImpl.
     */
    @Test
    public void testGetAllRahmenTypen() {
        System.out.println("getAllRahmenTypen");
        DatabaseImpl instance = new DatabaseImpl();
        
        List<Rahmen> result = instance.getAllRahmenTypen();
        assertTrue(result.size() != 0);

        
    }

    /**
     * Test of getAllRahmenfarben method, of class DatabaseImpl.
     */
    @Test
    public void testGetAllRahmenfarben() {
        System.out.println("getAllRahmenfarben");
        DatabaseImpl instance = new DatabaseImpl();
        
        List<Rahmenfarbe> result = instance.getAllRahmenfarben();
       
        assertTrue(result.size() != 0);
    }

    /**
     * Test of getAllReifen method, of class DatabaseImpl.
     */
    @Test
    public void testGetAllReifen() {
        System.out.println("getAllReifen");
        DatabaseImpl instance = new DatabaseImpl();
        
        List<Reifen> result = instance.getAllReifen();
        assertTrue(result.size() != 0);
    }

    /**
     * Test of getAllAntriebe method, of class DatabaseImpl.
     */
    @Test
    public void testGetAllAntriebe() {
        System.out.println("getAllAntriebe");
        DatabaseImpl instance = new DatabaseImpl();
        
        List<Antrieb> result = instance.getAllAntriebe();
        
        assertTrue(result.size() != 0);
    }
    
}
