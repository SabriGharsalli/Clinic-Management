/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author MouYasseR
 */
public class Consultation {
    private int identifiant_p;
    private String date_c;
    private String type_c;
    private String remarque;
    private int code_f;
    public Consultation (int identifiant_p , String date_c,String type_c,String remarque,int code_f){
        this.identifiant_p=identifiant_p;
        this.date_c=date_c;
        this.type_c=type_c;
        this.remarque=remarque;
        this.code_f=code_f;
    }
    int get_code_f(){
        return this.code_f;
    }    
    int get_code_p(){
        return this.identifiant_p;
    }
    String get_date_c(){
        return this.date_c;
    }    
    String get_type_c(){
        return this.type_c;
    }
    String get_remarque(){
        return this.remarque;
    }
}
