/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.Date;

/**
 *
 * @author maha-
 */
public class Preconvention {
    private int refConv;
    private int etudiant;
    private String diplome;
    private int entreprise;
    private int assurance;
    private float gratification;
    private Date debut;
    private Date fin;
    private String sujetStage;
    private boolean validE;
    private boolean validJ;
    private boolean validS ;

//add method getEtat + son service

    public Preconvention(int refConv, int etudiant, String d, int e, int a, float gratification, Date debut, Date fin, String sujetStage) {
        this.refConv = refConv;
        this.etudiant = etudiant;
        this.diplome = d;
        this.entreprise = e;
        this.assurance = a;
        this.gratification = gratification;
        this.debut = debut;
        this.fin = fin;
        this.sujetStage = sujetStage;
    }

    public void setValidE(boolean validE) {
        this.validE = validE;
    }

    public void setValidJ(boolean validJ) {
        this.validJ = validJ;
    }

    public void setValidS(boolean validS) {
        this.validS = validS;
    }

    
    public boolean isValidE() {
        return validE;
    }

    public boolean isValidJ() {
        return validJ;
    }

    public boolean isValidS() {
        return validS;
    }
    
    public int getRefConv() {
        return refConv;
    }

    public int getEtudiant() {
        return etudiant;
    }

    public String getD() {
        return diplome;
    }

    public int getE() {
        return entreprise;
    }

    public int getA() {
        return assurance;
    }

    public float getGratification() {
        return gratification;
    }

    public Date getDebut() {
        return debut;
    }

    public Date getFin() {
        return fin;
    }

    public String getSujetStage() {
        return sujetStage;
    }

    public void setRefConv(int refConv) {
        this.refConv = refConv;
    }

    public void setEtudiant(int etudiant) {
        this.etudiant = etudiant;
    }

    public void setD(String d) {
        this.diplome = d;
    }

    public void setE(int e) {
        this.entreprise = e;
    }

    public void setA(int a) {
        this.assurance = a;
    }

    public void setGratification(float gratification) {
        this.gratification = gratification;
    }

    public void setDebut(Date debut) {
        this.debut = debut;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public void setSujetStage(String sujetStage) {
        this.sujetStage = sujetStage;
    }

    
    
    
    
    
    
    
}
