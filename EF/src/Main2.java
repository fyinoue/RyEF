
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author 1714290026
 */
public class Main2 {
    public static void main(String[] args) {
        JFrame janelaPrincipal = new JFrame();
        janelaPrincipal.setMinimumSize(new Dimension(720, 480));
        janelaPrincipal.setExtendedState(JFrame.MAXIMIZED_BOTH);
        janelaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janelaPrincipal.setVisible(true);
        
        JPanel painel_top = new JPanel();
        painel_top.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        JPanel painel_center = new JPanel();
        painel_center.setBorder(BorderFactory.createLineBorder(Color.ORANGE));
        JPanel painel_bot = new JPanel();
        painel_bot.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        
        janelaPrincipal.add(painel_top, BorderLayout.NORTH);
        janelaPrincipal.add(painel_center, BorderLayout.CENTER);
        janelaPrincipal.add(painel_bot, BorderLayout.SOUTH);
    }
}