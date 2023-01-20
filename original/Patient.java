/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Sabri&Ismail
 */
public class Patient {
    private int code;
    private String nom ; 
    private String prenom ;
    private String adresse ;
    private int tel;
    public Patient(int code,String nom,String prenom , int tel ,String adresse){
        this.code=code;
        this.nom=nom;
        this.prenom=prenom;
        this.tel=tel;
        this.adresse=adresse;
    }
    int get_code(){
        return this.code;
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
