//Inverter Lista
package newpackage.exercicio002;

public class Principal01 {
    public static void main(String[] args) {
        
          
       Lista01 l1 = new Lista01();
       
       //Insere valores em sequencia na lista encadeada
       
       System.out.println("Lista atual: ");
       
       l1.inserirInicio(5); 
       l1.inserirInicio(4); 
       l1.inserirInicio(3); 
       l1.inserirInicio(2); 
       l1.inserirInicio(1); 
       l1.imprimir();// imprime lista original
       
       Lista01 l2 = new Lista01();
       
       
       
        System.out.println("Lista invertida: ");
       
       l2 = l2.inverterLista(l1);
               
       l2.imprimir();
    }
}
