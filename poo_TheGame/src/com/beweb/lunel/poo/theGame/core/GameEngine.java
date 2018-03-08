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
    
    //Création de la liste des personnage
    List<Personnage> joueur = new ArrayList<Personnage>();
    
    public void start()
    {
        //Tant qu'il rest encore plus d'un joueur 
        while(!fin())
        {
            //appel la fonction attaquer()
            tourDeJeu();
        }
        //affiche le vainqueur
        System.out.println(joueur.get(0).nom + " est le boss de beweb");
    }
    
    public void addCombattant(Personnage p)
    {
        //Si il n'y a aucun de combattant 
        if(!joueur.contains(p))
        {
            //Pour ajouter un combattant
            joueur.add(p);
        }
    }
    
    int getID()
    {
        //Permet de créer des joueur de façon dynamique
        int index = (int)Math.floor(Math.random() * joueur.size());
        return index;
    }
    
    //Pour identifier les joueurs et leurs personnages
    private ActionInterface getJoueur(boolean attaquant)
    {
        //On les récupère
        return joueur.get(getID());
    }
    
    private void tourDeJeu()
    {
        //On appel la fonction attaquer de la classe Personnage via l'interface ActionInterface
        getJoueur(true).attaquer((Personnage)getJoueur(false));
        //On retire les joueurs mort
        nettoyerMort();
    }
    
    private void nettoyerMort()
    {
        //Pour chaques joueurs présent
        for (int i = 0; i < joueur.size(); i++)
        {
            //Si l'un d'entre eux meurs
            if(joueur.get(i).pv <= 0)
            {
                //On le retire
                joueur.remove(i);
            }
        }
    }
    
    private boolean fin()
    {
        //Si il ne reste plus qu'un joueur
        if(joueur.size() == 1)
        {
            //La partie est fini
            return true;
        }
        return false;
    }
}
