/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.beweb.lunel.poo.theGame.core;

import com.beweb.lunel.poo.theGame.entities.Personnage;
import com.beweb.lunel.poo.theGame.entities.interfaces.ActionInterface;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author julianbertrix
 */
public class GameEngine {
    
    List<Personnage> joueur = new ArrayList<Personnage>();
    
    public void start()
    {
        while(!fin())
        {
            tourDeJeu();
        }
        System.out.println(joueur.get(0).nom + " est le boss de beweb");
    }
    
    public void addCombattant(Personnage p)
    {
        if(!joueur.contains(p))
        {
            joueur.add(p);
        }
    }
    
    int getID()
    {
        int index = (int)Math.floor(Math.random() * joueur.size());
        return index;
    }
    
    private ActionInterface getJoueur(boolean attaquant)
    {
        return joueur.get(getID());
    }
    
    private void tourDeJeu()
    {
        getJoueur(true).attaquer((Personnage)getJoueur(false));
        nettoyerMort();
    }
    
    private void nettoyerMort()
    {
        for (int i = 0; i < joueur.size(); i++)
        {
            if(joueur.get(i).pv <= 0)
            {
                joueur.remove(i);
            }
        }
    }
    
    private boolean fin()
    {
        if(joueur.size() == 1)
        {
            return true;
        }
        return false;
    }
}
