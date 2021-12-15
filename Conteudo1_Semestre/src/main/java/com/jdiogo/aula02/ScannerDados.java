
package com.jdiogo.aula02;

import java.util.Scanner;


public class ScannerDados {
    public static void main(String[] Args){
        
        Scanner scan = new Scanner(System.in); // Cria o objeto do tipo scaner
        
        String nome;
        String email;
        
        System.out.println("Informe o nome:");//Exibe pergunta ao usuario
        nome = scan.nextLine(); //Leitura da variavel
        
        System.out.println("Informe o email:");//Solicita email
        email = scan.nextLine();//Leietura da variavel
        
        System.out.println("Meu nome e: " + nome);//Imprime nome e e-mail.
        System.out.println("\n E-mail:" + email);//Imprime email
    
    }
}
