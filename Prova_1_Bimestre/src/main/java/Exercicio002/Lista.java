
package Exercicio002;


public class Lista {
    
    NoLista inicio; //Inicia o primeiro nó da lista

    public void inserirInicio(int valor) { // insere o nó no inicio da lista encadeada indepemdent se lista esta vazia ou não

        if (this.inicio == null) { //verifica se tem algum elemento na lista                   
            this.inicio = new NoLista(valor); // insere o valor ao primeiro nó da lista 

        } else {
            NoLista NovoNo = new NoLista(valor); //Cria um novo nó na lista
            NovoNo.proximo = this.inicio; // coloca o nó no inicio da lista e indica ao proximo nó
            this.inicio = NovoNo;
        }

    }

    public void inserirFim(int valor) {

        if (this.inicio == null) {
            this.inicio = new NoLista(valor); //verifica se tem algum elemento na lista            

        } else { // se a lista estiver iniciada insere o nó final         
            NoLista NoAtual = this.inicio;

            while (NoAtual.proximo != null) { // Se tiver algum nó nulo o enquato ira parar       
                NoAtual = NoAtual.proximo; // ultimo nó da lista é identificado

            }
            NoAtual.proximo = new NoLista(valor); // recebe o valor do ultimo no inserido na lista
        }

    }
    
     void criarNo (Lista a) {
        NoLista n;                                        //cria um novo nó
        for (n = a.inicio; n != null; n = n.proximo) {
            this.inserirInicio((int) n.info);
        }
    }
    
    
    public void imprimir() { // metodo responsavel por imprimir a lista encadeada
        for (NoLista i = this.inicio; i != null; i = i.proximo) { // passa por todos os nós da lista
            System.out.println(i.info); // imprime os valores de cada nó da lista quebrando uma linha

        }

    }
    
     Lista inverterLista(Lista l){
         
      Lista nova = new Lista(); // Cria uma nova lista   
       NoLista n; //Cria novo nó para lista nova
       
       for(n = l.inicio; n != null; n = n.proximo){
           
           nova.inserirInicio(n.info);
           
       }
       return nova;
     }
}
