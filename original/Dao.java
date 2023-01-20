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
    public  Dao(Patient p){
        
    try{   
Class.forName("oracle.jdbc.driver.OracleDriver");   
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","122333");    
Statement stmt=con.createStatement();  
PreparedStatement pst=con.prepareStatement("insert into patient1 (identifiant_p,nom_p,prenom_p,tel,adresse) values (?,?,?,?,?)");   
System.out.println(p.get_identifiant_p()+" "+p.get_nom()+" "+p.get_prenom()+" "+p.get_tel()+" "+p.get_adresse());
pst.setInt(1, p.get_identifiant_p());
pst.setString(2, p.get_nom());
pst.setString(3, p.get_prenom());
pst.setInt(4, p.get_tel());
pst.setString(5, p.get_adresse());
pst.executeUpdate();
con.close();  
  
}catch(Exception e){ System.out.println(e);}
    
}
public Dao(Consultation c){
    try{   
Class.forName("oracle.jdbc.driver.OracleDriver");   
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","122333");    
Statement stmt=con.createStatement();  
PreparedStatement pst=con.prepareStatement("insert into consultation1 (identifiant_p,date_c,type,remarque,code_f) values (?,?,?,?,?)");   
System.out.println(c.get_identifiant_p()+" "+c.get_date_c()+" "+c.get_type_c()+" "+c.get_remarque()+" "+c.get_code_f());
pst.setInt(1, c.get_identifiant_p());
pst.setString(2, c.get_date_c());
pst.setString(3, c.get_type_c());
pst.setString(4, c.get_remarque());
pst.setInt(5, c.get_code_f());
pst.executeUpdate();  
con.close();  
}catch(Exception e){ System.out.println(e);}
    
}
public Dao(Fiche f){
    try{   
Class.forName("oracle.jdbc.driver.OracleDriver");   
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","122333");    
Statement stmt=con.createStatement();  
PreparedStatement pst=con.prepareStatement("insert into fiche1 (code_f,identifiant_p) values (?,?)");   
System.out.println(f.get_code_f()+" "+f.get_identifiant_p());
pst.setInt(1, f.get_code_f());
pst.setInt(2, f.get_identifiant_p());
pst.executeUpdate();
con.close();
}catch(Exception e){ System.out.println(e);}
}
public Dao(Ordonnance o){
    try{   
Class.forName("oracle.jdbc.driver.OracleDriver");   
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","122333");    
Statement stmt=con.createStatement();  
PreparedStatement pst=con.prepareStatement("insert into ordonnance1 (code_o,nbre_boite,nom_medic,prise_par_jour,identifiant_p) values (?,?,?,?,?)");   
System.out.println(o.get_code_o()+" "+o.get_nbre_boite()+" "+o.get_nom_medic()+" "+o.get_prise_par_jour()+" "+o.get_identifiant_p());
pst.setInt(1, o.get_code_o());
pst.setString(2, o.get_nbre_boite());
pst.setString(3, o.get_nom_medic());
pst.setString(4, o.get_prise_par_jour());
pst.setInt(5,o.get_identifiant_p());
pst.executeUpdate();
con.close();  
}catch(Exception e){ System.out.println(e);}
}
public Dao (String nom , int s){
    try{
        if (s==0){
   Class.forName("oracle.jdbc.driver.OracleDriver");   
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","122333");    
Statement stmt=con.createStatement();  
PreparedStatement pst=con.prepareStatement("select identifiant_p from patient1 where nom_p=?");   
pst.setString(1, nom);
rs =pst.executeQuery();
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
public Dao(int s,int code){
    try{
        if (s==0){
   Class.forName("oracle.jdbc.driver.OracleDriver");   
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","122333");    
Statement stmt=con.createStatement();  
PreparedStatement pst=con.prepareStatement("delete from patient1 where identifiant_p=?"); 
System.out.println("s="+s+" code = "+code );
pst.setInt(1, code);
pst.executeUpdate();
con.close();

}       if(s==1){
        Class.forName("oracle.jdbc.driver.OracleDriver");   
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","122333");    
Statement stmt=con.createStatement();  
PreparedStatement pst=con.prepareStatement("select date_c from consultation1 where identifiant_p=?");
System.out.println("s="+s+" code = "+code );
pst.setInt(1, code);
rs =pst.executeQuery();
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
PreparedStatement pst=con.prepareStatement("select code_f from fiche1 where identifiant_p=?");
System.out.println("s="+s+" code = "+code );
pst.setInt(1, code);
rs =pst.executeQuery();
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
PreparedStatement pst=con.prepareStatement("select code_o from ordonnance1 where identifiant_p=?");
System.out.println("s="+s+" code = "+code );
pst.setInt(1, code);
rs =pst.executeQuery();
while (rs.next()){
        list.add(rs.getInt(1));
        System.out.println(rs.getInt(1));
    }
con.close();
}
    }catch(Exception e){ System.out.println(e);}
    
}
public Dao(int s , int code,String date){
    try{
        if (s==1){
   Class.forName("oracle.jdbc.driver.OracleDriver");   
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","122333");    
Statement stmt=con.createStatement();  
PreparedStatement pst=con.prepareStatement("delete from consultation1 where identifiant_p=? and date_c=?");   
pst.setInt(1, code);
pst.setString(2, date);
pst.executeUpdate(); 
con.close();
}
    }
    catch(Exception e){ System.out.println(e);
            }
}
public Dao(int s , int code,int code2){
    try{
        if (s==2){
   Class.forName("oracle.jdbc.driver.OracleDriver");   
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","122333");    
Statement stmt=con.createStatement();  
PreparedStatement pst=con.prepareStatement("delete from fiche1 where identifiant_p=? and code_f=?");   
pst.setInt(1, code);
pst.setInt(2, code2);
pst.executeUpdate(); 
con.close();
}
        if (s==3){
   Class.forName("oracle.jdbc.driver.OracleDriver");   
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","122333");    
Statement stmt=con.createStatement();  
PreparedStatement pst=con.prepareStatement("delete from ordonnance1 where identifiant_p=? and code_o=?");   
pst.setInt(1, code);
pst.setInt(2, code2);
pst.executeUpdate(); 
con.close();
}
    }
    catch(Exception e){ System.out.println(e);
            }
}
}

