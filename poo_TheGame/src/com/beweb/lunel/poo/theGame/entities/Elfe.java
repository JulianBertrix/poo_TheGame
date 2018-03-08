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
public class Elfe extends Personnage{

    public Elfe() {
        
    }

    public Elfe(String n) {
        super(n);
    }

    @Override
    public void initAttribut() {
        this.pv = 300;
        this.force = 80;
        this.endurance = 180;
    }
}
