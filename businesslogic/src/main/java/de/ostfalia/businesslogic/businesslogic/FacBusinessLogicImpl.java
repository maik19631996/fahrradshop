/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.ostfalia.businesslogic.businesslogic;
import de.ostfalia.businesslogic.database.Database;

/**
 *
 * @author z
 */
public class FacBusinessLogicImpl implements FacBusinessLogic {
    @Override
    public BusinessLogic create(Database db) {
        return new BusinessLogicImpl(db);
    }
}