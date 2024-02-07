/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit01.service;

import junit01.entities.DiscountCalculator;

/**
 *
 * @author Lucas
 */
public class DiscountCalculatorService {
    
    public double calcularDescuento(DiscountCalculator d){
        return d.getPrecio()*((100 - d.getDescuento())/100);
    }
    
}
