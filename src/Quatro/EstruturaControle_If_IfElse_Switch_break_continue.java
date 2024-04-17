package Quatro;

public class EstruturaControle_If_IfElse_Switch_break_continue {

    public EstruturaControle_If_IfElse_Switch_break_continue(){

        int a = 10;
        int b = 9;

        //Estruturas de desvios condicionais
        //IF
        if(a != b){
            System.out.print("Verdadeiro Caiu no IF ");
        }

        // IF / ELSE
        if(a < b){
            System.out.print("Verdadeiro Caiu no IF ");
        }else{
            System.out.print("Falso Caiu no ELSE ");
        }

        // IF / ELSE em cascata
        if(a < b){
            System.out.print("Verdadeiro Caiu no IF ");
        }else if (a >= b){
            System.out.print("Falso Caiu no ELSE ");
        }else if (a != b){
            System.out.print("Falso Caiu no ELSE ");
        }

        //switch
        int mes = 7;
        switch (mes){
            case 1: System.out.println("Janeiro"); break;
            case 2: System.out.println("Fevereiro"); break;
            case 3: System.out.println("Março"); break;
            case 4: System.out.println("Abril"); break;
            case 5: System.out.println("Maio"); break;
            case 6: System.out.println("Junho"); break;
            case 7: System.out.println("Julho"); break;
            case 8: System.out.println("Agosto"); break;
            case 9: System.out.println("Setembro"); break;
            case 10: System.out.println("Outubro"); break;
            case 11: System.out.println("Novembro"); break;
            case 12: System.out.println("Dezembro"); break;
            default: System.out.println("Digite um novo valor");
        }

    }

}
