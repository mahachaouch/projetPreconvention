/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.Etudiant;
import entities.Preconvention;
import java.util.Date;
import java.util.HashMap;
import javax.ejb.Singleton;

/**
 *
 * @author maha-
 */
@Singleton
public class UnivBean implements UnivBeanLocal {
    
    private HashMap<Integer, Preconvention> preconvs;
    private int lastid;

    public UnivBean() {
        this.preconvs = new HashMap<>();
        this.lastid = 0;
    }
    
    @Override
    public Preconvention ajouterPreConvention(int etudiant, String d, int e, int a, float gratification, Date debut, Date fin, String sujetStage) {      
        Preconvention prec = new Preconvention(lastid, etudiant, d, e, a,  gratification,  debut,  fin,  sujetStage);
        this.preconvs.put(lastid, prec);
        lastid++;
        return prec;
    }


    @Override
    public Preconvention validerEnseignement(int refPreConv, boolean v) {
        this.preconvs.get(refPreConv).setValidE(v);
        return this.preconvs.get(refPreConv);
    }

    @Override
    public Preconvention validerJuridique(int refPreConv, boolean v) {
        this.preconvs.get(refPreConv).setValidJ(v);
        return this.preconvs.get(refPreConv);
    }

    @Override
    public Preconvention validerScolarite(int refPreConv, boolean v) {
        this.preconvs.get(refPreConv).setValidS(v);
        return this.preconvs.get(refPreConv);
    }

    @Override
    public Preconvention getPrevention(int refPreconv) {
        return this.preconvs.get(refPreconv);
    }

    @Override
    public Etudiant getEtudiant(int refPreconv) {
       int numEtud = this.preconvs.get(refPreconv).getEtudiant();
       return   Etudiant.getEtudiantById(numEtud);
    }
}
