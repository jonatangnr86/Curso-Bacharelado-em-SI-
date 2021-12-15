package ExercicioFila002ParOuImpar;

public class Principal {

    private static Fila original;                                               //Fila que recebera todos os valores
    private static Fila par;
    private static Fila impar;
    
    public static void main(String[] args) {

        original = new Fila(10);                                                // Cria fila com 10 posições instanciada a classe fila
        par = new Fila(10);                                                     // Cria fila par
        impar = new Fila(10);                                                   // Cria fila impar
         
      for(int i = 1; i <= 10; i ++){                                            // insere valores a lista
        original.inserir(i);
      }

        System.out.println("Fila original");
        original.imprimir();
        
        for (int i = 0; i < original.getItens(); i++){                          //verifica se é par ou impar         
            if(original.getDados(i) % 2 == 0){                                  // % verifica ser resto da divisão é = 0
               par.inserir(original.getDados(i));
            }else{
                impar.inserir(original.getDados(i));
            }                      
        }  
                
        System.out.println("Lista de números Pares");
        par.imprimir();
        
        System.out.println("\nLista de nnúmeros Impares");
        impar.imprimir();
    }
}
