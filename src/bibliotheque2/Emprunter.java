/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotheque2;

import java.time.LocalDate;
import static java.time.temporal.TemporalQueries.localDate;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class Emprunter {
    
    private OUvrage ouvrage;
    private Etudiant etudiant;
    private LocalDate datePret;
    private LocalDate dateRetourn;
    private ArrayList<Etudiant> etudiante = new ArrayList<>();
    public static  ArrayList<Emprunter>  emprunter = new ArrayList<>(); 
    
     public void addEtudiant(ArrayList<Etudiant> etudiantes){
        
        for(int i =0;i<etudiantes.size(); i++ ){
            
            this.etudiante.add(etudiantes.get(i));
            
        }
        }
    
    

    public Emprunter(OUvrage ouvrage, Etudiant etudiant, LocalDate dateRetourn) {
       
        
        this.ouvrage = ouvrage;
        this.etudiant = etudiant;
        this.dateRetourn = dateRetourn;
        
        emprunter.add(this);
        
      //  etudiant.getOuvrages().add(ouvrage);
    }
    public void afficheOuvrEmprt(Etudiant e){
        
        for (int i=0;i<emprunter.size();i++){
            
            if (emprunter.get(i).etudiant.getNumeroEtudiant()==e.getNumeroEtudiant()){
                System.out.println(emprunter.get(i).ouvrage.getTitreOuvrage());
            }
        }
        
    }
    
    
    }
    

