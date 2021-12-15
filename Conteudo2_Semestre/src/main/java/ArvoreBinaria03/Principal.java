package ArvoreBinaria03;

public class Principal {

    public static void main(String[] args) {
        Manipulador mani = new Manipulador();

        mani.inserir(10);
        mani.inserir(8);
        mani.inserir(6);
        mani.inserir(3);
        mani.inserir(4);
        mani.inserir(2);
        mani.inserir(1);
        mani.inserir(30);
        mani.inserir(35);
        mani.inserir(28);
        mani.inserir(25);
        mani.inserir(23);
        mani.inserir(24);

        System.out.println("Árvore  em Ordem: ");
        mani.emOrdem(mani.getRaiz());

        System.out.println("\n\nÁrvore em Pré Ordem: ");
        mani.preOrdem(mani.getRaiz());

        System.out.println("\n\nÁrvore em Pós Ordem: ");
        mani.posOrdem(mani.getRaiz());

        mani.remover(25);

        System.out.println("\nÁrvore Alterada em Ordem: ");
        mani.emOrdem(mani.getRaiz());

        System.out.println("\n\nÁrvore Alterada em Pré Ordem: ");
        mani.preOrdem(mani.getRaiz());

        System.out.println("\n\nÁrvore Alterada em Pós Ordem: ");
        mani.posOrdem(mani.getRaiz());

    }

}
