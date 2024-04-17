package Oito;

import java.util.ArrayList;

public class ArraysEListas {
    //Array unidimensional
    //<modificadores> <tipo> <nome>[ ] = new <tipo>[<dimensão>];

    //<tipo> se refere ao tipo de dado primitivo ou classe;
    //• <nome> é o nome atribuído ao array;
    //• <dimensão> se refere ao tamanho do array em número de elementos.
    // Precisa indicar um tamanho como exemplo abaixo 2
    public ArraysEListas(){
        int qtoClientes[] = new int[2];
        qtoClientes[0] = 99; //Cliente 1
        qtoClientes[1] = 111;  //Cliente 2

       System.out.println("Array multiplicando os valores: " + qtoClientes[0]*qtoClientes[1]);

        //Usando o List para fazer Array
        // Cria uma ArrayList para armazenar strings
        ArrayList<String> list = new ArrayList<>();

        // Adicionando elementos à lista
        list.add("Estevao");
        list.add("Andre");
        list.add("Cristiane");
        list.add("Angela");

        // Exibindo os elementos da lista
        for (String item : list) {
            System.out.println(item);
        }




    }


}
