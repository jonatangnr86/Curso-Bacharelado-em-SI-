
package newpackage.exercicio002;

public class Lista01 {
    
     NoLista01 inicio; //Inicia o primeiro nó da lista

    public void inserirInicio(float valor) { // insere o nó no inicio da lista encadeada indepemdent se lista esta vazia ou não

        if (this.inicio == null) { //verifica se tem algum elemento na lista                   
            this.inicio = new NoLista01(valor); // insere o valor ao primeiro nó da lista 

        } else {
            NoLista01 NovoNo = new NoLista01(valor); //Cria um novo nó na lista
            NovoNo.proximo = this.inicio; // coloca o nó no inicio da lista e indica ao proximo nó
            this.inicio = NovoNo;
        }

    }

    public void inserirFim(float valor) {

        if (this.inicio == null) {
            this.inicio = new NoLista01(valor); //verifica se tem algum elemento na lista            

        } else { // se a lista estiver iniciada insere o nó final         
            NoLista01 NoAtual = this.inicio;

            while (NoAtual.proximo != null) { // Se tiver algum nó nulo o enquato ira parar       
                NoAtual = NoAtual.proximo; // ultimo nó da lista é identificado

            }
            NoAtual.proximo = new NoLista01(valor); // recebe o valor do ultimo no inserido na lista
        }

    }
    
    public void imprimir() { // metodo responsavel por imprimir a lista encadeada
        for (NoLista01 i = this.inicio; i != null; i = i.proximo) { // passa por todos os nós da lista
            System.out.println(i.info); // imprime os valores de cada nó da lista quebrando uma linha

        }

    }
     Lista01 inverterLista(Lista01 l){
         
      Lista01 nova = new Lista01(); // Cria uma nova lista   
       NoLista01 n; //Cria novo nó para lista nova
       
       for(n = l.inicio; n != null; n = n.proximo){
           
           nova.inserirInicio(n.info);
           
       }
       return nova;
     }
    
    
    
    
}
