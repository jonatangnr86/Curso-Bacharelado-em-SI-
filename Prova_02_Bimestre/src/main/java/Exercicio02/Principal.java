package Exercicio02;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Manipula mani = new Manipula();                                         //Cria objeto instanciado para manipular a pilha
        int x = 0;
        Pilha par = mani.cria();                                                // Cria pilha de números pares

        for (int i = 0; i <= 9; i++) {
            System.out.println("Informe o " + (i + 1) + " número Positivo:");
            x = scan.nextInt();

            while (x < 0) {
                System.out.println("Somente números Positivos são válidos");
                System.out.println("\nInforme o " + (i + 1) + " número Positivo:");
                x = scan.nextInt();
            }

            if (x % 2 == 0) {
                mani.push(par, x);                                              // Se numero for par empilha
            }
        }

        if (par.topo == null) {                                                 // Verifica se a piha esta vazia
            System.out.println("Pilha Vazia!");                                 
        } else {
            System.out.println("\nPilha de números Pares: ");                   // Imprime a Pilha com numeros pares
            mani.imprimir(par);
        }
    }

}
