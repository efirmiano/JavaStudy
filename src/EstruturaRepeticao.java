public class EstruturaRepeticao {
    public EstruturaRepeticao(){
    // Estruturas de repetição
        int a = 0;
        int b = 0;
        int h = 0;

        //Estrutura de repetição While
        while (a <= 10){
            System.out.println("Valor de A é " + a);
            a++;
        }
        // Estrutura de repetição DO / While
        // Nesta estrutura garante que o codigo execute ao menos uma vez, memso que a expressão de False
        do {
            System.out.println("Valor de b é " + b);
            b++;
        } while(b < a);

        // Estrutura de repetição FOR
        for(int i = 0; i <= 10 ;i++){
            System.out.println("Repeticao FOR: "+ i);
        }
        // Comando BREAK é utilizado para interromper o laço de repetição.
        for(int i = 0; i <= 10 ;i++){
            System.out.println("Repeticao FOR/BREAK: "+ i);// aqui vai repetir até que o comando break pare a execução do laço de repetição no numero 7
            if (i == 7){
                System.out.println("Repeticao BREAK: "+ i);
                break;
            }

        }
        //Comando CONTINUE
        //Comando continue serve para validar o condicional do laço novamente como o exemplo abaixo.

        while (h <= 10){
            h++;
            if (h == 5){
               //System.out.println("Aqui vai voltar para ler o condicional do laço While e não vai mostrar o numero "+h);
                continue;
            }
            System.out.println("Valor de A é " + h);
        }

    }
}
