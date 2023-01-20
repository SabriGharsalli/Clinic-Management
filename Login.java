/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author SSabri&Ismail
 */
public class Login extends JFrame implements ActionListener {
    JFrame f =new JFrame();
    JButton but=new JButton("Connect");
    JTextField txt =new JTextField();
    JTextField txt1=new JTextField();
    JLabel test  =new JLabel("correct");
    
    
    
    public Login(){
      JLabel lab=new JLabel("User name ");
      JLabel lab1=new JLabel("password");
      
      JLabel test1= new JLabel ("incorrect");
      
      String x;
      
      
      f.setTitle("Fanen");
      f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
      f.setSize(500,300);
      f.setLayout(null);
      txt1.setBounds(150,30,200,30);
      txt.setBounds(150,0,200,30);
      lab.setBounds(0,0,100,30);
      lab1.setBounds(0,30,100,30);
      but.setBounds(100,80,100,30);
      test.setBounds(100,120,100,30);
      
      
      
      f.add(lab);
      f.add(lab1);
      f.add(txt);
      f.add(txt1);
      f.add(but);
      
      
      but.addActionListener(this);
      
      
      f.setVisible(true);
   }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==but){
            if ((txt.getText().equals("Ismail Sahnoun"))&&(txt1.getText().equals("123456")))
        {Principalinter f1 = new Principalinter();
        }
    }
    }  
    
}
