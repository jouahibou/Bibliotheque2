/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotheque2;

import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class Etudiant {
     private int numeroEtudiant;
     private String nomEtudiant;
     private Faculte faculte;
     private ArrayList<OUvrage> ouvrages = new ArrayList<>();

    public ArrayList<OUvrage> getOuvrages() {
        return ouvrages;
    }
    

    public Etudiant(int numeroEtudiant, String nomEtudiant, Faculte faculte) {
        this.numeroEtudiant = numeroEtudiant;
        this.nomEtudiant = nomEtudiant;
        this.faculte = faculte;
    }

    public int getNumeroEtudiant() {
        return numeroEtudiant;
    }

    public String getNomEtudiant() {
        return nomEtudiant;
    }

    public Faculte getFaculte() {
        return faculte;
    }

    public void setNumeroEtudiant(int numeroEtudiant) {
        this.numeroEtudiant = numeroEtudiant;
    }

    public void setNomEtudiant(String nomEtudiant) {
        this.nomEtudiant = nomEtudiant;
    }

    public void setFaculte(Faculte faculte) {
        this.faculte = faculte;
    }
    
    
    
    
     
     
     
     
}
