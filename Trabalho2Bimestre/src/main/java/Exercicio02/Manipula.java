package Exercicio02;
public class Manipula {
      Pilha cria() {                                                             //metodo responsável por criar a pilha
        Pilha p = new Pilha();
        p.topo = null;
        return p;
    }

    void push(Pilha p, int valor) {                                            // Metodo responsável por inserir item na pilha
        No aux = new No();                                                      // Variável auxiliar instanciada a classe Nó

        aux.info = valor;                                                       // Variável auxiliar recebe informação(valor)
        aux.anterior = p.topo;                                                  // Nó anterior recebe topo da lista
        p.topo = aux;                                                           //Topo da pilha recebe o valor
    }

    boolean vazia(Pilha p) {                                                   // Metodo para verificar se a lista está vazia
        return (p.topo == null);                                                // Se o topo = vazio(null) a pilha está vazia
    }

    void imprimir(Pilha p) {                                                   //Método responsável por imprimir a lista

        for (No n = p.topo; n != null; n = n.anterior) {
            System.out.println(n.info);
        }
    }

    float pop(Pilha p) {                                                      // Método vretirar item da pilha(retira do topo)

        float v;                                                                // Variável que receberá valor retirado da pilha
        No aux;                                                                 // Variável auxiliar 

        if(vazia(p)) {                                                         // Chama metodo para verificar se a pilha está vazia
            System.out.println("Pilha vazia.");
            System.exit(1);                                                     // Se pilha vazia encerra programa
        }

        v = p.topo.info;                                                        // Variável v recebe informação(valor) do topo que sera retirado da pilha
        aux = p.topo;                                                           // Variável auxiliar recebe topo
        p.topo = aux.anterior;                                                  // Topo da lista passa ser o item anterior
        return v;                                                               // Retorna o item retirado da lista

    }
}
