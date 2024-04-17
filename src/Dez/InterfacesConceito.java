package Dez;

public interface InterfacesConceito {

    //O Beneficio de usar uma interface é gigantesca não preciso criar um metodo para cada classe, crio apenas uma interface e uso em varias classes.
    void ligar();
    void desligar();


    //Outra inovação interessante no Java 8 é o método default (padrão). Tratase de um método comum, criado dentro da interface, que permite criar um
    //comportamento padrão ou implementação padrão para todas as classes que
    //implementam aquela interface.
    default void acionarTimer(int minutos){
        try{Thread.sleep(minutos * 60000);}catch (Exception e){

        }
    }
}
