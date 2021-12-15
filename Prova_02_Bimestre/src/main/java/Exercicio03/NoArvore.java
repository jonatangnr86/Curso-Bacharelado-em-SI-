
package Exercicio03;

public class NoArvore {
     private int info;                                                           // Atributo que armazena o valor do nó
    private NoArvore direita;                                                   // Atributo Determina o lado a percorrer(direita)
    private NoArvore esquerda;                                                  // Atributo Determina o lado a percorrer(Esquerda)vvv

    public NoArvore(int novoValor) {                                            // Construtor: " Inicia os atributos com valores"
        this.info = novoValor;
        this.esquerda = null;
        this.direita = null;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(int info) {
        this.info = info;
    }

    public NoArvore getDireita() {
        return direita;
    }

    public void setDireita(NoArvore direita) {
        this.direita = direita;
    }

    public NoArvore getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(NoArvore esquerda) {
        this.esquerda = esquerda;
    }
}
