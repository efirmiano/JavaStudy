import Cinco.Emcapsulamento;
import Cinco.OrientacaoObject;
import Dois.EnumDiasDaSemana;
import Dois.Variaveis;
import Cinco.PacoteImportTeste.PacotesImportados;
import Oito.ArraysEListas;
import Quatro.EstruturaControle_If_IfElse_Switch_break_continue;
import Quatro.EstruturaRepeticao;
import Sete.Construtores;
import Tres.Operadores_aritimeticos_logicos;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Instãcia da classe Veriavel
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

        //Instãcia da classe Tres.Operadores_aritimeticos_logicos
        Operadores_aritimeticos_logicos matematica = new Operadores_aritimeticos_logicos();
        // Tres.Operadores_aritimeticos_logicos aritméticos
        System.out.println(matematica.aritimeticos()+ "Resto da divição via operadores de aritimetica %=");
        //Tres.Operadores_aritimeticos_logicos incrementais e Decrementais
        System.out.println(matematica.incrementaisDecrementais()+ " Operador para subtração da variavel y --");
        //Tres.Operadores_aritimeticos_logicos logico
        System.out.println(matematica.logicos());
        //Tres.Operadores_aritimeticos_logicos ternario
        System.out.println(matematica.ternario());

        //Instãcia da classe Quatro.EstruturaControle_If_IfElse_Switch_break_continue
        EstruturaControle_If_IfElse_Switch_break_continue condicao = new EstruturaControle_If_IfElse_Switch_break_continue();
        System.out.println(condicao);

        //Instãcia da classe EstruturaRepetição
        EstruturaRepeticao repeticao = new EstruturaRepeticao();
        System.out.println(repeticao);

        //Instãcia da classe Cinco.OrientacaoObject
        OrientacaoObject objeto = new OrientacaoObject();
        System.out.println(objeto);

        //Instãcia da Classe Cinco.Emcapsulamento
        Emcapsulamento emcap = new Emcapsulamento();
        emcap.setNome("Estevao");
        emcap.setCPF("30089009845");
        System.out.println("Nome: "+ emcap.getNome()+" : "+"CPF: "+emcap.getCPF());

        //Importando Pacotes ao projeto
        //import Cinco.PacoteTest este foi o pacote importado
        //Acessando uma classe em outro pacote
        PacotesImportados pacote = new PacotesImportados();
        System.out.println( "A cor: "+ pacote.getCor());


        //Instaciando Construtores
        Construtores contrutor = new Construtores("Estevão"," Firmiano");
        System.out.println(contrutor);
        Construtores contrutor2 = new Construtores(15,40);
        System.out.println(contrutor2.soma() + "\n" +contrutor2.multiplicar());

        //Instaciando ArrayEList
        ArraysEListas arrayLista= new ArraysEListas();


    }
}