/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beweb.lunel.poo.theGame.entities;

/**
 *
 * @author julianbertrix
 */
public class Humain extends Personnage{
   
    public Humain() {
        
    }
    
    public Humain(String n) {
        super(n);
    }

    @Override
    public void initAttribut() {
        this.pv = 500;
        this.force = 110;
        this.endurance = 100;
    }
    
}
