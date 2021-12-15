package ArvoreBinaria02;

public class Manipulador {

    private NoArvore raiz;                                                      // Cria atributo Raiz

    public Manipulador() {                                                      // Construtor que inicializa o atributo Raiz
        this.raiz = null;
    }

    public NoArvore getRaiz() {                                                 // Necessário para retornar o valor da raiz da classe principal
        return raiz;
    }

    public void inserir(int valor) {                                            // Método para inserir valores na árvore
        NoArvore novoNo = new NoArvore(valor);                                  // Cria objeto instânciado a NoArvore recebendo o valor
        if (raiz == null) {                                                     // Verifica se a raiz é nula 
            this.raiz = novoNo;                                                 // Caso nula Raiz recebe valor de novo nó
            System.out.println(novoNo.getInfo() + " inserido na Raiz\n\n");
        } else {
            NoArvore noAtual = this.raiz;
            while (true) {                                                      // Enquanto tiver nó a inserir vai executar
                if (novoNo.getInfo() < noAtual.getInfo()) {                     // Se novo nó < no atual
                    if (noAtual.getEsquerda() != null) {                        // Se tiver no a esquerda 
                        noAtual = noAtual.getEsquerda();                        // Nó e esqueda passa a ser o noAtual
                    } else {
                        noAtual.setEsquerda(novoNo);                            // Caso for menor é setado a esquerda
                        System.out.println(novoNo.getInfo() + " Inserido a esquerda de " + noAtual.getInfo());
                        break;
                    }
                } else {
                    if (noAtual.getDireita() != null) {                         // Se tiver no a Direita
                        noAtual = noAtual.getDireita();                         // Nó a direita passa a ser o noAtual
                    } else {
                        noAtual.setDireita(novoNo);                             // Caso for maior é setado a direita               
                        System.out.println(novoNo.getInfo() + " Inserido a direita de " + noAtual.getInfo());
                        break;
                    }
                }
            }
        }
    }

    public boolean remover(int valor) {
        NoArvore atual = this.raiz;                                             // Atual inicia sempre pelo valor da raiz
        NoArvore paiAtual = null;                                               // Como raiz é a base, ela não tem pai, logo é nula
        while (atual != null) {                                                 // enquanto atual for != null ira percorrer a árvore
            if (atual.getInfo() == valor) {                                     // Verifica se atual(raiz) é igual a valor a ser retirado
                break;                                                          // Arvore só tem a raiz
            } else if (valor < atual.getInfo()) {                               // Se valor < raiz vai para esquerda
                paiAtual = atual;
                atual = atual.getEsquerda();
            } else {
                paiAtual = atual;
                atual = atual.getDireita();                                     // Se for > que raiz vai para direita
            }
        }                                                                       // // Encontrou o nó a ser removido(Atual)

        System.out.println("\n\nPai Atual: " + paiAtual.getInfo());
        System.out.println("Atual: " + atual.getInfo());
        System.out.println("Valor a ser removido: " + atual.getInfo());

        if (atual != null) {                                                    // Verifica se valor atual partindo da raiz é != null
            if (atual.getEsquerda() != null) {                                  // Verifica se tem filho a Esquerda
                NoArvore sub = atual.getEsquerda();                             // Variável Substituto recebe valor a esquerda do nó a ser retirado
                NoArvore paiSub = atual;                                        // Pai substituto Recebe valor do atual              

                // Percorre a Árvore(Direita, Tudo a esquerda.
                while (sub.getDireita() != null) {                              // Percorre Enquanto tiver nó a esquerda 
                    paiSub = sub;
                    sub = sub.getDireita();
                }                                                               // Chegou ao fim da árvore
                //sub.setDireita(atual.getDireita());
                // Faz a troca do nó encontrado pelo nó a ser retirado
                if (paiAtual != null) {
                    if (atual.getInfo() < paiAtual.getInfo()) {                 // Se valor atual(a ser retirado) < que o pai
                        paiAtual.setEsquerda(sub);                              // Insere valor encontrado a esquerda do pai do no a ser retirado
                    } else {
                        paiAtual.setDireita(sub);                               // Insere valor encontrado a direita do pai do nó a ser retirado
                    }
                }
                //Remove o nó encontrado da árvore(Seta null)
                if (sub.getInfo() < paiAtual.getInfo()) {                       // Se o valor encontrado for < pai do valor a ser retirado
                    paiSub.setEsquerda(null);                                   // Seta valor null ao nó esquerda que substituiu o valor a ser tirado
                } else {                                                        // Se for maior
                    paiSub.setDireita(null);                                    // Sete valor null ao nó direita que substituiu o valor a ser tirado
                }

            } else if (atual.getDireita() != null) {                            // Verifica se tem filho a esquerda
                NoArvore sub = atual.getDireita();                              // Substituto
                NoArvore paiSub = atual;

                // Percorre a Árvore(Direita, Tudo a esquerda
                while (sub.getEsquerda() != null) {                             // percorre Enquanto tiver nó a esquerda 
                    paiSub = sub;
                    sub = sub.getEsquerda();
                }                                                               // Encontrou ultimo valor da árvore
                //sub.setEsquerda(atual.getEsquerda());
                // Faz a troca do nó encontrado pelo nó a ser retirado
                if (paiAtual != null) {
                    if (atual.getInfo() < paiAtual.getInfo()) {                 // Se o valor a ser retirado < pai dele 
                        paiAtual.setEsquerda(sub);                              // Seta valor encontrado ao nó da esquerda do pai do nó a ser tirado
                    } else {                                                    // Se for > 
                        paiAtual.setDireita(sub);                               // Seta valor encontrado ao da direita do pai do nó a ser tirado
                    }
                }
                //Remove o nó que substituiu o nó retirado(Seta null)
                if (sub.getInfo() < paiAtual.getInfo()) {                   
                    paiSub.setEsquerda(null);
                } else {
                    paiSub.setDireita(null);
                }

            } else { 
                // Se o nó a ser retira não tem filhos
                if (paiAtual != null) {
                    if (atual.getInfo() < paiAtual.getInfo()) {                 // Se valor a ser retirado < que o pai dele
                        paiAtual.setEsquerda(null);                             // Seta valor null a esquerda pai
                    } else {                                                    // Se valor a ser retirado > que o pai
                        paiAtual.setDireita(null);                              // Seta valor null a direita do pai
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }

    void imprimir(NoArvore atual) {                                             // Método imprimir a árvore  
        if (atual != null) {
            imprimir(atual.getEsquerda());
            System.out.print(atual.getInfo() + " ");

            imprimir(atual.getDireita());
            System.out.print(atual.getInfo() + " ");
        }
    }

    public void emOrdem(NoArvore atual) {                                       // Imprime arvore em ordem(Esquerda - Raiz - Direita)
        if (atual != null) {
            emOrdem(atual.getEsquerda());
            System.out.print(atual.getInfo() + " ");
            emOrdem(atual.getDireita());
        }

    }

    public void preOrdem(NoArvore atual) {                                      // Imprime arvore em pré ordem(Raiz - Esquerda - Direita)
        if (atual != null) {
            System.out.print(atual.getInfo() + " ");
            preOrdem(atual.getEsquerda());
            preOrdem(atual.getDireita());
        }
    }

    public void posOrdem(NoArvore atual) {                                      // Imprime árvore em pós ordem(Esquerda - Direita - Raiz)
        if (atual != null) {
            preOrdem(atual.getEsquerda());
            preOrdem(atual.getDireita());
            System.out.print(atual.getInfo() + " ");
        }
    }
}
