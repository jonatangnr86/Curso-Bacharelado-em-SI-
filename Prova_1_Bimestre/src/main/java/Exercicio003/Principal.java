package Exercicio003;

import javax.swing.JOptionPane;

/**
 *
 * @author jonat
 */
public class Principal {

    public static void main(String[] args) {

        // Exemplol de fatorial
        int num = 0;

        String tx = JOptionPane.showInputDialog(null, "Digite um número: ");
        num = Integer.parseInt(tx);

        int fator = Fatorial.fatorial(num);

        if (fator == 1) {
            System.exit(fator);
        } else 

            for (int i = 0; i < 20; i++) {

                System.out.println(fator);
            }
        }
    }

