/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import javax.swing.*;
/**
 *
 * @author Sabri&Ismail
 */
public class Principalinter extends JFrame implements ActionListener {
    JFrame f = new JFrame("Creer Ordonnance");
    
    ArrayList<Integer> list=new ArrayList<Integer>();
    ArrayList<String> list1=new ArrayList<String>();
    String [] array1;
    Integer[] array ;
    
    JLabel lab = new JLabel("code du patient :");
    JLabel lab1 = new JLabel("nom du patient :");
    JLabel lab2 = new JLabel("prenom du patient :");
    JLabel lab3 = new JLabel("adresse :");
    JLabel lab4 = new JLabel("numero de tel :");
    JLabel lab5 = new JLabel("code ordonance :");
    
    JTextField txt = new JTextField();
    JTextField txt1 = new JTextField();
    JTextField txt2 = new JTextField();
    JTextField txt3 = new JTextField();
    JTextField txt4 = new JTextField();
    JTextField txt5 = new JTextField();
    
    JMenuBar mb = new JMenuBar();
    JMenu m = new JMenu("Ajouter");
    JMenu m1 = new JMenu("Supprimer");
    JMenuItem i1= new JMenuItem("Ordonnance");
    JMenuItem i2 = new JMenuItem("Consultation");
    JMenuItem i3 = new JMenuItem("Patient");
    JMenuItem i4= new JMenuItem("Fiche");
    JMenuItem i5= new JMenuItem("Patient");
    JMenuItem i6 = new JMenuItem("Consultation");
    JMenuItem i7 = new JMenuItem("Fiche");
    JMenuItem i8= new JMenuItem("Ordonnance");
    
    JButton b = new JButton("Ajouter");
    
    JComboBox cb = new JComboBox();
    JComboBox cb1 = new JComboBox();
    JComboBox cb2= new JComboBox();
    
    int i=0;
    int x=0;
     
