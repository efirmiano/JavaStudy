package Dez;

public class InterfacesImplemantando implements InterfacesConceito{
    //Como implementei uma interface sou obrigado usar os metodos que existem nela.
    public void ligar() {
        System.out.println("Ligando, implementacao de interface");

    }

    public void desligar() {
        System.out.println("Desligando, implementacao de interface");
    }
}
