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
public class Entreprise {
    private String nomE;
    private int siren;

    public Entreprise(String nomE, int siren) {
        this.nomE = nomE;
        this.siren = siren;
    }

    public String getNomE() {
        return nomE;
    }

    public int getSiren() {
        return siren;
    }

    public void setNomE(String nomE) {
        this.nomE = nomE;
    }

    public void setSiren(int siren) {
        this.siren = siren;
    }
    
}
