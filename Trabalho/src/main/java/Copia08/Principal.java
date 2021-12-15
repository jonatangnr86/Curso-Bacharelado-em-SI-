
package Copia08;

import javax.swing.JOptionPane;


public class Principal {
    public static void main(String[] args) {

        
        soma somar = new soma();

        int num01 = 0;
        int num02 = 0;
        int res = 0;

        String st = JOptionPane.showInputDialog(null, "Informe o 1° número: ");
        num01 = Integer.parseInt(st);

        if (num01 == 0) {
      
            System.exit(0);
        } else {
        }
        String st1 = JOptionPane.showInputDialog(null, "Informe o 2° número: ");
        num02 = Integer.parseInt(st1);

        if (num02 == 0) {
            
            System.exit(0);
        }
      res =  somar.soma(num01, num02);
      
      JOptionPane.showMessageDialog(null, "O Resultado é: " + res, "Resultado", 1);
    }
}
