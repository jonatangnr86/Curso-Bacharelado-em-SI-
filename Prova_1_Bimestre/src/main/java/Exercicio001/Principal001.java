 package Exercicio001;

import javax.swing.JOptionPane;

public class Principal001 {

    public static void main(String[] args) {

        String nome = null;
        double salario = 0;
        double inss = 0;
        double irpf = 0;
        double saLiquido = 0;
        String msg;
        
        Funcoes chamaF = new Funcoes();

        do {
            String tx = JOptionPane.showInputDialog(null, "Informe nome do funcionário: ");

            if (tx == null || tx.length() < 3 || tx.length() > 50) {
                JOptionPane.showMessageDialog(null, "Nome inválido");
            } else {
                nome = tx;
            }
        } while (nome == null || nome.length() < 3 || nome.length() > 50);
      
        do {
            String tx = JOptionPane.showInputDialog(null, "Informe o salario do funcionário: ");
            salario = Double.parseDouble(tx);
            
            if (salario < 500) {
                JOptionPane.showMessageDialog(null, "Salário inválido");
            } else {
                
            }
        } while (salario <= 500);
        
        inss = chamaF.inss(salario);       
        irpf = chamaF.irpf(salario);    
        saLiquido = chamaF.salrioLiquido (salario, inss, irpf);     
        msg = nome + "\nSalário bruto: R$ " + salario  + "\n Desconto INSS R$ " + inss + "\n Desconto IRPF R$ " + irpf + "\nSalário Líquido: R$ " + saLiquido ;       
        JOptionPane.showMessageDialog(null, msg);
        
    }
}
