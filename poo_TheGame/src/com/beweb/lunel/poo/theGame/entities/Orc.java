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
public class Orc extends Personnage{
 

    public Orc() {
        
    }

    public Orc(String n) {
        super(n);
    }

    @Override
    public void initAttribut() {
        this.pv = 650;
        this.force = 150;
        this.endurance = 120;
    }
    
}
