/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliotheque2;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class Bibliotheque2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        Auteur aut = new Auteur(1,"serigne fall");
        Auteur aut1 = new Auteur(2," penda fall");
        Auteur aut2 = new Auteur(3," khaly dieng");
        Auteur aut3 = new Auteur(4," mame fatou ");
        
        
        OUvrage ouv = new OUvrage(1,"le ciel",2);
        OUvrage ouv1 = new OUvrage(3,"la terre",4);
        OUvrage ouv2 = new OUvrage(3,"la terre",4);
        OUvrage ouv3 = new OUvrage(3,"la terre",4);
        
        Faculte fac = new Faculte(2,"FST");
        Faculte fac2 = new Faculte(2,"FASEG");
        
        
        
        Etudiant etu = new Etudiant(1,"thioro",fac);
        Etudiant etu1 = new Etudiant(2,"Kine",fac);
        Etudiant etu2 = new Etudiant(3,"Babacar",fac);
        
       //Liste des auteurs 
        ArrayList<Auteur> auteurOuv = new ArrayList<>();
        auteurOuv.add(aut);
        auteurOuv.add(aut1);
        auteurOuv.add(aut2);
        
        
        //liste des ouvrages 
        ArrayList<OUvrage> ouvrage = new ArrayList<>();
        ouvrage.add(ouv);
        ouvrage.add(ouv1);
        
        
        
        ArrayList<Etudiant> etudiant =new ArrayList<>();
        
        etudiant.add(etu);
        etudiant.add(etu1);
        
        
        
        
        aut.addOuvrage(ouvrage);
       // aut.affiche();
        
        
        ouv.addAuteurs(auteurOuv);
        
        fac.addEtudiant(etudiant);
        //fac.affiche();
        
        
        Emprunter emprunte = new Emprunter(ouv,etu,LocalDate.now());
        
         Emprunter emprunte1 = new Emprunter(ouv1,etu,null);
        
       // Emprunter emprunte1 = new Emprunter(ouv1,etu1,LocalDate.of(11, Month.MARCH, 1990));
        // Emprunter emprunte2 = new Emprunter(ouv1,etu1,LocalDate.ofYearDay(1, 2));
        
        
       emprunte.afficheOuvrEmprt(etu);
        
       // ouv.affiche();
        
        
        
        
        
       
        
    }
    
}
