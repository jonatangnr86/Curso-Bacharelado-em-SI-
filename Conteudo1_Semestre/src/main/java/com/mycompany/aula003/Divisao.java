package com.mycompany.aula003;

import java.io.PrintStream;
import java.util.Scanner;

public class Divisao {
    
    public static void main(String [] args){
        
      Scanner entrada = new Scanner(System.in); //Objeto scanner leitura "leia"
      PrintStream saida = System.out; // objeto saida "Escreval"
      
      saida.println("Informe o primeiro número: ");
      double n1 = entrada.nextDouble(); // Declara variável e lê o valor informado
          
      saida.println("Informe o segundo número: ");
      double n2 = entrada.nextDouble(); // Declara variável e lê o valor informado
      
      String divisao = String.valueOf(n1/n2); // Cria var tipo string, recebe a divisão e chama função que permite o cálculo 
      
      saida.println("O valor da divisão é:" + divisao); //Imprime o resultado da divisão que esta na variável divisão
      
        
    }    
}
