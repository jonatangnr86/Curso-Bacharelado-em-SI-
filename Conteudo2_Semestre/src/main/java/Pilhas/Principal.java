package Pilhas;

public class Principal {

    public static void main(String[] args) {

        ManipulaPilha manipular = new ManipulaPilha();   //Cria objeto instanciado para manipular a pilha
        
        Pilha p = manipular.cria();                      // Chama o método para criação da pilha p

        manipular.push(p, 10);                           //Chama o método(push) insere valor a pilha
        manipular.push(p, 20);
        manipular.push(p, 30);
        manipular.push(p, 40);
        manipular.push(p, 50);
        
        System.out.println("\nPilha inicial");
        manipular.imprimir(p);
        
        manipular.pop(p);                                //chama metodo(pop) de remoção do último item inserido na pilha p.
        
        System.out.println("\nPilha modificada");
        manipular.imprimir(p);                           // Imprime lista alterada

        System.out.println("\nPiçha retirado da pilha");
        System.out.println(manipular.pop(p));            // Imprime item retirado da pilha

    }

}
