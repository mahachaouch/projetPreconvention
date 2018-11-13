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
public class Assurance {
    private String nomCompagnie;
    private int numContrat;

    public Assurance(String nomCompagnie, int numContrat) {
        this.nomCompagnie = nomCompagnie;
        this.numContrat = numContrat;
    }

    public void setNomCompagnie(String nomCompagnie) {
        this.nomCompagnie = nomCompagnie;
    }

    public void setNumContrat(int numContrat) {
        this.numContrat = numContrat;
    }

    public String getNomCompagnie() {
        return nomCompagnie;
    }

    public int getNumContrat() {
        return numContrat;
    }
    
    
}
