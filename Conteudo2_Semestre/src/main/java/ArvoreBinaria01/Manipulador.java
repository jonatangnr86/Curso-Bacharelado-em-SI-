
package ArvoreBinaria01;

public class Manipulador {

    NoArvore inserir(NoArvore a, int valor) {                                   // Método de inserir valor 
        if (a == null) {                                                        // Verifica se o nó é nullo
            a = new NoArvore();                                                 // Se o nó é nulo sera o primeiro nó (RAIZ). Objeto a instanciado a classe NoArvoreç
            a.info = valor;                                                     // Seta o valor no nó Raiz   
        } else if (valor < a.info) {                                            // Caso o nó  exista verifica se o valor a ser inserido é menor ou maior
            a.esquerda = inserir(a.esquerda, valor);                            // Se o valor < que o nó insere o valor a esqueda 
            System.out.println("Inserindo " + valor + " a esquerda de " + a.info);
        } else {
            a.direita = inserir(a.direita, valor);                              //  Se o valor < que o nó insere o valor a direita
            System.out.println("Inserindo " + valor + " a direita de " + a.info);
        }
        return a;                                                               // Retorna o nó da arvore
    }

    NoArvore remover(NoArvore r, int valor) {                                   // Método de remoção
        if (r == null) {
            System.out.println("Árvore VAzia.");                                // Se = null retorna árvore vazia
            return null;         
        } else if (r.info > valor) {                                            // Senão se valor > que a raiz vai para esquerda
            r.esquerda = remover(r.esquerda, valor);
        } else if (r.info < valor) {                                            // Senão se valor menor que a raiz vai para direita
            r.direita = remover(r.direita, valor);
        } else {                                                                // Achou o nó a remover
            if (r.esquerda == null && r.direita == null) {                      // Nó sem filho
                return null;
            } else if (r.esquerda == null) {                                    // Nó só tem filho a direita
                NoArvore t = r;
                r = r.direita;
            } else if (r.direita == null) {                                     // Nó só tem filho a esquerda
                NoArvore t = r;
                r = r.esquerda;
            } else {                                                            // Nó com dois filhos
                NoArvore f = r.esquerda;
                while (f.direita != null) {                                     // Enquanto nó a direita diferente de null 
                    f = f.direita;                                              // f recebe valor do Nó mais a direita
                }                                                               // Troca as informações
                r.info = f.info;                                                // Nó raiz recebe valor do Nó mais a direita
                f.info = valor;                                                 // f.info recebe valor a ser retirado
                r.esquerda = remover(r.esquerda, valor);                        // 
            }
        }
        return r;
    }

    void imprimir(NoArvore a) {                                                 // Método imprimir a árvore  
        if (a != null) {
            imprimir(a.esquerda);
            System.out.print(a.info + " ");

            imprimir(a.direita);
            System.out.print(a.info + " ");
        }
    }

    public void EmOrdem(NoArvore atual) {                   // Métofo imprimir Em ordem - Esqueda - Raiz - Direita      
        if (atual != null) {
            EmOrdem(atual.esquerda);
            System.out.print(atual.info + " ");
            EmOrdem(atual.direita);
        }
    }

    public void PreOrdem(NoArvore atual) {                   // Métofo imprimir em Pré Ordem - Raiz - Esquerda - Direita       
        if (atual != null) {
            System.out.print(atual.info + " ");
            PreOrdem(atual.esquerda);
            PreOrdem(atual.direita);
        }
    }

    public void PosOrdem(NoArvore atual) {                  // Métofo imprimir em Pós Ordem - Esquerda - Direita - Raiz      
        if (atual != null) {
            PosOrdem(atual.esquerda);
            PosOrdem(atual.direita);
            System.out.print(atual.info + " ");
        }
    }
}
