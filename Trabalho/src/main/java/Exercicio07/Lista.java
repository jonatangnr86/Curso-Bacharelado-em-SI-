package Exercicio07;

public class Lista {

    NoLista inicio;                                      //responsável por iniciar o primeiro nó da lista

    public void inserirInicio(int valor) {              //insere o nó no inicio da lista encadeada

        if (this.inicio == null) {                       //verifica se tem algum elemento (nó) na lista
            this.inicio = new NoLista(valor);            //insere valor ao primeiro nó da Lista
        } else {
            NoLista NovoNo = new NoLista(valor);         // cria um novo nó na lista
            NovoNo.proximo = this.inicio;                //coloca o nó no início da lista e indica ao próximo nó
            this.inicio = NovoNo;
        }
    }
    public void inserirFim(float valor) {

        if (this.inicio == null) {
            this.inicio = new NoLista(valor);
        } else {                                         //se a lista estiver inicializada insere o nó no final
            NoLista NoAtual = this.inicio;
            while (NoAtual.proximo != null) {            //se tiver algum nó nulo o enquanto irá parar
                NoAtual = NoAtual.proximo;               //nó da lista é identificado
            }
            NoAtual.proximo = new NoLista(valor);         //recebe o valor do último nó inserido na Lista
        }
    }

    public void criarNo(Lista a) {
        NoLista n;                                        //cria um novo nó
        for (n = a.inicio; n != null; n = n.proximo) {
            this.inserirInicio((int) n.info);
        }
    }

    public void imprimir() {                             //método responsavel por imprimir a lista encadeada
        for (NoLista i = this.inicio; i != null; i = i.proximo) {
            System.out.println(i.info);
        }
    }
}
