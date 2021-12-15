package Recursividade03;

public class Fatorial {

    public static int fatorial(int valor1, int valor2) { // Cria método fatorial

        if (valor1 == 0 && valor2 == 0) { // Ponto de parada
            return 0;
        }
        return (valor1 + valor2); // Formula caso geral da recursividade

    }
}
