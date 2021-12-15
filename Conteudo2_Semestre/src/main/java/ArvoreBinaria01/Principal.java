package ArvoreBinaria01;

public class Principal {
    public static void main(String[] args) {
            
        Manipulador mani = new Manipulador();
         NoArvore b = null;

        b = mani.inserir(b, 10);
        b = mani.inserir(b, 8);
        b = mani.inserir(b, 5);
        b = mani.inserir(b, 9);
        b = mani.inserir(b, 20);
        b = mani.inserir(b, 15);
        b = mani.inserir(b, 3);
        b = mani.inserir(b, 6);
        b = mani.inserir(b, 30);
        b = mani.inserir(b, 28);
        b = mani.inserir(b, 25);
        
        System.out.println("Árvore Original");
        mani.imprimir(b);
        
        b = mani.inserir(b, 29);
        
        System.out.println("\n\nArvore com Nó 29.");
        mani.imprimir(b);
        
        mani.remover(b, 20);
        
        System.out.println("\n\nÁrvore sem o nó 20,");
        mani.imprimir(b);
        
        System.out.println("\n\nÁrvore Em Ordem:");
        mani.EmOrdem(b);
        
        System.out.println("\n\nÁrvore em Pré Ordem:");
        mani.PreOrdem(b);
        
        System.out.println("\n\nÁrvore em Pós Ordem:");
        mani.PosOrdem(b);
                
    }    
}
