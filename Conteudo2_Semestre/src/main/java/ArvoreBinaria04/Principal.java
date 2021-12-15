/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArvoreBinaria04;

/**
 *
 * @author jonat
 */
public class Principal {
    public static void main(String[] args) {

        ManipuladorArvore manipula = new ManipuladorArvore();

        manipula.adicionar(10);
        manipula.adicionar(15);
        manipula.adicionar(8);
        manipula.adicionar(6);
        manipula.adicionar(3);
        manipula.adicionar(4);
        manipula.adicionar(2);
        manipula.adicionar(1);
        manipula.adicionar(30);
        manipula.adicionar(35);
        manipula.adicionar(28);
        manipula.adicionar(25);
        manipula.adicionar(23);
        manipula.adicionar(24);

        System.out.println("Árvore Binária em Ordem:");
        manipula.emOrdem(manipula.getRaiz());

        manipula.remover(30);

        System.out.println("\n \n Árvore Binária em Ordem:");
        manipula.emOrdem(
                manipula.getRaiz());

    }

}
