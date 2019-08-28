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
    static boolean getOrCreateDB(){
        
        try {
            Class.forName ("org.h2.Driver");
            Connection conn = DriverManager.getConnection ("jdbc:h2:./test", "sa",""); 
            Statement statment = conn.createStatement();
            /*CREATE [ CACHED | MEMORY ] [ TEMP | [ GLOBAL | LOCAL ] TEMPORARY ] 
TABLE [ IF NOT EXISTS ] name 
[ ( { columnDefinition | constraint } [,...] ) ] 
[ ENGINE tableEngineName [ WITH tableEngineParamName [,...] ] ] 
[ NOT PERSISTENT ] [ TRANSACTIONAL ] 
[ AS select ] */
            statment.executeQuery("CREATE SCHEMA BikeShop_schema AUTHORIZATION sa; ");
            statment.executeQuery("CREATE Table IF NOT EXISTIST Reifen ("
                    + "id INT NOT NULL AOTO_INCREMENT,"
                    + "typ VARCHAR(511),"
                    + "farbe SHORT,"
                    + "preis DOUBLE"
                    + ")");
            statment.executeQuery("CREATE Table IF NOT EXISTIST Reifen ("
                    + "id INT NOT NULL AOTO_INCREMENT,"
                    + "typ VARCHAR(511),"
                    + "farbe SHORT,"
                    + "preis DOUBLE"
                    + ")");
            statment.executeQuery("CREATE Table IF NOT EXISTIST Reifen ("
                    + "id INT NOT NULL AOTO_INCREMENT,"
                    + "typ VARCHAR(511),"
                    + "farbe SHORT,"
                    + "preis DOUBLE"
                    + ")");
            conn.close();
            
            return true;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(H2DBinit.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(H2DBinit.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
    public static void main(String[] args){
        getOrCreateDB();
    }
}
