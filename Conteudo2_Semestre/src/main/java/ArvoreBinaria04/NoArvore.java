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
public class NoArvore {
    
    private int info;
    private NoArvore esquerda;
    private NoArvore direita;
    
    public NoArvore(int novoValor) {
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

    public NoArvore getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(NoArvore esquerda) {
        this.esquerda = esquerda;
    }

    public NoArvore getDireita() {
        return direita;
    }

    public void setDireita(NoArvore direita) {
        this.direita = direita;
    }   
    
}
