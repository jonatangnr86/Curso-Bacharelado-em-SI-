
package Exercicio001;


public class Funcoes {
    
    double inss (double x){
        double descontoInss = 0;
        
        if(x <= 965.67){ 
        descontoInss = (x * 0.08);              
        }
        else if (x > 965.67 && x <= 1609.45){
         descontoInss = (x * 0.09);              
        }
        else if (x > 1609.45 && x <= 5000.00){
           descontoInss = (x * 0.11);          
        }
        else if (x > 5000){
            descontoInss = (x * 0.15);
        }      
        
        return  descontoInss;
    }
    
    
    double irpf (double x){
        double descontoIrpf = 0;
        
        if (x <= 1434.00){       
        descontoIrpf = 0;        
    }
        else if (x > 1434.00 && x <= 2150.00){
           descontoIrpf = (x * 0.075);           
        }
        else if (x > 2150.00 && x <= 2900.00){
             descontoIrpf = (x * 0.15); 
        }
        else if (x > 2900 && x <= 5000){
            descontoIrpf = (x * 0.225);            
        }
        else if (x > 5000){
             descontoIrpf = (x * 0.25); 
        }        
        return descontoIrpf;
    }
    
    double salrioLiquido (double a, double b, double c){
        double x =0 ;
        
        x = a - (b + c);
        
       return x; 
    }
    
}
