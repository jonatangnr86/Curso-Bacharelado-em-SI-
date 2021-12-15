package Recursvidade02;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {

        int n1 = 0;
        int n2 = 0;
        int soma = 0;

        String st = "Informe o primeiro valor";
        st = JOptionPane.showInputDialog(null, st); // Faz a leitura do valor inserido

        if (st == null) { // length faz a contagem da variavel, 
            JOptionPane.showMessageDialog(null, "É necessário informar valor!"); // Se não informar valor exibe msg
        } else {
            n1 = (int) Double.parseDouble(st); // Atribui valor de st em n1 como inteiro
        }

        String st1 = "Informe o segundo valor";
        st1 = JOptionPane.showInputDialog(null, st1); // Faz a leitura do valor inserido

        if (st1 == null) { // length faz a contagem da variavel, 
            JOptionPane.showMessageDialog(null, "É necessário informar valor!"); // Se não informar valor exibe msg
        } else {
            n2 = (int) Double.parseDouble(st1); // Atribui valor de st em n2 como inteiro
        }
        soma = Fatorial.fatorial(n1, n2); 

        JOptionPane.showMessageDialog(null, "A soma dos valores é: " + soma);

    }
}