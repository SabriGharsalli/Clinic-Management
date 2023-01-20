/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author Sabri&Ismail
 */
public class Dao  {
    ResultSet rs;
    ArrayList<Integer> list=new ArrayList<Integer>();
    ArrayList<String> list1=new ArrayList<String>();    
    public  Dao(Patient pt){
        
    try{   
Class.forName("oracle.jdbc.driver.OracleDriver");   
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","122333");    
Statement stmt=con.createStatement();  
PreparedStatement list=con.prepareStatement("insert into patient1 (identifiant_p,nom_p,prenom_p,tel,adresse) values (?,?,?,?,?)");   
System.out.println(pt.get_identifiant_p()+" "+pt.get_nom()+" "+pt.get_prenom()+" "+pt.get_tel()+" "+pt.get_adresse());
list.setInt(1, pt.get_identifiant_p());
list.setString(2, pt.get_nom());
list.setString(3, pt.get_prenom());
list.setInt(4, pt.get_tel());
list.setString(5, pt.get_adresse());
list.executeUpdate();
con.close();  
  
}catch(Exception e){ System.out.println(e);}
    
}
public Dao(Consultation consult){
    try{   
Class.forName("oracle.jdbc.driver.OracleDriver");   
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","122333");    
Statement stmt=con.createStatement();  
PreparedStatement list=con.prepareStatement("insert into consultation1 (identifiant_p,date_c,type,remarque,code_f) values (?,?,?,?,?)");   
System.out.println(consult.get_identifiant_p()+" "+consult.get_date_c()+" "+consult.get_type_c()+" "+consult.get_remarque()+" "+consult.get_code_f());
list.setInt(1, consult.get_identifiant_p());
list.setString(2, consult.get_date_c());
list.setString(3, consult.get_type_c());
list.setString(4, consult.get_remarque());
list.setInt(5, consult.get_code_f());
list.executeUpdate();  
con.close();  
}catch(Exception e){ System.out.println(e);}
    
}
public Dao(Fiche f){
    try{   
Class.forName("oracle.jdbc.driver.OracleDriver");   
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","122333");    
Statement stmt=con.createStatement();  
PreparedStatement list=con.prepareStatement("insert into fiche1 (code_f,identifiant_p) values (?,?)");   
System.out.println(f.get_code_f()+" "+f.get_identifiant_p());
list.setInt(1, f.get_code_f());
list.setInt(2, f.get_identifiant_p());
list.executeUpdate();
con.close();
}catch(Exception e){ System.out.println(e);}
}
public Dao(Ordonnance o){
    try{   
Class.forName("oracle.jdbc.driver.OracleDriver");   
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","122333");    
Statement stmt=con.createStatement();  
PreparedStatement list=con.prepareStatement("insert into ordonnance1 (code_o,nbre_boite,nom_medic,prise_par_jour,identifiant_p) values (?,?,?,?,?)");   
System.out.println(o.get_code_o()+" "+o.get_nbre_boite()+" "+o.get_nom_medic()+" "+o.get_prise_par_jour()+" "+o.get_identifiant_p());
list.setInt(1, o.get_code_o());
list.setString(2, o.get_nbre_boite());
list.setString(3, o.get_nom_medic());
list.setString(4, o.get_prise_par_jour());
list.setInt(5,o.get_identifiant_p());
list.executeUpdate();
con.close();  
}catch(Exception e){ System.out.println(e);}
}
public Dao (String nom , int s){
    try{
        if (s==0){
   Class.forName("oracle.jdbc.driver.OracleDriver");   
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","122333");    
Statement stmt=con.createStatement();  
PreparedStatement list=con.prepareStatement("select identifiant_p from patient1 where nom_p=?");   
list.setString(1, nom);
rs =list.executeQuery();
while (rs.next()){
        list.add(rs.getInt(1));
        System.out.println(rs.getInt(1));
    }

con.close();
}
    }
    catch(Exception e){ System.out.println(e);
            }
}
ArrayList<Integer> get_result(){    
    return list;
}
ArrayList<String> get_result1(){
    return list1;
}
public Dao(int s,int identifiant){
    try{
        if (s==0){
   Class.forName("oracle.jdbc.driver.OracleDriver");   
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","122333");    
Statement stmt=con.createStatement();  
PreparedStatement list=con.prepareStatement("delete from patient1 where identifiant_p=?"); 
System.out.println("s="+s+" identifiant = "+identifiant );
list.setInt(1, identifiant);
list.executeUpdate();
con.close();

}       if(s==1){
        Class.forName("oracle.jdbc.driver.OracleDriver");   
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","122333");    
Statement stmt=con.createStatement();  
PreparedStatement list=con.prepareStatement("select date_c from consultation1 where identifiant_p=?");
System.out.println("s="+s+" identifiant = "+identifiant );
list.setInt(1, identifiant);
rs =list.executeQuery();
while (rs.next()){
        list1.add(rs.getString(1));
        System.out.println(rs.getString(1));
    }
con.close();       
}
        if(s==2){
        Class.forName("oracle.jdbc.driver.OracleDriver");   
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","122333");    
Statement stmt=con.createStatement();  
PreparedStatement list=con.prepareStatement("select code_f from fiche1 where identifiant_p=?");
System.out.println("s="+s+" identifiant = "+identifiant );
list.setInt(1, identifiant);
rs =list.executeQuery();
while (rs.next()){
        list.add(rs.getInt(1));
        System.out.println(rs.getInt(1));
    }
con.close();      
}
 if(s==3){
        Class.forName("oracle.jdbc.driver.OracleDriver");   
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","122333");    
Statement stmt=con.createStatement();  
PreparedStatement list=con.prepareStatement("select code_o from ordonnance1 where identifiant_p=?");
System.out.println("s="+s+" identifiant = "+identifiant );
list.setInt(1, identifiant);
rs =list.executeQuery();
while (rs.next()){
        list.add(rs.getInt(1));
        System.out.println(rs.getInt(1));
    }
con.close();
}
    }catch(Exception e){ System.out.println(e);}
    
}
public Dao(int s , int identifiant,String date){
    try{
        if (s==1){
   Class.forName("oracle.jdbc.driver.OracleDriver");   
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","122333");    
Statement stmt=con.createStatement();  
PreparedStatement list=con.prepareStatement("delete from consultation1 where identifiant_p=? and date_c=?");   
list.setInt(1, identifiant);
list.setString(2, date);
list.executeUpdate(); 
con.close();
}
    }
    catch(Exception e){ System.out.println(e);
            }
}
public Dao(int s , int identifiant,int code2){
    try{
        if (s==2){
   Class.forName("oracle.jdbc.driver.OracleDriver");   
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","122333");    
Statement stmt=con.createStatement();  
PreparedStatement list=con.prepareStatement("delete from fiche1 where identifiant_p=? and code_f=?");   
list.setInt(1, identifiant);
list.setInt(2, code2);
list.executeUpdate(); 
con.close();
}
        if (s==3){
   Class.forName("oracle.jdbc.driver.OracleDriver");   
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","122333");    
Statement stmt=con.createStatement();  
PreparedStatement list=con.prepareStatement("delete from ordonnance1 where identifiant_p=? and code_o=?");   
list.setInt(1, identifiant);
list.setInt(2, code2);
list.executeUpdate(); 
con.close();
}
    }
    catch(Exception e){ System.out.println(e);
            }
}
}

