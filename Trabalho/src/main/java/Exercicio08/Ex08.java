package Exercicio08;

import javax.swing.JOptionPane;

public class Ex08 {

    public static void main(String[] args) {

        
        Funçoes resultado = new Funçoes();

        int num01 = 0;
        int num02 = 0;
        int res = 0;

        String st = JOptionPane.showInputDialog(null, "Informe o 1° número: ");
        num01 = Integer.parseInt(st);

        if (num01 == 0) {
            JOptionPane.showMessageDialog(null, "Número Inválido!");
            System.exit(0);
        } else {
        }
        String st1 = JOptionPane.showInputDialog(null, "Informe o 2° número: ");
        num02 = Integer.parseInt(st1);

        if (num02 == 0) {
            JOptionPane.showMessageDialog(null, "Número Inválido!");
            System.exit(0);
        }
      res =  resultado.soma(num01, num02);
      
      JOptionPane.showMessageDialog(null, "O Resultado é: " + res, "Resultado", 1);
    }
}
