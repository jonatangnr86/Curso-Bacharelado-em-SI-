package ArvoreBinaria02;

public class Principal {
    
    public static void main(String[] args) {
        
        Manipulador mani = new Manipulador();
        
        mani.inserir(25);
        mani.inserir(20);
        mani.inserir(14);
        mani.inserir(30);
        mani.inserir(15);
        mani.inserir(16);
        mani.inserir(6);
        mani.inserir(7);
       
        
        System.out.println("Árvore Original:");
        mani.imprimir(mani.getRaiz());
        
        
        System.out.println("\n\nArvore em ordem");
        mani.emOrdem(mani.getRaiz());
        
        mani.remover(30);
        
         System.out.println("\n\nArvore em ordem sem o 8");
         mani.emOrdem(mani.getRaiz());

//        System.out.println("\n\nArvore em pós ordem");
//        mani.posOrdem(mani.getRaiz());
//
//        System.out.println("\n\nArvore pré ordem");
//        mani.preOrdem(mani.getRaiz());


    }
    
}
