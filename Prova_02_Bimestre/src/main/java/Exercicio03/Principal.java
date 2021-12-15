package Exercicio03;

public class Principal {
    public static void main(String[] args) {
         Manipulador mani = new Manipulador();

        mani.inserir(21);
        mani.inserir(13);
        mani.inserir(15);
        mani.inserir(10);
        mani.inserir(12);
        mani.inserir(25);
        mani.inserir(35);
        mani.inserir(30);
        mani.inserir(29);
        
        System.out.println("\nÁrvore  em Ordem: ");
        mani.emOrdem(mani.getRaiz());

        System.out.println("\n\nÁrvore em Pré Ordem: ");
        mani.preOrdem(mani.getRaiz());

        System.out.println("\n\nÁrvore em Pós Ordem: ");
        mani.posOrdem(mani.getRaiz());
        

        mani.remover(10);                                                       // Remove item da arvore
        mani.remover(35);                                                       // Remove item da arvore
        
       

        System.out.println("\n\nÁrvore Alterada em Ordem: ");
        mani.emOrdem(mani.getRaiz());

        System.out.println("\n\nÁrvore Alterada em Pré Ordem: ");
        mani.preOrdem(mani.getRaiz());

        System.out.println("\n\nÁrvore Alterada em Pós Ordem: ");
        mani.posOrdem(mani.getRaiz());

    }
        
        
        
        
    
    
}
