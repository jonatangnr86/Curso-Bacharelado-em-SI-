
package Exercicio05;

import javax.swing.JOptionPane;

public class Ex05 {
  
    public static void main(String[] args) {
        
        String[] nome = new String[20];
        String lista = "Lista de Convidados:";
        
        for(int i = 0; i < 20; i++){
           nome[i] = JOptionPane.showInputDialog(null, "Informe o nome do convidado N°" + i);
           lista = lista + "\n" + (i + 1) + " " + nome[i]; 
        }
        
            JOptionPane.showMessageDialog(null, lista);
    }
}
