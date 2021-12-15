package Exercicio003;


public class Fatorial {
   public static int fatorial(int valor){ // Cria método fatorial
        
        if(valor < 2){ // Ponto de parada
            return 1;
        
        }else{
        return ( fatorial(valor - 1) + fatorial(valor - 2)); // Formula  recursividade  
        }
    }  
}
