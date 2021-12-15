package com.mycompany.aula06;

public class Lista {

    NoLista inicio; //iniciar o primeiro da lista

    public void inserirInicio(float valor) { //insere o nó no inicio da lista encadeada independente se a lista está vazia ou não

        if (this.inicio == null) { // verifica se tem algum elemento (nó) na lista
            this.inicio = new NoLista(valor); //insere o valor ao primeiro nó da lista
        } else {
            NoLista NovoNo = new NoLista(valor); // cria um novo nó na lista
            NovoNo.proximo = this.inicio; //coloca o nó no inicio da lsita e indica ao próximo nó
            this.inicio = NovoNo;
        }
    }

    public void inserirFim(float valor) {

        if (this.inicio == null) {
            this.inicio = new NoLista(valor);
        } else { //se a lista estiver inicializada insere o nó no final
            NoLista NoAtual = this.inicio;
            while (NoAtual.proximo != null) { //se tiver algum nó nulo o enquanto irá parar
                NoAtual = NoAtual.proximo; //ultimo nó da lista é indentificado 
            }

            NoAtual.proximo = new NoLista(valor); //recebe o valor no último nó inserido na lista

        }

    }
    
    NoLista busca (float valor){ //método responsável por realizar busca de valor na lista encadeada
        
        for(NoLista i = this.inicio; i != null; i = i.proximo){ //laço de repetição responsável por passar por todos os nós da lista
            if(i.info == valor){ //verifica se a informação do nó é igual ao valor passado por paramêtro
                return i; //se a condição for verdadeira retorna a informação do nó
            }
        
        }
        
        return null; //caso a condição if for falsa retornaremos null para a função
    
    }
    
    
    
    

    public void imprimir() { //método responsável por imprimir a lista encadeada 

        for (NoLista i = this.inicio; i != null; i = i.proximo) { // laço de repetição responsável por passar por todos os nós da lista
            System.out.println(i.info); //imprime os valor de cada nó da lista quebrando uma linha

        }

    }

    }