    public Principalinter(){
        
        i=0; 
        
        f.setSize(500,300);
        f.setLayout(null);
        f.setTitle("Creer Patient ");
        
        
        
        lab.setText("code du patient :");
        lab1.setText("nom du patient :");
        lab2.setText("prenom du patient :");
        lab4.setText("adresse :");
        lab3.setText("numero de tel :");
        
        lab.setBounds(0,0,200,30);
        lab1.setBounds(0,30,200,30);
        lab2.setBounds(0,60,200,30);
        lab4.setBounds(0,90,200,30);
        lab3.setBounds(0,120,200,30);
        
        txt.setBounds(200,0,200,30);
        txt1.setBounds(200,30,200,30);
        txt2.setBounds(200,60,200,30);
        txt3.setBounds(200,90,200,30);
        txt4.setBounds(200,120,200,30);
            
        b.setBounds(100,170,200,30);
        
        f.remove(b);
        f.add(b);
        b.setText("Ajouter");
        
        b.addActionListener(this);
        b.setText("Ajouter");
        f.add(lab);
        f.add(lab1);
        f.add(lab2);
        f.add(lab3);
        f.add(txt);
        f.add(txt1);
        f.add(txt2);
        f.add(txt3);
        f.add(txt4);
        f.add(lab4);
        f.remove(cb1);
        f.remove(cb2);
        f.remove(cb);
        
        m.add(i1);
        m.add(i2);
        m.add(i3);
        m.add(i4);
        m1.add(i5);
        m1.add(i6);
        m1.add(i7);
        m1.add(i8);
        mb.add(m);
        mb.add(m1);
        
        m.add(i1);
        m.add(i2);
        m.add(i3);
        m.add(i4);
        m1.add(i5);
        m1.add(i6);
        m1.add(i7);
        m1.add(i8);
        mb.add(m);
        mb.add(m1);
        f.setJMenuBar(mb);
        
        cb.addActionListener(this);
        
        i1.addActionListener(this);
        i2.addActionListener(this);
        i3.addActionListener(this);
        i4.addActionListener(this);
        i5.addActionListener(this);
        i6.addActionListener(this);
        i7.addActionListener(this);
        i8.addActionListener(this);
        
        
        
        

        f.repaint();
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);
        
        
    }

    
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==i1){
        i=1;
        System.out.println("i="+i);
        
        
        b.setText("Ajouter");
        f.setTitle("Creer ordonnance ");
        
        lab.setText("code de l'ordonnance :");
        lab1.setText("nom du medicament :");
        lab2.setText("prise par jour :");
        lab3.setText("nombre de boite :");
        lab4.setText("code du patient :");
                
        
        lab.setBounds(0,0,200,30);
        lab1.setBounds(0,30,200,30);
        lab2.setBounds(0,60,200,30);
        lab3.setBounds(0,90,200,30);
        lab4.setBounds(0, 120, 200,30);
        
        txt.setBounds(200,0,200,30);
        txt1.setBounds(200,30,200,30);
        txt2.setBounds(200,60,200,30);
        txt3.setBounds(200,90,200,30);
        txt4.setBounds(200,120,200,30);
        
        b.setBounds(100,200,200,30);
        
        f.remove(b);
        f.add(b);
        
        f.remove(cb1);
        f.remove(cb2);
        f.remove(cb);
        
        f.add(lab);
        f.add(lab1);
        f.add(lab2);
        f.add(lab3);
        f.add(lab4);
        f.remove(lab5);
        f.add(txt);
        f.add(txt1);
        f.add(txt2);
        f.add(txt3);
        f.add(txt4);
        f.remove(txt5);
        
        
        f.repaint();
        f.setVisible(true);
        }
        if(e.getSource()==i2){
            i=2;
            System.out.println("i="+i);
         f.setTitle("Creer Consultation ");
        
        b.setText("Ajouter");
        lab.setBounds(0,0,200,30);
        lab1.setBounds(0,30,200,30);
        lab2.setBounds(0,60,200,30);
        lab4.setBounds(0,90,200,30);
        lab3.setBounds(0,120,200,30);
        lab5.setBounds(0,150,200,30);
        
        lab.setText("code du patient :");
        lab1.setText("date consultation : ");
        lab2.setText("type de consultation :");
        lab3.setText("code de fiche : ");
        lab4.setText("remarque :");
        //lab5.setText("code de ordonnance :");
        
        
        txt.setBounds(200,0,200,30);
        txt1.setBounds(200,30,200,30);
        txt2.setBounds(200,60,200,30);
        txt3.setBounds(200,90,200,30);
        txt4.setBounds(200,120,200,30);
        txt5.setBounds(200,150,200,30);
        
        b.setBounds(100,200,200,30);
   
        f.add(b);
            
        f.remove(cb1);
        f.remove(cb2);
        f.remove(cb);
        
        f.add(lab);
        f.add(lab1);
        f.add(lab2);
        f.add(lab3);
        f.remove(lab5);
        f.add(txt);
        f.add(txt1);
        f.add(txt2);
        f.add(txt3);
        f.add(txt4);
        f.remove(txt5);
        f.add(lab4);   
        
        f.repaint();
        f.setVisible(true);
        }
        if(e.getSource()==i4){
            
            i=3;
            System.out.println("i="+i);
            f.setTitle("Creer fiche :");
        
        b.setText("Ajouter");
        lab.setBounds(0,0,200,30);
        lab1.setBounds(0,30,200,30);
        lab2.setBounds(0,60,200,30);
        lab4.setBounds(0,90,200,30);
        lab3.setBounds(0,120,200,30);
        lab5.setBounds(0,150,200,30);
        
        lab.setText("code de fiche :");
        lab1.setText("code de patient : ");
        
        
        
        txt.setBounds(200,0,200,30);
        txt1.setBounds(200,30,200,30);
        txt2.setBounds(200,60,200,30);
        txt3.setBounds(200,90,200,30);
        txt4.setBounds(200,120,200,30);
        txt5.setBounds(200,150,200,30);
           
        f.remove(cb1);
        f.remove(cb2);
        f.remove(cb);
        
        f.add(lab);
        f.add(lab1);
        f.remove(lab2);
        f.remove(lab3);
        f.remove(lab5);
        f.add(txt);
        f.add(txt1);
        f.remove(txt2);
        f.remove(txt3);
        f.remove(txt4);
        f.remove(txt5);
        f.remove(lab4);   
        
        f.repaint();
        f.setVisible(true);
        }
        if(e.getSource()==i3){
        f.setTitle("Creer Patient ");
        i=0;
        System.out.println("i="+i);
        
        
        
        lab.setText("code du patient :");
        lab1.setText("nom du patient :");
        lab2.setText("prenom du patient :");
        lab4.setText("adresse :");
        lab3.setText("numero de tel :");
        
        lab.setBounds(0,0,200,30);
        lab1.setBounds(0,30,200,30);
        lab2.setBounds(0,60,200,30);
        lab4.setBounds(0,90,200,30);
        lab3.setBounds(0,120,200,30);
        
        txt.setBounds(200,0,200,30);
        txt1.setBounds(200,30,200,30);
        txt2.setBounds(200,60,200,30);
        txt3.setBounds(200,90,200,30);
        txt4.setBounds(200,120,200,30);
        
        f.remove(cb1);
        f.remove(cb2);
        f.remove(cb);
        
        f.add(lab);
        f.add(lab1);
        f.add(lab2);
        f.add(lab3);
        f.add(txt);
        f.add(txt1);
        f.add(txt2);
        f.add(txt3);
        f.add(txt4);
        f.add(lab4);
        
        f.repaint();
        f.setVisible(true);
        }
        
        if(e.getSource()==i5){
            i=4;
            System.out.println("i="+i);
            x=0;
            System.out.println("x="+x);
        b.setText("Supprimer");
        f.setTitle("Supprimer Patient ");
        
        
        
        lab.setText("nom du patient :");
        lab1.setText("code du patient :");
    
        lab.setBounds(0,0,200,30);
        lab1.setBounds(0,30,200,30);

        
        txt.setBounds(200,0,200,30);
        txt.addActionListener(this);
        cb.setBounds(200,30,200,30);
        

        f.add(lab);
        f.add(lab1);
        f.remove(lab2);
        f.remove(lab3);
        f.add(txt);
        
        f.remove(cb1);
        f.remove(cb2);
        f.add(cb);
        f.remove(txt1);
        f.remove(txt2);
        f.remove(txt3);
        f.remove(txt4);
        f.remove(lab4);
        
        f.repaint();
        f.setVisible(true);
        }
        if(e.getSource()==i6){
            i=5;
            System.out.println("i="+i);
            x=1;
            System.out.println("x="+x);
            
            f.setTitle("Supprimer Consultation ");
        
        
        b.setText("Supprimer");
        lab.setText("nom du patient :");
        lab1.setText("code du patient :");
        lab2.setText("date de consultation :");
    
        lab.setBounds(0,0,200,30);
        lab1.setBounds(0,30,200,30);
        lab2.setBounds(0,60,200,30);

        
        txt.setBounds(200,0,200,30);
        txt.addActionListener(this);
        cb.setBounds(200,30,200,30);
        cb1.setBounds(200,60,200,30);
        

        f.add(lab);
        f.add(lab1);
        f.add(lab2);
        f.remove(lab3);
        f.add(txt);
        f.add(cb);
        f.remove(cb2);
        f.add(cb1);
        f.remove(txt1);
        f.remove(txt2);
        f.remove(txt3);
        f.remove(txt4);
        f.remove(lab4);
        
        f.repaint();
        f.setVisible(true);
        }
        if(e.getSource()==i7){
            i=6;
            System.out.println("i="+i);
            x=2;
            System.out.println("x="+x);
            f.setTitle("Supprimer Fiche");
        
        
        b.setText("Supprimer");
        lab.setText("nom du patient :");
        lab1.setText("code du patient :");
        lab2.setText("code de fiche :");
    
        lab.setBounds(0,0,200,30);
        lab1.setBounds(0,30,200,30);
        lab2.setBounds(0,60,200,30);

        
        txt.setBounds(200,0,200,30);
        txt.addActionListener(this);
        cb.setBounds(200,30,200,30);
        cb2.setBounds(200,60,200,30);
        

        f.add(lab);
        f.add(lab1);
        f.add(lab2);
        f.remove(lab3);
        f.add(txt);
        f.add(cb);
        f.remove(cb1);
        f.add(cb2);
        f.remove(txt1);
        f.remove(txt2);
        f.remove(txt3);
        f.remove(txt4);
        f.remove(lab4);
        
        f.repaint();
        f.setVisible(true);
        }
        if(e.getSource()==i8){
            i=7;
            System.out.println("i="+i);
            x=3;
            System.out.println("x="+x);
            
            f.setTitle("Supprimer Ordonnance");
        
        
        b.setText("Supprimer");
        lab.setText("nom du patient :");
        lab1.setText("code du patient :");
        lab2.setText("code d'ordonnance :");
    
        lab.setBounds(0,0,200,30);
        lab1.setBounds(0,30,200,30);
        lab2.setBounds(0,60,200,30);

        
        txt.setBounds(200,0,200,30);
        txt.addActionListener(this);
        cb.setBounds(200,30,200,30);
        cb2.setBounds(200,60,200,30);
        

        f.add(lab);
        f.add(lab1);
        f.add(lab2);
        f.remove(lab3);
        f.add(txt);
        f.add(cb);
        f.remove(cb1);
        f.add(cb2);
        f.remove(txt1);
        f.remove(txt2);
        f.remove(txt3);
        f.remove(txt4);
        f.remove(lab4);
        
        f.repaint();
        f.setVisible(true);
        }
        
        if (e.getSource()==txt){
            cb.setModel(new DefaultComboBoxModel());
            Dao d = new Dao(txt.getText(),0);
            
            list=d.get_result();
            array=list.toArray(new Integer [0]);
            for (int a=0;a<array.length;a++){
            cb.addItem(array[a]);
            }
        }
        if (e.getSource()==cb){
            if(x==1){
                cb1.setModel(new DefaultComboBoxModel());
                Dao d = new Dao(x,((Integer)cb.getSelectedItem()).intValue());
                list1=d.get_result1();
                array1=list1.toArray(new String [0]);
                for (int a=0;a<array1.length;a++){
                    System.out.println(array1[a]);
                    cb1.addItem(array1[a]);
                }     
            }
            if(x==2){
                cb2.setModel(new DefaultComboBoxModel());
                Dao d = new Dao(x,((Integer)cb.getSelectedItem()).intValue());
                list=d.get_result();
                array=list.toArray(new Integer[0]);
                for (int a=0;a<array.length;a++){
                    System.out.println(array[a]);
                    cb2.addItem(array[a]);
                }
            }
            if(x==3){
                cb2.setModel(new DefaultComboBoxModel());
                Dao d = new Dao(x,((Integer)cb.getSelectedItem()).intValue());
                list=d.get_result();
                array=list.toArray(new Integer[0]);
                for (int a=0;a<array.length;a++){
                    System.out.println(array[a]);
                    cb2.addItem(array[a]);
                }
        }
        }
        
        if (e.getSource()== b){
            if (i==0){
                System.out.println("i="+i);
                Patient p = new Patient(parseInt(txt.getText()),txt1.getText(),txt2.getText(),parseInt(txt4.getText()),txt3.getText());
        Dao d = new Dao(p); 
            }
            if (i==1){
                System.out.println("i="+i);
        Ordonnance o = new Ordonnance(parseInt(txt.getText()),txt1.getText(),txt2.getText(),txt3.getText(),parseInt(txt4.getText()));
        Dao d = new Dao(o); 
        }
            if (i==2){
                System.out.println("i="+i);
                Consultation c = new Consultation(parseInt(txt.getText()),txt1.getText(),txt2.getText(),txt3.getText(),parseInt(txt4.getText()));
        Dao d = new Dao(c);
            }
            if (i==3){
                System.out.println("i="+i);
                Fiche f = new Fiche(parseInt(txt.getText()),parseInt(txt1.getText()));
        Dao d = new Dao(f); 
        }
            if (i==4){
                System.out.println("i="+i);
                System.out.println("x="+x);
                Dao d=new Dao(x,((Integer)cb.getSelectedItem()).intValue());
                cb.setModel(new DefaultComboBoxModel());
                cb1.setModel(new DefaultComboBoxModel());
                cb2.setModel(new DefaultComboBoxModel());
            }
            if (i==5){
                System.out.println("i="+i);
                System.out.println("x="+x);
                Dao d = new Dao(x,((Integer)cb.getSelectedItem()).intValue(),((String)cb1.getSelectedItem()));
                cb.setModel(new DefaultComboBoxModel());
                cb1.setModel(new DefaultComboBoxModel());
                cb2.setModel(new DefaultComboBoxModel());
            }
            if (i==6){
                x=1;
                System.out.println("i="+i);
                System.out.println("x="+x);
                Dao d= new Dao(x,((Integer)cb.getSelectedItem()).intValue(),((Integer)cb2.getSelectedItem()).intValue());
                cb.setModel(new DefaultComboBoxModel());
                cb1.setModel(new DefaultComboBoxModel());
                cb2.setModel(new DefaultComboBoxModel());
            }
            if (i==7){
                System.out.println("i="+i);
                System.out.println("x="+x);
                Dao d= new Dao(x,((Integer)cb.getSelectedItem()).intValue(),((Integer)cb2.getSelectedItem()).intValue());
                cb.setModel(new DefaultComboBoxModel());
                cb1.setModel(new DefaultComboBoxModel());
                cb2.setModel(new DefaultComboBoxModel());
            }
        }
    }
}

    
    

