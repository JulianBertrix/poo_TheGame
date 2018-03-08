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
public class Personnage {
    
    public int force, pv, endurance;
    public String nom;
    
    boolean attaque = false;
    
    public Personnage()
    {
        this.initAttribut();
    }
    
    public Personnage(String n)
    {
        this();
        this.nom = n;
    }
    
    public void initAttribut()
    {
        
    }
    
    public void attaquer(Personnage cible)
    {
        int degat = this.force - cible.endurance;
        
        if (degat < 0)
        {
            degat *= -1;
        }
        
        cible.pv -= degat;
        
        if(cible.pv <= 0)
        {
            System.out.println(cible.nom + " est mort...MWAHAHAHAHAHA!");
        }
        else
        {
            System.out.println(this.nom + " attaque " + cible.nom + " il reste " + cible.pv + " a " + cible.nom);
        }
    }
}
