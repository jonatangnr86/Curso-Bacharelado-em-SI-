/* Exercício 04
 Desenvolva um programa com base em árvores binárias que armazene os seguintes 
  valores: 50, 40, 30, 45, 36, 42, 60, 55, 48, 58, 53. Após faça o que se pede:
   Desenha a árvore em forma de “grafo” (pode ser feito no paint);
   Imprima o algoritmo em ordem, pré-ordem e pós-ordem;
   Imprima a árvore;
   Remova o nó de valor 40;
   Imprima a árvore novamente.
*/

package Exercicio04;

public class Principal {

    public static void main(String[] args) {

        Manipulador mani = new Manipulador();

        mani.inserir(50);
        mani.inserir(40);
        mani.inserir(30);
        mani.inserir(45);
        mani.inserir(36);
        mani.inserir(42);
        mani.inserir(60);
        mani.inserir(55);
        mani.inserir(48);
        mani.inserir(58);
        mani.inserir(53);
        
        System.out.println("Árvore  em Ordem: ");
        mani.emOrdem(mani.getRaiz());

        System.out.println("\n\nÁrvore em Pré Ordem: ");
        mani.preOrdem(mani.getRaiz());

        System.out.println("\n\nÁrvore em Pós Ordem: ");
        mani.posOrdem(mani.getRaiz());
        
        System.out.println("\n\nÁrvore Original:");
        mani.imprimir(mani.getRaiz());

        mani.remover(40);                                                       // Remove item da arvore
        
        System.out.println("\n\nArvore alterada:");
        mani.imprimir(mani.getRaiz());

        System.out.println("\n\nÁrvore Alterada em Ordem: ");
        mani.emOrdem(mani.getRaiz());

        System.out.println("\n\nÁrvore Alterada em Pré Ordem: ");
        mani.preOrdem(mani.getRaiz());

        System.out.println("\n\nÁrvore Alterada em Pós Ordem: ");
        mani.posOrdem(mani.getRaiz());

    }

}
