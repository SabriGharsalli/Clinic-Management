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
public class Secretaire {
    private int code;
    private String nom ; 
    private String prenom ;
    public Secretaire(int code,String nom,String prenom , String specialite){
        this.code=code;
        this.nom=nom;
        this.prenom=prenom;
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
}
