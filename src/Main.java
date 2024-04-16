public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Estancia da classe Veriavel
        Variaveis estevao = new Variaveis();

        System.out.println(estevao.nome + " : Variavel String");
        System.out.println(estevao.idade + " : Variavel Int");
        System.out.println(estevao.sexo + " : Variavel Char");
        System.out.println(estevao.code + " : Variavel Boolean");
        System.out.println(estevao.salario + " : Variavel float");
        System.out.println(estevao.salarioFinal + " : Variavel Double");

        EnumDiasDaSemana diaBom = EnumDiasDaSemana.SABADO;
        System.out.println("O melhor dia da semana : " + diaBom + " :Utilizando Classe Enum");

        System.out.println(estevao.y + " :Utilizando Função da Classe Wrapper");

        System.out.println(estevao.anoAtual + " :Utilizando o Casting na variavel");

        //Estancia da classe Operadores
        Operadores matematica = new Operadores();
        // Operadores aritméticos
        System.out.println(matematica.aritimeticos()+ "Resto da divição via operadores de aritimetica %=");
        //Operadores incrementais e Decrementais
        System.out.println(matematica.incrementaisDecrementais()+ " Operador para subtração da variavel y --");
        //Operadores logico
        System.out.println(matematica.logicos());
        //Operadores ternario
        System.out.println(matematica.ternario());

        //Estancia da classe EstruturaControle
        EstruturaControle condicao = new EstruturaControle();
        System.out.println(condicao);

        //Estancia da classe EstruturaRepetição
        EstruturaRepeticao repeticao = new EstruturaRepeticao();
        System.out.println(repeticao);

    }
}