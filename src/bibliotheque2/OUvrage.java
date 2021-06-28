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
public class OUvrage {
    
    private int numeroOuvrage;
    private String titreOuvrage;
    private int numeroInterne;
    private ArrayList<Auteur> auteur = new ArrayList<Auteur>();
    
    
    
    public ArrayList<Auteur> getAuteur(){
    
      return this.auteur;   
    
    }
    
    public void addAuteurs(ArrayList<Auteur> auteurs){
        
        for(int i =0;i<auteurs.size(); i++ ){
            
            this.auteur.add(auteurs.get(i));
            
        }
       
        
    }
    
    public void affiche(){
        for(int i =0;i<this.auteur.size(); i++ ){
            System.out.println(auteur.get(i).getNomAuteur());
        }
    }
    
    

    public OUvrage(int numeroOuvrage, String titreOuvrage, int numeroInterne) {
        this.numeroOuvrage = numeroOuvrage;
        this.titreOuvrage = titreOuvrage;
        this.numeroInterne = numeroInterne;
    }

    public int getNumeroOuvrage() {
        return numeroOuvrage;
    }

    public String getTitreOuvrage() {
        return titreOuvrage;
    }

    public int getNumeroInterne() {
        return numeroInterne;
    }

    public void setNumeroOuvrage(int numeroOuvrage) {
        this.numeroOuvrage = numeroOuvrage;
    }

    public void setTitreOuvrage(String titreOuvrage) {
        this.titreOuvrage = titreOuvrage;
    }

    public void setNumeroInterne(int numeroInterne) {
        this.numeroInterne = numeroInterne;
    }
    
    

        
    
    
}
