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
public class Faculte {
    private int NumeroFaculte;
    private String NomFaculte;
    private ArrayList<Etudiant> etudiant = new ArrayList<>();
    
    public void addEtudiant(ArrayList<Etudiant> etudiants){
        
        for(int i =0;i<etudiants.size(); i++ ){
            
            this.etudiant.add(etudiants.get(i));
            
        }
    }
    
    
    

    public Faculte(int NumeroFaculte, String NomFaculte) {
        this.NumeroFaculte = NumeroFaculte;
        this.NomFaculte = NomFaculte;
    }

    public int getNumeroFaculte() {
        return NumeroFaculte;
    }

    public String getNomFaculte() {
        return NomFaculte;
    }

    public void setNumeroFaculte(int NumeroFaculte) {
        this.NumeroFaculte = NumeroFaculte;
    }

    public void setNomFaculte(String NomFaculte) {
        this.NomFaculte = NomFaculte;
    }
    
    public void affiche(){
        System.out.println(NomFaculte);
        
        for(int i =0;i<this.etudiant.size(); i++ ){
            System.out.println(etudiant.get(i).getNomEtudiant());
        }
    }
    
    
}
