/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursividade03;

import javax.swing.JOptionPane;

/**
 *
 * @author jonat
 */
public class Principal {
    public static void main(String[] args) {
        
         int base = 0;
        int expo = 0;
        int soma = 0;

        String st = "Informe valor da Base";
        st = JOptionPane.showInputDialog(null, st); // Faz a leitura do valor inserido
        if (st == null) { // length faz a contagem da variavel, 
            JOptionPane.showMessageDialog(null, "É necessário informar valor!"); // Se não informar valor exibe msg
        } else {
            base = (int) Double.parseDouble(st); // Atribui valor de st em n1 como inteiro
        }
        String st1 = "Informe o expoente";
        st1 = JOptionPane.showInputDialog(null, st1); // Faz a leitura do valor inserido
        if (st1 == null) { // length faz a contagem da variavel, 
            JOptionPane.showMessageDialog(null, "É necessário informar valor!"); // Se não informar valor exibe msg
        } else {
            expo = (int) Double.parseDouble(st1); // Atribui valor de st em n2 como inteiro
        }
        soma = Fatorial.fatorial(base, expo); 

        JOptionPane.showMessageDialog(null, "A soma dos valores é: " + soma);
        
    }
}
