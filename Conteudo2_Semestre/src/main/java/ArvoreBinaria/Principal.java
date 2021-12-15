package ArvoreBinaria;

public class Principal {

    public static void main(String[] args) {

        Manipulador manipular = new Manipulador(); // Objeto instanciado a classe Manipulador
        NoArvore a = null;

        a = manipular.inserir(a, 4);
        a = manipular.inserir(a, 2);
        a = manipular.inserir(a, 6);
        a = manipular.inserir(a, 3);
        a = manipular.inserir(a, 1);
        a = manipular.inserir(a, 5);
        a = manipular.inserir(a, 7);

//        System.out.println("\nÁrvore original:");
//        manipular.imprimir(a);
//        
//        manipular.remover(a, 5);
//        
//        System.out.println("\n\nÁrvore Manipulada");
//        manipular.imprimir(a);

        System.out.println("\nEm-Ordem");
        manipular.PosOrdem(a);
        
        System.out.println("\nPré Ordem");
        manipular.PreOrdem(a);

    }

}
