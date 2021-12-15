package Exercicio04;

import javax.swing.JOptionPane;

public class Ex04 {

    public static void main(String[] args) {

        String item;
        String tx = "Lista de tarefas.";

        for (int i = 0; i < 10; i++) {
            item = JOptionPane.showInputDialog(null, "Informe o valor do item " + i + ":");
            if (item == null) {
                System.exit(0);
            } else {
                tx = tx + "\n " + (i = 1) + i + " " + item;
            }
        }
         JOptionPane.showMessageDialog(null, tx);
    }
}
