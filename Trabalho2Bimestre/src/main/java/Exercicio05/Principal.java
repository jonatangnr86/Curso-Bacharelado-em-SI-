/*
  Desenvolva um programa com base em árvores binárias que armazene os seguintes 
  valores: 10, 15, 8, 6, 3, 4, 2, 1, 30, 35, 28, 25, 23 ,24. Após faça o que que se pede:
   Desenha a árvore em forma de “grafo” (pode ser feito no paint);
   Imprima o algoritmo em ordem, pré-ordem e pós ordem;
   Remova o nó de valor 35;
   Imprima a árvore.
   Imprima novamente a árvore em ordem, pré-ordem e pós ordem.
*/

package Exercicio05;

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
        
        System.out.println("\n\nÁrvore  em Ordem: ");
        mani.emOrdem(mani.getRaiz());
        
        System.out.println("\n\nÁrvore em Pré Ordem: ");
        mani.preOrdem(mani.getRaiz());
        
        System.out.println("\n\nÁrvore em Pós Ordem: ");
        mani.posOrdem(mani.getRaiz());
        
        mani.remover(35);
        
        System.out.println("\n\nÁrvore Alterada em Ordem: ");
        mani.emOrdem(mani.getRaiz());
        
        System.out.println("\n\nÁrvore Alterada em Pré Ordem: ");
        mani.preOrdem(mani.getRaiz());
        
        System.out.println("\n\nÁrvore Alterada em Pós Ordem: ");
        mani.posOrdem(mani.getRaiz());

    }
}
