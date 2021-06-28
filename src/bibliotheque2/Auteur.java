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
public class Auteur {
    
    private int numeroAuteur;
    private String nomAuteur;
    private ArrayList<OUvrage> ouvrage = new ArrayList<>();
    
    
    public void addOuvrage(ArrayList<OUvrage> ouvrages){
        
        for(int i =0;i<ouvrages.size(); i++ ){
            
            this.ouvrage.add(ouvrages.get(i));
            
        }
    }
    
    

    public Auteur(int numeroAuteur, String nomAuteur) {
        this.numeroAuteur = numeroAuteur;
        this.nomAuteur = nomAuteur;
    }

    public String getNomAuteur() {
        return nomAuteur;
    }

    public int getNumeroAuteur() {
        return numeroAuteur;
    }
    
    public void affiche(){
        System.out.println(nomAuteur);
        
        for(int i =0;i<this.ouvrage.size(); i++ ){
            System.out.println(ouvrage.get(i).getTitreOuvrage());
        }
    }
    
    
    
    
    
    
}
