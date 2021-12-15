package Exercicio01;

public class Principal {
    public static void main(String[] args) {
        
         Manipula mani = new Manipula();                                           
         Pilha a = mani.cria();         
         int[] v = new int [5];
        
          for (int i = 0; i <= 4; i++) {                                        
            mani.push(a, (i + 1));
        }
          
          System.out.println("Pilha Original:");
          mani.imprimir(a);
        
           for (int i = 0; i <= 4 ; i++){                                       
            v[i] = (int) mani.pop(a);                                      
        }
        
        for (int i = 0; i <= 4; i++){
             mani.push(a, v[i]);                                              
            
        }
        System.out.println("\n\nPilha Nodificada: ");
        mani.imprimir(a);
    }
  
}
