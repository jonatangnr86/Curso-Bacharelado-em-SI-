package Teste;

import javax.swing.JOptionPane;

public class Funcoes {

    void verQtdAmigos(String a) {

        if (a == null || "".equals(a) || "0".equals(a)) {    // se entrada null ou nada encerrra programa
            JOptionPane.showMessageDialog(null, "Obrigado");    //Recebe qtd de amigos
            System.exit(0);
        }
    }
    
    void matriz(int num){
        
        String st1 = "Nomes e Sobrenomes";
         String[][] nomes = new String[num][2];              // Cria matriz [num][2]

        // Estrutura de repetição que alimenta a matriz
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < 2; j++) {

                if (j == 0) {                               // Se j=0 pergunta o nome
                    do {                                    // Enquanto nome for nulo ou < 3 ou > 50 caracteres
                        nomes[i][j] = JOptionPane.showInputDialog(null, "Informe o Primeiro nome do amigo N° " + (i + 1));
                        if (nomes[i][j] == null || "".equals(nomes[i][j]) || nomes[i][j].length() < 3 || nomes[i][j].length() > 50) {
                            JOptionPane.showMessageDialog(null, "Nome Inválido!");
                        }
                    } while (nomes[i][j] == null || "".equals(nomes[i][j]) || nomes[i][j].length() < 3 || nomes[i][j].length() > 50); // Enquanto for nulo ou nada fica em loop

                    st1 = st1 + "\n " + (i + 1) + "- " + nomes[i][j];  // st1 Recebe nome informado
                } else {                                  // Se j=1 pergunta o  sobrenome
                    do {                                  //Enquanto sobrenome nulo ou < 3 ou > caracteres
                        nomes[i][j] = JOptionPane.showInputDialog(null, "Informe o sobrenome do N° " + (i + 1));
                        if (nomes[i][j] == null || "".equals(nomes[i][j]) || nomes[i][j].length() < 3 || nomes[i][j].length() > 50) {
                            JOptionPane.showMessageDialog(null, "Sobrenome Inválido!");
                        }
                    } while (nomes[i][j] == null || "".equals(nomes[i][j]) || nomes[i][j].length() < 3 || nomes[i][j].length() > 50);

                    st1 = st1 + " " + nomes[i][j];       // st1 recebe sobrenome informado
                }
            }
        }
        JOptionPane.showMessageDialog(null, st1, "Lista Nome e Sobrenomes", 3);
    }
}
