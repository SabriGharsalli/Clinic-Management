/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.util.ArrayList;

/**
 *
 * @author Sabri&Ismail
 */
public class Fiche {
    private int code_f;
    private int code_p;
    private ArrayList<Consultation> list_cons=new ArrayList<Consultation>();
    public Fiche(int code_f,int code_p){
        this.code_f=code_f;
        this.code_p=code_p;
    }
    int get_code_f(){
        return this.code_f;
    }
    int get_code_p(){
        return this.code_p;
    }
}
