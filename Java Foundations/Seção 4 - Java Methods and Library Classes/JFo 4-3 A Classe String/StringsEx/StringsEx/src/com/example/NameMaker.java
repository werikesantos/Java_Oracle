/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import javax.swing.JOptionPane;

public class NameMaker {
    
    public static void main(String args[])
    {
        String firtName, middleName, lastName, fullName;
        
        firtName = JOptionPane.showInputDialog("Digite o seu nome");
        middleName = JOptionPane.showInputDialog("Digite o seu nome do meio");
        lastName = JOptionPane.showInputDialog("Digite o seu sobrenome");
        
        fullName = firtName + " " + middleName + " " + lastName;
                
        JOptionPane.showMessageDialog(null, fullName);
        
        
    }
    
}
