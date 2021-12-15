package com.mycompany.aula003;

import java.util.Scanner;

public class ConversaoTextoNumero {

    public static void main(String[] args) {

        System.out.println("Informe um número:"); //Solicita o número ao usuário
        Scanner scan = new Scanner(System.in); //Cria objeto do tipo scan pra framer de 
        String texto = scan.nextLine(); // Declara a variavel e faz a leitura do dado da linha

        double db = Double.parseDouble(texto); // Converte o texto para número
        
        int numero = Integer.parseInt(texto); // Converte texto para um numero inteiro
        
        float ft = Float.parseFloat(texto); // Converte texto parq tipo float
        
        byte bt = Byte.parseByte(texto); // Converte texto para tio byte
        
        short st = Short.parseShort(texto); // Converte texto para tipo short
        
        long lg = Long.parseLong(texto); // Converte texto para tipo long

        System.out.printf("\n Conteúdo das variáveis: " + db + " " + numero + " " + ft + " " + bt + " " + st + " " + lg );

    }

}
