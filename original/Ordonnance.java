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
public class Ordonnance {
    private int code_o;
    private String nom_medic;
    private String prise_par_jour ; 
    private String nbre_boite ;
    private int code_p;
    public Ordonnance(int code_o,String nom_medic,String prise_par_jour,String nbre_boite,int code_p){
        this.code_o=code_o;
        this.nom_medic=nom_medic;
        this.prise_par_jour=prise_par_jour;
        this.nbre_boite=nbre_boite;
        this.code_p=code_p;
    }
    String get_nom_medic(){
        return this.nom_medic;
    }
    String get_prise_par_jour(){
        return this.prise_par_jour;
    }
    String get_nbre_boite(){
        return this.nbre_boite;
    }
    int get_code_o(){
        return this.code_o;
    }
    int get_code_p(){
        return this.code_p;
    }
    
}
