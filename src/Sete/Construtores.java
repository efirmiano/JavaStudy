package Sete;

public class Construtores {
    /* Em toda classe Java, caso não seja definido qualquer construtor customizado,
      o próprio compilador Java se encarrega de criar um construtor, denominado
      construtor padrão */

    //O construtor é criado apenas uma vez em sua existencia quando executado o comando NEW

    //default: 0 para tipos int, 0.0 para tipos de ponto flutuante, false para boolean, /u0000 para char e null para objetos em geral.
    //Os construtores não devem possuir um tipo de retorno;
    //Metodo construtor padrão da classe
    // Se o Construtor tiver um retorno então se torna metodo mesmo que tenha o mesmo nome da classe.

    private int valor1,valor2;
    public Construtores(String nome, String sobreNome){

    }
    //Os construtores não devem possuir um tipo de retorno;
    public Construtores(int valor1, int valor2){
        this.valor1 = valor1;
        this.valor2 = valor2;

    }
    //Metodo para Somar os valores recebidos através do Construtor
    public int soma(){
        return valor1 + valor2;
    }
    public int subtrair(){
        return valor1 - valor2;
    }
    public int multiplicar(){
        return valor1 * valor2;
    }
    public int dividir(){
        return valor1 / valor2;
    }
    public int restoDivisao(){
        return valor1 % valor2;
    }

}
