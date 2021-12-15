package com.dartora.aula001;



public class Aula001 {

    Aula001 aula = new Aula001(); //criação de objeto

    //declaração de variáveis
    int idade = 0;
    String nome = "Lucas";
    String sobrenome = "Dartora";
    String cidadeEstado = "Toledo " + " - " + "Paraná";
    double peso = 0;
    String cpf_2;

    Aula002 aula002 = new Aula002();

    public String validarSobrenome(String sobrenome) { //exemplo de função
        return sobrenome;
    }

    void validarNome() {  //exemplo de método sem retorno de valor, utilizado normalmente para validação de campos
    }

    public void setAula002(Aula002 aula002) {
        this.aula002 = aula002;

        aula002.cpf.toString();

    }

}
