/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author   Sabri&Ismail

 */
public class Patient {
    private int identifiant_p;
    private String nom ; 
    private String prenom ;
    private String adresse ;
    private int tel;
    public Patient(int identifiant_p,String nom,String prenom , int tel ,String adresse){
        this.identifiant_p=identifiant_p;
        this.nom=nom;
        this.prenom=prenom;
        this.tel=tel;
        this.adresse=adresse;
    }
    int get_identifiant_p(){
        return this.identifiant_p;
    }
    String get_nom(){
        return this.nom;
    }
    String get_prenom(){
        return this.prenom;
    }
    int get_tel(){
        return this.tel;
    }
    String get_adresse(){
        return this.adresse;
    }
    
}
