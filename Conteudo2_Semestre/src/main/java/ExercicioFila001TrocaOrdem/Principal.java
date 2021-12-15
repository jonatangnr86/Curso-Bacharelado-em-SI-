package ExercicioFila001TrocaOrdem;


public class Principal {
     public static void main(String[] args) {
        
    
        Manipula mani = new Manipula(); // Cria objeto instanciado a classa Manipular

        Fila f = new Fila();                   // Cria a fila f
              
        int[] vet = new int [5];             // Permite acessar o vet
        
        mani.inserir(f, 10);
        mani.inserir(f, 20);
        mani.inserir(f, 30);
        mani.inserir(f, 40);     
        mani.inserir(f, 50);     
        
        
        System.out.println("Fila Original");
        mani.imprime(f);
        
        
      
        for (int i = 0; i < vet.length ; i++){   // vet.length percorre todos os elementos diferentes de null
            vet[i] = mani.retirar(f);           // Vetor recebe valores da fila em ordem crescente
        }
        
        for (int i = vet.length - 1; i >= 0; i--){
             mani.inserir(f, vet[i]);           // fila rcebe valores do vetor em ornder decrescente
            
        }
        
//         System.out.println("\nLista Invertida");
//         mani.imprime(f);
         System.out.println(vet.length);
     }
    }

