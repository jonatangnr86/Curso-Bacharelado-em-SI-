package Exercicio07;

import javax.swing.JOptionPane;

public class Ex07 {

    public static void main(String[] args) {

        Lista a = new Lista();
        Lista b = new Lista();
        Lista c = new Lista();

        for (int i = 0; i < 5; i++) {
            String tx = JOptionPane.showInputDialog(null, "Digite um valor para lista A: ");
            int n = Integer.parseInt(tx);
            a.inserirInicio(n);
        }

        for (int i = 0; i < 5; i++) {
            String tx = JOptionPane.showInputDialog(null, "Digite um valor para lista B: ");
            int n = Integer.parseInt(tx);
            b.inserirInicio(n);
        }

        c.criarNo(a); // Lista c recebe a lista a
        c.criarNo(b); // Lista c recebe a lista b

        JOptionPane.showMessageDialog(null, "Listas 1, 2 e 3 Impressas no Console", "Mensagem", 1);

        System.out.println("\nLista 1: ");
        a.imprimir();

        System.out.println("\nLista 2: ");
        b.imprimir();

        System.out.println("\nLista 3: ");
        c.imprimir();

    }
}
