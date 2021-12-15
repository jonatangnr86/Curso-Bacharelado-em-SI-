
package com.jdiogo.aula02;

import java.util.Scanner;

import java.text.NumberFormat;


public class CalculoImpostos {
    public static void main(String[] args){
        
        double faturamento;
        double valor_cofins;
        
          Scanner scan = new Scanner(System.in); // Cria objeto tipo scanner
          NumberFormat nf = NumberFormat.getCurrencyInstance();// Instancia a classe forma para formatação de numeros.
          
          System.out.println("Informe o faturamento da empresa: "); // solicita valor do faturamento
          faturamento = scan.nextDouble(); //leietura do valor de faturamento
          
          valor_cofins = ((faturamento * 100)/10);
          
          System.out.println("Total: " + nf.format(valor_cofins));// imprime valor 
        
        
    }
}
