package Filas;

public class Manipular {

    int incr(int i) {                           // Metodo de autoinserir valor na fila se ela etiver cheia
        if (i == Fila.MAX - 1) {                // Se vaalor no fim da fila = valor no fim, fila esta cheia
            return 0;
        } else {
            return i + 1;
        }
    }

    boolean vazia(Fila f) {                    // Verifica se a fila esta vazia
        return (f.inicio == f.fim);            // Se inicio = fim lista esta vazia
    }

    void inserir(Fila f, int valor) {
        if (incr(f.fim) == f.inicio) {        // Verifica se a fila está chreia
            System.out.println("Capacidade da fila esgotada");
            System.exit(1);
        }
        f.vet[f.fim] = valor;                // Chama o vetor lista e insere valor fim da fila
        f.fim = incr(f.fim);                 // f.fim recebe final da fila
    }

    int retirar(Fila f) {                   // Realiza a retira do primeiro item incluso na fila
        int aux;                            // Varável auxiliar
        if (vazia(f)) {                     // Se fila vazia retorna mensagem
            System.out.println("A fila está vazia");
            System.exit(1);                 // Encerra o programa
        }

        aux = f.vet[f.inicio];              // Var auxiliar recebe valor do inicio
        f.inicio = incr(f.inicio);          // Inicio da fila recebe proxima posição
        return aux;
    }
    
    int QtdValores(Fila f) {
        int cont = 0;
        int x;

        for (x = f.inicio; x != f.fim; x = incr(x)) {
            cont++;
        }
        return cont;
    }

    void imprime(Fila f) {                  // Metodo de impressão da fila
        int i;
        for (i = f.inicio; i != f.fim; i = incr(i)) { // Percorre a lista para imprimir
            System.out.println(f.vet[i]);
        }
    }
}
