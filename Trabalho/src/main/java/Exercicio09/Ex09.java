
package Exercicio09;

import javax.swing.JOptionPane;

public class Ex09 {

    public static void main(String[] args) {

        Funçoes chamaFuncao = new Funçoes();

        double peso = 0;
        double altura = 0;
        double imc = 0;

        String tx = JOptionPane.showInputDialog(null, "Informe sua altura: ");
        altura = Double.parseDouble(tx);

        String tx1 = JOptionPane.showInputDialog(null, "Informe sua peso: ");
        peso = Double.parseDouble(tx1);

        imc = chamaFuncao.calculoImc(peso, altura);

        chamaFuncao.classificaçao(imc);
    } 
}
