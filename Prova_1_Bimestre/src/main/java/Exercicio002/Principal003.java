package Exercicio002;

import Exercicio002.Lista;
import javax.swing.JOptionPane;

public class Principal003 {

    public static void main(String[] args) {

        Lista a = new Lista();
        Lista b = new Lista();
        Lista c = new Lista();
        Lista d = new Lista();
        Lista e = new Lista();

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
        c = c.inverterLista(a);
        d = d.inverterLista(b);

        e.criarNo(c);
        e.criarNo(d);

        System.out.println("Lista 1");
        a.imprimir();

        System.out.println("\n" + " lista 2");
        b.imprimir();

        System.out.println("\n + lista 1 Invertida" + c);
        c.imprimir();

        System.out.println("\n + lista 2 Invertida" + d);
        d.imprimir();

        System.out.println("\n + lista 3");
        e.imprimir();
    }
}
