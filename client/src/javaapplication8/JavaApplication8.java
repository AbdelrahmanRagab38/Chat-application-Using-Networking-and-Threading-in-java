/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;


import java.io.IOException;
import javax.swing.JFrame;

/**
 *
 * @author rabony
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Client c1 = new Client("Employee");
        c1.setVisible(true);
        c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Client c2 = new Client("Customer");
        c2.setVisible(true);
        c2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
