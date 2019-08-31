/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.ostfalia.database.shopFactory;

import de.ostfalia.businesslogic.database.Antrieb;
import de.ostfalia.businesslogic.database.Database;
import de.ostfalia.businesslogic.database.Rahmen;
import de.ostfalia.businesslogic.database.Rahmenfarbe;
import de.ostfalia.businesslogic.database.Reifen;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import jdbc.H2DBinit;

/**
 *
 * @author maik
 */
public class DatabaseImpl implements Database {

    public DatabaseImpl() {
        boolean dbInit = H2DBinit.getOrCreateDB();
    }
    

    @Override
    public List<Rahmen> getAllRahmenTypen() {
        List<Rahmen> returning = new ArrayList<Rahmen>();
        try {
            Class.forName("org.h2.Driver");
            Connection conn = DriverManager.getConnection("jdbc:h2:./.db/data", "sa", "");
            Statement statment = conn.createStatement();

            ResultSet result = statment.executeQuery("SELECT typ, preis FROM Rahmen");

            while (result.next()) {
                returning.add(new RahmenImpl(result.getNString("typ"), result.getDouble("preis")));
            }
            statment.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatabaseImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return returning;
    }

    @Override
    public List<Rahmenfarbe> getAllRahmenfarben() {
        List<Rahmenfarbe> returning = new ArrayList<Rahmenfarbe>();
        try {
            Class.forName("org.h2.Driver");
            Connection conn = DriverManager.getConnection("jdbc:h2:./.db/data", "sa", "");
            Statement statment = conn.createStatement();

            ResultSet result = statment.executeQuery("SELECT name FROM RahmenFarbe");

            while (result.next()) {
                returning.add(new RahmenFarbeImpl(result.getNString("name")));
            }
            statment.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatabaseImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return returning;
    }

    @Override
    public List<Reifen> getAllReifen() {
        List<Reifen> returning = new ArrayList<Reifen>();
        try {
            Class.forName("org.h2.Driver");
            Connection conn = DriverManager.getConnection("jdbc:h2:./.db/data", "sa", "");
            Statement statment = conn.createStatement();

            ResultSet result = statment.executeQuery("SELECT typ,preis FROM Reifen");

            while (result.next()) {
                returning.add(new ReifenImpl(result.getNString("typ"), result.getDouble("preis")));
            }
            statment.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatabaseImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return returning;
    }

    @Override
    public List<Antrieb> getAllAntriebe() {
        List<Antrieb> returning = new ArrayList<Antrieb>();
        try {
            Class.forName("org.h2.Driver");
            Connection conn = DriverManager.getConnection("jdbc:h2:./.db/data", "sa", "");
            Statement statment = conn.createStatement();

            ResultSet result = statment.executeQuery("SELECT name, preis FROM Antrieb");

            while (result.next()) {
                returning.add(new AntriebImpl(result.getDouble("preis"), result.getNString("name")));
            }
            statment.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DatabaseImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return returning;
    }
    

}
