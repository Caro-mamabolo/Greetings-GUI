/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class GreetingsGUI extends JFrame{
    //panels
    private JPanel namePnl;
    private JPanel surnamePnl;
    private JPanel nameAndsurnamePn1;
    private JPanel greetingsAreaPn1;
    private JPanel btnsPn1;
    private JPanel mainPn1;
    private JPanel headingsPn1;
    
    //labels
    private JLabel headingsLb1;
    private JLabel nameLbl;
    private JLabel surnameLbl;
    
    //textfields
    private JTextField nameTxtFld;
    private JTextField surnameTxtFld;
    
    //textarea
    private JTextArea greetingsTxtArea;
    
    //buttons
    private JButton greetBtn;
    private JButton clearBtn;
    private JButton exitBtn; 
    
  
    //default constructor
    public GreetingsGUI(){
        //configure GUI
        setLayout(new BorderLayout());
        setTitle("Greetings GUI");
        setSize(500, 550);
        setBackground(Color.YELLOW);
        
        //create the panels 
        namePnl = new JPanel(new FlowLayout());
        surnamePnl = new JPanel(new FlowLayout());
        
        nameAndsurnamePn1 = new JPanel(new GridLayout(2, 1));
        greetingsAreaPn1 = new JPanel(new BorderLayout());
        
        btnsPn1 = new JPanel(new FlowLayout());
        mainPn1 = new JPanel(new BorderLayout());
        
        headingsPn1 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        headingsPn1.setBorder(new BevelBorder(BevelBorder.RAISED));
        
        //create the labels
         headingsLb1 = new JLabel("Greetings App");
         nameLbl = new JLabel("Name: ");
         surnameLbl = new JLabel("Surname: ");
         
         //create text fields
         nameTxtFld = new JTextField(20);
         surnameTxtFld = new JTextField(20);
         
         //create the text area
         greetingsTxtArea = new JTextArea(25, 40);
         greetingsTxtArea.setEditable(false);
         greetingsTxtArea.setText("Hello [name] [surname]");
         
         //create the buttons
         greetBtn = new JButton("Greet");
         clearBtn = new JButton("Clear");
         exitBtn = new JButton("Exit");
         
         //add name  label textfield to the name panel
         namePnl.add(nameLbl);
         namePnl.add(nameTxtFld);
         
         //add surname label + textfield to surname panel
         surnamePnl.add(surnameLbl);
         
         //add name and the surname pnl to the collective pnl
         nameAndsurnamePn1.add(namePnl);
         nameAndsurnamePn1.add(surnamePnl);
         
         //add the greetings area to its panel
         greetingsAreaPn1.add(greetingsTxtArea);
         greetingsAreaPn1.setBorder(new TitledBorder(new LineBorder(Color.BLACK,1),"Greetings Text"));
         
         //add buttons to their panel
         btnsPn1.add(greetBtn);
         btnsPn1.add(clearBtn);
         btnsPn1.add(exitBtn);
         
         headingsPn1.add(headingsLb1);
         
         //add all the panels to the main pnl
         mainPn1.add(nameAndsurnamePn1,BorderLayout.NORTH);
         mainPn1.add(nameAndsurnamePn1,BorderLayout.CENTER);
         mainPn1.add(btnsPn1,BorderLayout.SOUTH);
         
         //add the main pnl to the frame's pnl
         add(headingsPn1,BorderLayout.NORTH);
         add(mainPn1,BorderLayout.CENTER);
         
         //make the frame xisible 
         setVisible(true);
        
        
        
        
        
    
    }
    
}
