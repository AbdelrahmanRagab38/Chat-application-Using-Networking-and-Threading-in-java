/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


/**
 *
 * @author rabony
 */
public class Client extends JFrame {
    private JLabel recivedMsg;
    private JTextField tx_Msg = new JTextField("Write message to server");
    InputStream is;
    OutputStream os;
    Socket toFromserver = null;
    String clientName;
    public Client (String Name) throws IOException
    {
        this.clientName=Name;
        setSize(300,600);
        setTitle("Client v " + Name);
        recivedMsg = new JLabel("<html>Recived Message<br>");
        setLayout(null);
        recivedMsg.setBounds(20, 100, 100, 50);
        add(recivedMsg);
        JButton btnReciveMsg = new JButton("Send");
        btnReciveMsg.setBounds(20, 300, 100, 50);
        tx_Msg.setBounds(20,350,150,50);
        add(tx_Msg);
        btnReciveMsg.addActionListener(new act());
        add(btnReciveMsg);
           
               try {
                    toFromserver = new Socket("192.168.1.34",6000);
                    is = toFromserver.getInputStream();
                    os = toFromserver.getOutputStream();
                    updategui t= new updategui();
                    t.start();
               } catch (IOException ex) {
                   
               }
    }
    private class act implements ActionListener 
    {
         
        @Override
        public void actionPerformed(ActionEvent e) {
            PrintWriter pw = new PrintWriter(os,true);
            pw.println(clientName+": "+tx_Msg.getText());
        }
    }
    private class updategui extends Thread 
    {
        
        public void run()
        {
            while (true)
            {
                
            }
        }
    }
    
    
}
