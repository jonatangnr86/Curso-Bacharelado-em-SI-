package com.jdiogo.aula02;

public class aula002 {
  
public static void main(String[] args){
    
    int n1=60; 
    int n2=60;
    int n3=60;
    int m=(n1 + n2 + n3)/3;
    
    if(m>=90){      
    System.out.println("Aprovado comm louvor");     
   
}else if (m>=70){
    System.out.println("Aprovado");
    
}else if (m < 70){
    System.out.println("Reprovado");
}
}
}