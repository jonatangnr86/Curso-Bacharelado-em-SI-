package com.mycompany.aula003;

import java.io.PrintStream;
import java.util.Scanner;

public class OperadoresLogicos {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in); //Objeto scanner leitura "leia"
        PrintStream saida = System.out; // objeto saida "Escreval"

        saida.println("Informe o primeiro valor boleano: ");
        boolean b1 = entrada.nextBoolean();

        saida.println("Informe o segundo valor boleano: ");
        boolean b2 = entrada.nextBoolean();

        saida.println ("Valores lógicos: " + "b1 = " + b1 + " b2 = " + b2);
        
        if(b1 == b2){
            saida.println("Ambos são iguais");
        }else{
            saida.println("São diferentes");
        }
        
    }

}