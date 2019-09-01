/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.bikeshopmodular;
import de.ostfalia.businesslogic.businesslogic.BusinessLogic;

/**
 *
 * @author Rene Hellmuth
 */
public class FacFahrradKonfiguratorAppImpl implements FacFahrradKonfiguratorApp {
    public FahrradKonfiguratorApp create(BusinessLogic businesslogic) {
        return new FahrradKonfiguratorAppImpl(businesslogic);
    }
}