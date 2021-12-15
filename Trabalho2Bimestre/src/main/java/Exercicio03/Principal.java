/*Exercício 03
  Utilizando os conceitos de fila, desenvolva um algoritmo em java que simule a
  distribuição de atendimento a um grupo de pessoas. O programa precisa obedecer 
  aos seguintes critérios de atendimento:
   Existe apenas um atendente;
   Uma pessoa com senha da fila normal deve ser atendida a cada 5 pessoas da fila prioritária;
   Não havendo pessoas na fila de prioridades, as pessoas da fila normal podem ser atendidas.
*/

package Exercicio03;

public class Principal {

    private static Fila pri;                                                    // Fila que recebera prioritários
    private static Fila normal;                                                 // Fila atendimento normal

    public static void main(String[] args) {
        
        pri = new Fila(50);                                                     // Fila Prioritária com 50 posições 
        normal = new Fila(50);                                                  // Fila Normal com 50 posições
        
        for (int i = 1; i <= 23; i++) {                                         // insere 23 itens na fila Prioritária
            pri.inserir(i);
        }
        
        for (int i = 1; i <= 10; i++) {                                         // insere 10 itens na fila Normal
            normal.inserir(i);
        }
       
        while (pri.itens > 5) {                                                 // Enquanto tiver mais de 5 na fila
                for (int i = 0; i < 5; i++) {                                   // Tira 5 da fila prioridade
                    pri.retirar();
                    System.out.println("Atendimento Prioritário.");
                }
                normal.retirar();                                               // A cada 5 tira um da fila normal
                System.out.println("Atendimento Normal");
            }  
       
        while (pri.itens > 0) {
            pri.retirar();
            System.out.println("Atendimento Prioritário.");
        }
       
        while (normal.itens > 0) {
            normal.retirar();
            System.out.println("Atendimento Normal");
        }
        
        System.out.println("Fila Prioritária: " + pri.itens + " Itens.");
        System.out.println("Fila Normal: " + normal.itens + " Itens.");
    }
}
