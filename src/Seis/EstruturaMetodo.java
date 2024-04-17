package Seis;

import java.util.ArrayList;

public class EstruturaMetodo {

    //Estrutura de um Metodo
    /*
    <modificadores> <tipoRetorno> <nomeDoMétodo>(<lista de parâmetros>){
    // Corpo do método com instruções
    }
     */

    //Breve Explicação sobre o padrão para criar METODO
    /*
    modificador(es): Refere-se a um ou mais modificadores existentes, os
    quais definirão as regras de visibilidade, sobrescrita e outros aspectos
    comportamentais do método;
    • tipoRetorno:Refere-se ao tipo de dado válido retornado pelo método. Pode
    ser qualquer tipo de dados, incluindo aqueles de classes desenvolvidas
    pelo programador. Se o método não retornar um valor, o tipo obrigatório
    de retorno a ser usado será void;
    • nomeDoMétodo: Refere-se ao nome do método, que pode ser um
    identificador legal não utilizado por outros itens do escopo atual;
    • lista de parâmetros: Refere-se à sequência de pares compostos por
    um tipo e um identificador, os quais estão separados por vírgulas. Os
    parâmetros são variáveis, ou seja, eles recebem o valor dos argumentos
    que são passados para o método quando ele é chamado. Se não houver
    parâmetros para o método, você não deve inserir conteúdo na lista de
    parâmetros, porém, o par de parênteses é um conjunto obrigatório a ser
    escrito em todo método, ainda que vazio. */

    //Return é usado para retornar um valor para quem chamou o metodo encerrando a execução do metodo.
    public int devolverValor(){
        int valor = 10 - 2;
        return valor;
    }
    //VOID é usado quando o Metodo não retornar nenhum valor.
    public void somarValor(){
        int valor = 10 + 10;
    }

    //Chamando um Metodo e armazenando o valor retornado em uma variavel;
    int valores = devolverValor();

    //Metodo que recebe dois valores como parametro para executar uma conta
    public int multiplicarValor(int valor1,int valor2){
        int resultado;
        resultado = valor1 * valor2;
        return resultado;
    }
    //Chamando metodo e passando valores para fazer o calculo de multiplicação e armazenando o resultado em variavel
    int retornoMetodoMultiplicacao = multiplicarValor(10,55);
    // Definição importante sobre Metodos: o método chamador (caller) e o método executor (worker)

    //Lista Array
    int[] lista={1,2,3,4,5,10,20};

    //Usando Varargs em METODOS para listas Array
    public int calcular(int[] lista){
        int soma = 0;
        for(int i = 0; i < lista.length; i++){

        }
        return soma;
    }

    //Metodos assessores Getters e Setters
    //Setters
    //void set + Nome do atributo (<tipo da variável> <nome da variável>);
    private String nomeCompleto;
    void setNomeCompleto(String nomeCompleto){
         this.nomeCompleto = nomeCompleto;
    }
    //Getters
    //Tipo do atributo get + Nome_do_atributo ();
    String getNomeCompleto(){
        return this.nomeCompleto;
    }
    //podemos chamar varios Metodos em sequencia na classe MAIN;

    //SobreCarga de metodos, podemos escrever o metodo com o mesmo nome desde que os parametros(Assinatura) seja diferentes.
    void mostrar(int valor1){
        System.out.println("Metodo mostrar V1 na sobrecarga do metodo");
    }
    void mostrar(int valor1, int valor2){
        System.out.println("Metodo mostrar V2 na sobrecarga do metodo");
    }
    void mostrar(){
        System.out.println("Metodo mostrar V3 na sobrecarga do metodo");
    }





}
