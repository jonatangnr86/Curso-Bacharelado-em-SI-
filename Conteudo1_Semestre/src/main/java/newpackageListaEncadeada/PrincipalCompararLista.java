package newpackageListaEncadeada;

public class PrincipalCompararLista {

    public static void main(String[] args) {

        Lista l1 = new Lista();
        Lista l2 = new Lista();
        Lista l3 = new Lista();

        //Carrega lista 1
        l1.inserir(1);
        l1.inserir(2);
        l1.inserir(8);
        l1.inserir(4);
        l1.inserir(5);

        System.out.println("Primeira lista: ");
        l1.imprimir();

        //Carrega a lista 2
        l2.inserir(1);
        l2.inserir(2);
        l2.inserir(3);
        l2.inserir(4);
        l2.inserir(5);

        System.out.println("Segunda lista: ");
        l2.imprimir();

        if (l3.iguais(l1, l2) == true) {
            System.out.println("As listas são iguais");
        } else {
            System.out.println("As listas são diferentes");
        }
        System.exit(0);
    }

}
