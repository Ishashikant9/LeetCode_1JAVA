import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.util.Scanner;

import javax.swing.JFrame;

import java.awt.*;
public class Voting1 {
     
    
        
    
    public static void main(String[] args) {
        
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel=new JPanel();
        panel.setLayout(null);
        panel.setBounds(20,10,600,600);
        panel.setBackground(Color.GRAY);

        frame.add(panel);




        JLabel l1= new JLabel("<html><font style=size=200><b><u>WELCOME TO VOTING SYSTEM</u></b></font></html>");
        l1.setBounds(95,15,280,80);
        l1.setVisible(true);
        // l1.setBackground(Color.WHITE);
        panel.add(l1);



         





        frame.setSize(800,800);
        frame.setLayout(null);
        frame.setVisible(true); 
        new Voting1();
    }

}
