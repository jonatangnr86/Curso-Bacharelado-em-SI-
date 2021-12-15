package ExercicioFila002ParOuImpar;

public class Fila {

    public int[] dados;
    public int inicio;
    public int fim;
    public int itens;
 
    public Fila(int MAX) {                                                      // Cronstrutor mesmo nome da clase para iniciar os atributos
        dados = new int[MAX];                                                   // tamanho da fila
        inicio = 0;
        fim = -1;
        itens = 0;
    }

    public boolean vazia() {
        return (itens == 0);
    }

    public boolean cheia() {
        return (itens == dados.length);                                         // vai contar a quantidade de itens na fila
    }

    public void inserir(int valor) {                                            // insere valor ao final da fila
        dados[++fim] = valor;
        itens++;
    }

    public int retirar() {
        if (vazia()) {
            System.out.println("Fila vazia");
            System.exit(1);
        }
        int aux = dados[inicio];
        
        if (inicio == dados.length) {
            inicio = 0;
        }
        itens--;
        return aux;
    }
           
    public void imprimir(){                                                     // Imprime a fila
        for(int i = 0; i < itens; i++){
            System.out.println(dados[i]);        
        }    
    }
    // get retorna dados
    //Set  Manipulavel
    
    public int getDados(int i) {                    
        return dados[i];
    }

    public void setDados(int[] dados) {                                         //retorna os dados da fila
        this.dados = dados;
    }

    public int getItens() {                                                     // retorna quantidade de itens na fila
        return itens;
    }

    public void setItens(int itens) {
        this.itens = itens;
    }

}
