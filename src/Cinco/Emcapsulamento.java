package Cinco;

public class Emcapsulamento {
    //O uso do this e emcapsulamento
    //Usando o metodo Set para setar um valor na variavel emcapsulada;
    private String CPF;
    private String nome;

    //usando metodo SET para enviar os dados as variaveis emcapsuladas
    public void setCPF(String CPF){
        this.CPF = CPF;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    //usando metodo GET para PEGAR os dados das variaveis emcapsuladas
    public String getCPF() {
        return CPF;
    }
    public String getNome(){
        return nome;
    }
}
