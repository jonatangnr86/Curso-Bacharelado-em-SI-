package Exercicio02;

import javax.swing.JOptionPane;

public class Ex02 {

    public static void main(String[] args) {

        String email;
        String st = "Informe seu e-mail: ";
        String n = "@";

        st = JOptionPane.showInputDialog(null, st);

        email = st;

        if (email.contains("@")) {
            JOptionPane.showMessageDialog(null, "Seu e-mail é: " + email);
        } else {
            JOptionPane.showMessageDialog(null, "Email invalido ");
        }
    }
}
