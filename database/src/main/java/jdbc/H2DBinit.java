/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author maik
 */
public class H2DBinit {

    static boolean getOrCreateDB() {

        try {
            Class.forName("org.h2.Driver");
            Connection conn = DriverManager.getConnection("jdbc:h2:./.db/data", "sa", "");
            Statement statment = conn.createStatement();

            statment.execute("CREATE SCHEMA BikeShop_schema AUTHORIZATION sa ;");//unsafe init to interrupt when the Database exist through catch block
            statment.execute("CREATE Table IF NOT EXISTS Reifen ("
                    + "id INT NOT NULL AUTO_INCREMENT,"
                    + "typ VARCHAR(511),"
                    + "preis DOUBLE"
                    + ");");
            statment.execute("INSERT INTO  Reifen(typ,preis) Values('Road Cruiser',0.0);");
            statment.execute("INSERT INTO  Reifen(typ,preis) Values('Fat Tank',19.0);");
            statment.execute("INSERT INTO  Reifen(typ,preis) Values('Kojak',39.0);");
            statment.execute("INSERT INTO  Reifen(typ,preis) Values('Marathon plus',39.0);");
            
            statment.execute("CREATE Table IF NOT EXISTS RahmenFarbe ("
                    + "id INT NOT NULL AUTO_INCREMENT,"
                    + "name VARCHAR(511),"
                    + ");");
            statment.execute("INSERT INTO  RahmenFarbe(name) Values('rot');");
            statment.execute("INSERT INTO  RahmenFarbe(name) Values('gelb');");
            statment.execute("INSERT INTO  RahmenFarbe(name) Values('grün');");
            statment.execute("INSERT INTO  RahmenFarbe(name) Values('blau');");
            statment.execute("INSERT INTO  RahmenFarbe(name) Values('schwarz');");
            statment.execute("INSERT INTO  RahmenFarbe(name) Values('weiß');");
            
            statment.execute("CREATE Table IF NOT EXISTS Rahmen ("
                    + "id INT NOT NULL AUTO_INCREMENT,"
                    + "typ VARCHAR(511),"
                    + "preis DOUBLE"
                    + ");");
            statment.execute("INSERT INTO  Rahmen(typ,preis) Values('Herren-Rahmen',1266.0);");
            statment.execute("INSERT INTO  Rahmen(typ,preis) Values('Damen-Rahmen',1266.0);");
            
            
            statment.execute("CREATE Table IF NOT EXISTS Antrieb ("
                    + "id INT NOT NULL AUTO_INCREMENT,"
                    + "name VARCHAR(511),"
                    + "preis DOUBLE"
                    + ");");
            statment.execute("INSERT INTO  Antrieb(name,preis) Values('1-Gang SHIMANO mit Rücktritt',0.0);");
            statment.execute("INSERT INTO  Antrieb(name,preis) Values('3-Gang SHIMANO mit Rücktritt',119.0);");
            statment.execute("INSERT INTO  Antrieb(name,preis) Values('8-Gang SHIMANO Nexus Premium',189.0);");
            statment.execute("INSERT INTO  Antrieb(name,preis) Values('8-Gang SHIMANO Alfine',319.0);");
            statment.execute("INSERT INTO  Antrieb(name,preis) Values('10-Gang SHIMANO Deore',249.0);");
            
            statment.execute("CREATE Table IF NOT EXISTS FahrradKonfiguration ("
                    + "id INT NOT NULL AUTO_INCREMENT,"
                    + "antriebID INT,"
                    + "rahmenID INT,"
                    + "rahmenFarbe VARCHAR(511),"
                    + "reifenID INT,"
                    + "schrittlaenge INT,"
                    + "koerpergoesse INT,"
                    + ");");
            
            
            statment.close();
            conn.close();

            return true;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(H2DBinit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(H2DBinit.class.getName()).log(Level.SEVERE, null, ex);         
        }

        return false;
    }

    public static void main(String[] args) {
        getOrCreateDB();
    }
}
