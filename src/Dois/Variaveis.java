package Dois;

public class Variaveis {
    //Criando variaveis
    public String nome= "Estevão Henrique Firmiano Raimundo";
    public int idade = 32;
    public char sexo = 'm';
    public boolean code = true;
    public double salarioFinal = 12 * 16000.02;
    public float salario = 16000.02f;

    //Casting de variavel Aumentando/Diminuindo o tamanho usado na memoria da variavel
    long ano = 2023;
    public int anoAtual = (int) ano;

    //Utilizando Classes Wrapper como o exemplo abaixo.
    public Integer y = Integer.valueOf(27);

    //Convertendo uma Variavel do tipo int em String
    String anoText = Integer.toString((int) ano);

}
