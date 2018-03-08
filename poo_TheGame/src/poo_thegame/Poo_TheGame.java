/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_thegame;

import com.beweb.lunel.poo.theGame.entities.Personnage;
import com.beweb.lunel.poo.theGame.entities.Orc;
import com.beweb.lunel.poo.theGame.entities.Humain;
import com.beweb.lunel.poo.theGame.entities.Elfe;




/**
 *
 * @author julianbertrix
 */
public class Poo_TheGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Personnage[] domeDuTonnere = new Personnage[2];

        double race1 = Math.random();
        if (race1 <= 0.33)
        {
            domeDuTonnere[0] = new Humain("loic");
            System.out.println("loic est un humain qui a " + domeDuTonnere[0].pv + " de pv");
        }
        else if(race1 > 0.33 && race1 <= 0.66)
        {
            domeDuTonnere[0] = new Orc("loic");
            System.out.println("loic est un orc qui a " + domeDuTonnere[0].pv + " de pv");
        }
        else
        {
            domeDuTonnere[0] = new Elfe("loic");
            System.out.println("loic est un elfe qui a " + domeDuTonnere[0].pv + " de pv");
        }
        
        double race2 = Math.random();
        if (race2 <= 0.33)
        {
            domeDuTonnere[1] = new Humain("jonathan");
            System.out.println("jonathan est un humain qui a " + domeDuTonnere[1].pv + " de pv");
        }
        else if(race2 > 0.33 && race2 <= 0.66)
        {
            domeDuTonnere[1] = new Orc("jonathan");
            System.out.println("jonathan est un Orc qui a " + domeDuTonnere[1].pv + " de pv");
        }
        else
        {
            domeDuTonnere[1] = new Elfe("jonathan");
            System.out.println("jonathan est un elfe qui a " + domeDuTonnere[1].pv + " de pv");
        }
        
        int fin = 1000;
        
        while(fin > 0)
        {
            double choix = Math.random();
            if(choix <= 0.5)
            {
                domeDuTonnere[0].attaquer(domeDuTonnere[1]);
                fin = domeDuTonnere[1].pv;
            }
            else
            {
                domeDuTonnere[1].attaquer(domeDuTonnere[0]);
                fin = domeDuTonnere[0].pv;
            }
        }
    }
    
}
