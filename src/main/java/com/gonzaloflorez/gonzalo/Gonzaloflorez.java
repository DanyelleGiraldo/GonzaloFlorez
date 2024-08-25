/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.gonzaloflorez.gonzalo;

import javax.swing.JFrame;

/**
 *
 * @author Danilo
 */
public class Gonzaloflorez {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Mi Aplicación");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1366, 700);
        MainView mainView = new MainView();
        frame.add(mainView);
        frame.setVisible(true);
        
    }
}
