
package newpackage.exerccio03;

public class Lista {
   
    
    NoLista inicio; //Inicia o primeiro nó da lista

    public void inserirNo(float valor) {

        if (this.inicio == null) {

            this.inicio = new NoLista(valor);

        } else {
            NoLista NoAtual = this.inicio; // cria un novo nó do inicio da lista

            while (NoAtual.proximo != null) { //condição para achar o ultimo nó da lista
                NoAtual = NoAtual.proximo; // insere o nó ao final da lista
            }
            NoAtual.proximo = new NoLista(valor); // insere o valor no nó atual
        }
    }    
    public void imprimir() { // metodo responsavel por imprimir a lista encadeada
        for (NoLista i = this.inicio; i != null; i = i.proximo) { // passa por todos os nós da lista
            System.out.println(i.info); // imprime os valores de cada nó da lista quebrando uma linha
        }
    }
    
    
    

}
