package Cinco;

import Cinco.ObjectPersona;

public class OrientacaoObject {

    public OrientacaoObject (){

        ObjectPersona joao = new ObjectPersona();
        ObjectPersona maria = new ObjectPersona();

        joao.nome = "Joao";
        joao.idade = 32;
        joao.sexo = 'M';

        maria.nome = "Maria";
        maria.idade = 18;
        maria.sexo = 'F';

        System.out.println("Objeto 1 "+ joao);//Mostra a identificação do objeto1
        System.out.println("Objeto 2 " + maria);//Mostra a identificação do objeto2
        System.out.println("Objeto : "+ joao.nome);
        System.out.println("Objeto : " + maria.nome);

        System.out.println("Daqui para frente apontei para o mesmo objeto");
        //Daqui em diante o Objeto João vai se referenciar ao objeto Maria
        joao = maria;
        System.out.println("Objeto1 : "+ joao.nome);
        System.out.println("Objeto2 : " + maria.nome);




    }


}
