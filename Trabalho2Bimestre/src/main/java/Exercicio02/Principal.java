/* Exercício 02.
   Desenvolva uma pilha inserindo os elementos de 1 a 8. Após remova o elemento de
   número 5. Ao final imprima a pilha em ordem inversa.
 */
package Exercicio02;

public class Principal {

    public static void main(String[] args) {

        Manipula mani = new Manipula();                                         //Cria objeto instanciado para manipular a pilha   
        Pilha a = mani.cria();                                                  // Cria pilha original
        Pilha b = mani.cria();                                                  // Pilha que recebe valores de a      
        int v[] = new int[7];
        int x = 0;

        for (int i = 0; i < 8; i++) {                                           // Alimenta a pilha co 8 itens
            mani.push(a, (i + 1));
        }

        System.out.println("Pilha original:");                                  // Imprime pilha original
        mani.imprimir(a);

        while (a.topo != null) {                                                // Enquanto houver valores na pilha
            x = (int) mani.pop(a);
            if (x != 5) {                                                       // Garante que fila b não recebera o número a ser retirado
                mani.push(b, x);
            }
        }

        System.out.println("\nPilha Alterada e invertida: ");                   // Imprime pilha alterada
        mani.imprimir(b);
    }
}
