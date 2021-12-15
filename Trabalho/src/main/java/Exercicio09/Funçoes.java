
package Exercicio09;

import javax.swing.JOptionPane;


public class Funçoes {
    
    double calculoImc (double n1, double n2){     
        return (n1/(n2 * n2));
    }
    
    void classificaçao(double n1){
        if(n1 > 17 && n1 < 18.4){
            JOptionPane.showMessageDialog(null, "Você esta só o osso!");          
        }else if(n1 > 18.5 && n1 < 24.9){
            JOptionPane.showMessageDialog(null, "Seu peso está normal!");          
        }else if(n1 > 25 && n1 < 29.9){
            JOptionPane.showMessageDialog(null, "Você esta acima do peso!");          
        }else if(n1 > 30 && n1 < 34.9){
            JOptionPane.showMessageDialog(null, "Você esta gordinho");          
        }else if(n1 > 35 && n1 < 40){
            JOptionPane.showMessageDialog(null, "Você esta Gordo");          
        }else if(n1 > 40){
            JOptionPane.showMessageDialog(null, "Você esta Super Gordo!");          
        }else {
            JOptionPane.showMessageDialog(null, "Você esta morto ");
        }
        
        
        
        
    }
    
}
