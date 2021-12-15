
package com.mycompany.aula008.Recursividade;


public class Fatorial {
    
    public static int fatorial(int valor){ // Cria método fatorial
        
        if(valor == 0){ // Ponto de parada
            return 1;
        }
        return valor * fatorial(valor - 1); // Formula caso geral da recursividade
        
    }   
    
}
