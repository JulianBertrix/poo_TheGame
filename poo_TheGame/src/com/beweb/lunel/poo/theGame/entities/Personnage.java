/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beweb.lunel.poo.theGame.entities;

import com.beweb.lunel.poo.theGame.entities.interfaces.ActionInterface;
import com.beweb.lunel.poo.theGame.entities.interfaces.Initialisable;

/**
 *
 * @author julianbertrix
 */
public abstract class Personnage implements Initialisable, ActionInterface {
    
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
    
    
    @Override
    public void attaquer(Personnage cible)
    {      
        int degat = this.force - cible.endurance;
        boolean bloque = false;
        
        if (degat < 0)
        {
            degat = (degat * -1)/2;
        }
        
        double parer = Math.random();
        if(parer <= 0.25)
        {
            bloque = true;
            degat = 0;
            System.out.println(cible.nom + " a parer le coup de " + this.nom);
        }
        else
        {
            bloque = false;
            cible.pv -= degat;
            System.out.println(this.nom + " attaque et inflige " + degat + " points de degat a " + cible.nom + " il reste " + cible.pv + " a " + cible.nom);
        }
        
        double coupCritique = Math.random();
        if(coupCritique <= 0.25 && !bloque)
        {
            degat *= 2;
            cible.pv -= degat;
            System.out.println(this.nom + " inflige un coup critique de " + degat + " points de degat a " + cible.nom + " il reste " + cible.pv + " a " + cible.nom);
        }
        else
        {
            cible.pv -= degat;
            System.out.println(this.nom + " attaque et inflige " + degat + " points de degat a " + cible.nom + " il reste " + cible.pv + " a " + cible.nom);
        }
           
        if(cible.pv <= 0)
        {
            System.out.println(cible.nom + " est mort...MWAHAHAHAHAHA!");
        }
    }
}
