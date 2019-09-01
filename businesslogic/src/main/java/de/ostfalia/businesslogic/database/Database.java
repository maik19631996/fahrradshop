/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.ostfalia.businesslogic.database;

import java.util.List;

/**
 *
 * @author Rubyn Angelo Stark
 */
public interface Database {
    public List<Rahmen> getAllRahmenTypen();
    public List<Rahmenfarbe> getAllRahmenfarben();
    public List<Reifen> getAllReifen();
    public List<Antrieb> getAllAntriebe();
}
