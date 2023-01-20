/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.util.ArrayList;

/**
 *
 * @author MouYasseR
 */
public class Fiche {
    private int code_f;
    private int identifiant_p;
    private ArrayList<Consultation> list_cons=new ArrayList<Consultation>();
    public Fiche(int code_f,int identifiant_p){
        this.code_f=code_f;
        this.identifiant_p=identifiant_p;
    }
    int get_code_f(){
        return this.code_f;
    }
    int get_code_p(){
        return this.identifiant_p;
    }
}
