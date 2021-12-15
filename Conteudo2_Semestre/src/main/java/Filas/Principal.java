package Filas;

public class Principal {

    public static void main(String[] args) {
        
        Manipular mani = new Manipular(); // Cria objeto instanciado a classa Manipular

        Fila f = new Fila(); //Cria a fila
        
        mani.inserir(f, 10);
        mani.inserir(f, 20);
        mani.inserir(f, 30);
        mani.inserir(f, 40);     
        
        
        System.out.println("Fila Original");
        mani.imprime(f);
      
        
        mani.retirar(f);
        mani.retirar(f);
        mani.retirar(f);
        mani.retirar(f);
        mani.retirar(f);
        
        System.out.println("Fila modificada");
        mani.imprime(f);
                
    }
}
