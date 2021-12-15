
package com.mycompany.aula06;

public class Principal {
    
    public static void main(String[] args) {
        
       Lista l = new Lista();
       
       //Insere valores em sequencia na lista encadeada
       l.inserirInicio(5); 
       l.inserirInicio(4); 
       l.inserirInicio(3); 
       l.inserirInicio(2); 
       l.inserirInicio(1); 
       
     // l.imprimir(); //imprime a lista encadeada
        
       NoLista numero = l.busca(3); // Cria atributo estendido do NoLista e aciona o metodo busca passando um valor por parametro
      
       
       if(numero != null){         
           System.out.println("Encontrou a informação: " + numero.info);
           System.out.println();
       }
       
       l.imprimir();
    }
}
