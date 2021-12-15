/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaEncadeada;

/**
 *
 * @author jonat
 */
public class Principal {
     public static void main(String[] args) {
        Lista a = new Lista();
        Lista b = new Lista();
        Lista c = new Lista();
        
        a.inserirInicio(0);
        a.inserirInicio(1);
        a.inserirInicio(2);
        a.inserirInicio(3);
        a.inserirInicio(4);
        a.inserirInicio(5);
        b.inserirInicio(1);
        b.inserirInicio(2);
        b.inserirInicio(3);
        b.inserirInicio(4);
        System.out.println("\n Lista a: \n");
        a.imprimir();
        System.out.println("\n Lista b: \n");
        b.imprimir();
       
        c.concat(a);
        c.concat(b);
        c.imprimir();
        
    }
    
}
