
package Teste;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {

        Funcoes chamaF = new Funcoes();

        int num = 0;

        String st = JOptionPane.showInputDialog(null, "Digite o número de Amigos ou 0 para sair: ", "Quantidade de amigos", 3);

        chamaF.verQtdAmigos(st);

        num = Integer.parseInt(st);                         // Converte String para var int
        JOptionPane.showMessageDialog(null, "Números de amigos a inserir: " + num, "Quantidade de Amigos", 2);  //Recebe qtd de amigos

       chamaF.matriz(num);
       
    }
}
        
        
    
