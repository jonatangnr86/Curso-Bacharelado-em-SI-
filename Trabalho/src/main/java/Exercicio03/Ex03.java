package Exercicio03;

import javax.swing.JOptionPane;

public class Ex03 {

    public static void main(String[] args) {

        String txNome = "Informe seu nome: ";
        String txIdade = "Iforme sua idade: ";
        String nome;
        String idade;
        int n = 0;
        int idad = 0;

        nome = JOptionPane.showInputDialog(null, txNome);
        n = nome.length();
        JOptionPane.showMessageDialog(null, n);

        while (nome.length() < 3 || n > 50) {
            JOptionPane.showMessageDialog(null, "Nome inválido");
            nome = JOptionPane.showInputDialog(null, txNome);
            n = nome.length();
        }

        do {
            idade = JOptionPane.showInputDialog(null, txIdade);
            if (idade == null) {
                System.exit(0);
            } else {
                idad = Integer.parseInt(idade); //Converte idade em inteiro 
            }
        } while (idad < 18);

        JOptionPane.showMessageDialog(null, "Nome: " + nome + " Idade: " + idad);
    }
}
