package com.mycompany.aula003;

import javax.swing.JOptionPane; // Bibloteca para aexibir caixas de diálogo

public class CondicionalSimples {

    public static void main(String[] args) {
        // Declaração de varáveis
        double nota1 = 0;
        double nota2 = 0;
        double media = 0;

        String st = "Informe a nota do primeiro bimestre";
        st = JOptionPane.showInputDialog(null, st); // Faz a leitura do valor inserido

        if (st == null || st.length() < 0) { // length faz a contagem da variavel, 

            JOptionPane.showMessageDialog(null, "É necessário informar valor!"); // Se não informar valor exibe msg

        } else {

            nota1 = Double.parseDouble(st); // Se informar valor nota1 recebe o valor
        }

        String st1 = "Informe a nota do segundo bimestre";
        st1 = JOptionPane.showInputDialog(null, st1); // Faz a leitura do valor inserido

        if (st1 == null || st1.length() < 0) { // length faz a contagem da variavel, 

            JOptionPane.showMessageDialog(null, "É necessário informar valor!"); // Se não informar valor exibe mensagem

        } else {

            nota2 = Double.parseDouble(st1); // Se informar valor nota2 recebe o valor
        }

        media = ((nota1 + nota2) / 2); // Cálculo da média

        if (media <= 4) {

            JOptionPane.showMessageDialog(null, "Média: " + media + " Aluno Reprovado!"); // Exibe mensagem

        } else if (media > 4 && media < 7) {

            JOptionPane.showMessageDialog(null, "Média: " + media + " Aluno em Exame!"); // Exibe mensagem

        } else if (media >= 7) {

            JOptionPane.showMessageDialog(null, "Média: " + media + " Aluno Aprovado!"); // Exibe mensagem

        }

    }
}
