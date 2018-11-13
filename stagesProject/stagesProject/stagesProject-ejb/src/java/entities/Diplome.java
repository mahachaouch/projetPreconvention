/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author maha-
 */
public class Diplome {
    private String intitule;
    private String niveau;

    public Diplome(String intitule, String niveau) {
        this.intitule = intitule;
        this.niveau = niveau;
    }

    public String getIntitule() {
        return intitule;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }
    
    
    
}
