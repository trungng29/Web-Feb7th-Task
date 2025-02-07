/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jtableexample;

/**
 *
 * @author ADMIN
 */
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable; 
public class JTableExample { 
    public static void main(String[] args) { 
       String[][] data = { {"1", "Alice", "24"}, {"2", "Bob", "30"}, {"3", "Charlie", "22"} };
       String[] columnNames = {"ID", "Name", "Age"};
       JTable table = new JTable(data, columnNames); 
       JScrollPane scrollPane = new JScrollPane(table); 
       JFrame frame = new JFrame("JTable Example"); 
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
       frame.add(scrollPane); 
       frame.setSize(300, 150); 
       frame.setVisible(true); 
    } 
}