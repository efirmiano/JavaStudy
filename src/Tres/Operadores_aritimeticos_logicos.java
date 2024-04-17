package Tres;

public class Operadores_aritimeticos_logicos {
    //<tipo> <nomeVariávelOuConstante> = <valorAtribuição>;
    //Atribuir
    boolean flag = false;
    char resposta = 'n';
    String endereco = "Rua X";
    int idade = 32;
    long ano = 2024;

    //operadores aritimeticos
    int a = 2 + 2; // adição
    int b = 2 - 2; // subtração
    int c = 2 * 2; // multiplicação
    int d = 2 / 2; //divisao
    int e = 2 % 2; //Resto da divisao

    //Precisei criar um metodo para rodar os testes abaixo, pois eles não rodam direto na class, precisa de uma Metodo:
    // Sysout tbm não funciona direto na classe precisa de um metodo:
    public int aritimeticos(){

        //Tres.Operadores_aritimeticos_logicos aritméticos de atribuição reduzida
        int x = 2;
        int y = 2;
        int h = 2;
        int z = 2;
        int v = 15;

        x += 3; // Soma mais 3 a variavel
        y -= 3; // Sobtrai menos 3 a variavel
        h *= 3; // multiplica vezes 3 a variavel
        z /= 3; // Divide por 3 a variavel
        v %= 4; // divide por 3 e armazena na variavel o resto da divisão

        //System.out.println(x);
        //System.out.println(y);
        //System.out.println(h);
        //.out.println(z);
        //System.out.println(v);
       // System.out.println("Tres.Operadores_aritimeticos_logicos aritméticos de atribuição reduzida");

        return (v);
    }
    //Tres.Operadores_aritimeticos_logicos incrementais e decrementais
    public int incrementaisDecrementais(){

        //Tres.Operadores_aritimeticos_logicos incrementais e decrementais
        int x = 5;
        int y = 10;

        x++;
        y--;

        //Convertendo variavel int para String
        return (y);
    }

    //Tres.Operadores_aritimeticos_logicos Relacionais
    public boolean relacionais(){
        int x = 5;
        int y = 4;

        //Tres.Operadores_aritimeticos_logicos Relacionais
        boolean h;
        h = x == y; //Varial x é igual a Y
        h = x < y; // Variavel x é menor que y
        h = x > y; // Variavel x é maior que y
        h = x != y;// variavel x é diferente de y
        h = x >= y;// variavel x é maior ou igual a y
        h = x <= y;// variavel x é menor ou igual a y

        return h;
    }

    //Tres.Operadores_aritimeticos_logicos Logicos
    public boolean logicos(){
        int x = 5;
        int y = 4;

        //Tres.Operadores_aritimeticos_logicos Logicos
        boolean h;
        h = x == y & x < y; //Varial x é igual a Y E Variavel x é menor que y (CONJUNçÃO)
        h = x == y && x < y; //Varial x é igual a Y E Variavel x é menor que y (CONJUNçÃO)
        h = x < y | x != y; // Variavel x é menor que y OU variavel x é diferente de y (DISJUNÇÃO)
        h = x < y || x != y; // Variavel x é menor que y OU variavel x é diferente de y (DISJUNÇÃO)
        h = x > y ^ x != y; // Variavel x é maior que y OU variavel x é diferente de y (Precisa retornar TRUE caso contrario False)
        h = !(x > y);// variavel x é diferente de maior que y

        /*Em um teste lógico utilizando o operador && ou & (AND), o resultado somente
        será verdadeiro (true) se todas as expressões lógicas forem avaliadas como
        verdadeiras.*/

        /*Se o operador utilizado for || ou | (OR), basta que uma das expressões lógicas
        seja verdadeira para que o resultado também seja verdadeiro.*/

        /* O operador ^ (XOR) retorna verdadeiro (true) somente se as duas expressões
        tiverem resultados distintos entre si, ou seja, se uma for verdadeira, a outra
        tem que ser falsa e vice-versa.*/

        /*Já o operador lógico ! (NOT) é utilizado para gerar uma negação, invertendo a
        lógica de uma expressão.*/

        return h;
    }

    // Tres.Operadores_aritimeticos_logicos Ternarios
    public String ternario() {
        // Sintax (<variávelOuConstante> = <testeLogico> ? <valorSeVerdadeiro> :<valorSeFalso>;)
        int h = 2, j = 4;
        String x;
        x = (h + j > j * h ? "SIM" : "NAO");
        return x;


        /* Ordem de execução dos operadores
        1 = ( ) [ ] .
        2 = ++ -- ~ !
        3 = * / %
        4 = + -
        5 = > >= < <=
        6 = == !=
        7 = &
        8 = ^
        9 = |
        10 = &&
        11 = ||
        12 = ? :
        13 + = += -= *= /= %=
        */
    }


}