/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_thegame;

import com.beweb.lunel.poo.theGame.core.GameEngine;
import com.beweb.lunel.poo.theGame.entities.Elfe;
import com.beweb.lunel.poo.theGame.entities.Humain;
import com.beweb.lunel.poo.theGame.entities.Orc;
import com.beweb.lunel.poo.theGame.entities.Personnage;
import com.beweb.lunel.poo.theGame.entities.interfaces.ActionInterface;




/**
 *
 * @author julianbertrix
 */
public class Poo_TheGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GameEngine game = new GameEngine();
        
        game.addCombattant(new Humain("loic"));
        game.addCombattant(new Orc("yannick"));
        game.addCombattant(new Elfe("jonathan"));
        game.addCombattant(new Elfe("severine"));
        game.addCombattant(new Orc("damien"));
        game.addCombattant(new Orc("alexandre"));
        game.addCombattant(new Orc("julian"));
        game.addCombattant(new Orc("françois"));
        game.addCombattant(new Orc("alexis"));
        game.addCombattant(new Orc("thierry"));
        game.addCombattant(new Orc("ilies"));
        game.addCombattant(new Humain("cedric"));
        game.addCombattant(new Humain("nicolas"));
        game.addCombattant(new Humain("julien"));
        game.addCombattant(new Humain("fabien"));
        game.addCombattant(new Humain("alain"));
        game.addCombattant(new Humain("thomas"));
        game.addCombattant(new Humain("Karim"));
        
        //double race1 = Math.random();
        //if (race1 <= 0.33)
        //{
        //    domeDuTonnere[0] = new Humain("loic");
        //    System.out.println("loic est un humain qui a " + domeDuTonnere[0].pv + " de pv");
        //}
        //else if(race1 > 0.33 && race1 <= 0.66)
        //{
        //    domeDuTonnere[0] = new Orc("loic");
        //    System.out.println("loic est un orc qui a " + domeDuTonnere[0].pv + " de pv");
        //}
        //else
        //{
        //   domeDuTonnere[0] = new Elfe("loic");
        //    System.out.println("loic est un elfe qui a " + domeDuTonnere[0].pv + " de pv");
        //}
        
        //double race2 = Math.random();
        //if (race2 <= 0.33)
        //{
        //    domeDuTonnere[1] = new Humain("jonathan");
        //    System.out.println("jonathan est un humain qui a " + domeDuTonnere[1].pv + " de pv");
        //}
        //else if(race2 > 0.33 && race2 <= 0.66)
        //{
        //    domeDuTonnere[1] = new Orc("jonathan");
        //    System.out.println("jonathan est un Orc qui a " + domeDuTonnere[1].pv + " de pv");
        //}
        //else
        //{
        //    domeDuTonnere[1] = new Elfe("jonathan");
        //    System.out.println("jonathan est un elfe qui a " + domeDuTonnere[1].pv + " de pv");
        //}
        game.start();
        
        int fin = 1000;
        
        //while(fin > 0)
        //{
            //double choix = Math.random();
            //if(choix <= 0.5)
            //{
            //    domeDuTonnere[0].attaquer(domeDuTonnere[1]);
            //    fin = domeDuTonnere[1].pv;
            //}
            //else
            //{
            //    domeDuTonnere[1].attaquer(domeDuTonnere[0]);
            //    fin = domeDuTonnere[0].pv;
            //}
        //}
    }
    
    public static void action(ActionInterface object, Personnage cible)
    {
        object.attaquer(cible);
    }
}
