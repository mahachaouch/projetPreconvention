/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.Etudiant;
import entities.Preconvention;
import java.util.Date;
import javax.ejb.Local;

/**
 *
 * @author maha-
 */
@Local
public interface UnivBeanLocal {
    public Preconvention ajouterPreConvention(int etudiant, String d, int e, int a, float gratification, Date debut, Date fin, String sujetStage);
    public Preconvention validerEnseignement(int refPreConv,boolean v);
    public Preconvention validerJuridique(int refPreConv,boolean v);
    public Preconvention validerScolarite(int refPreConv,boolean v);
    public Preconvention getPrevention(int refPreconv);
    public Etudiant getEtudiant(int refPreconv);
}
