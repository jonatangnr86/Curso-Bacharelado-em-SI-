/*Exercício 01.
  Utilizando o conceito de pilhas desenvolva um programa que leia uma sequência
  de 10 números inteiros e positivos. Imprima primeiro os números impares na ordem 
  inversa da leitura e, depois, os números pares também na ordem inversa da leitura.
  Utilize duas pilhas uma para armazenar os números impares e outra para armazenar 
  os números pares.
*/

package Exercicio01;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        Manipula mani = new Manipula();                                         //Cria objeto instanciado para manipular a pilha
        int x = 0;
        Pilha par = mani.cria();                                                // Cria pilha de números pares
        Pilha impar = mani.cria();                                              // Cria pilha de números impares
       
        for (int i = 0; i <= 9; i++) {    
             System.out.println("Informe o " + (i + 1) + " número Positivo:");
                x = scan.nextInt();
                
            while(x < 0) {
                System.out.println("Somente números Positivos são válidos");               
                System.out.println("\nInforme o " + (i + 1) + " número Positivo:");
                x = scan.nextInt();               
            }
            if (x >= 0) {
                if (x % 2 == 0) {
                    mani.push(par, x);                                          // Pilha que recebe números pares
                } else {
                    mani.push(impar, x);
                }
            }
        }
        System.out.println("\nPilha de números Pares: ");                       // Imprime a lista par
        mani.imprimir(par);
            
        System.out.println("\nPilha de números Impares: ");                     // Imprime a lista Ímpar
        mani.imprimir(impar);                                  
    }    
}
