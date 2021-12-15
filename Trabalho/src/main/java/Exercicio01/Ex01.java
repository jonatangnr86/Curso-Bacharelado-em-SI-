package Exercicio01;

import javax.swing.JOptionPane;

public class Ex01 {

    public static void main(String[] args) {

        String nome;
        String st = "Informe seu nome:";

        st = JOptionPane.showInputDialog(null, st); // Solicita e recebe o nome na caixa de dialogo
       
        if (st.length() < 3 || st.length() > 50) {
            JOptionPane.showMessageDialog(null, "Nome Inválido!");
            System.exit(0);
        } else {
            JOptionPane.showMessageDialog(null, "Seu mome é: " + st);
        }

    }
}
