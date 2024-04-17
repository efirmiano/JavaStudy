package Nove;

public class ClassePessoaHeranca {
    //Atributos
    private String nome;
    private int idade;
    private char sexo;

    //Metodos para acessar ou visualizar os atributos da Classe Super.

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }



    public ClassePessoaHeranca() {}
    public ClassePessoaHeranca(String nome,int idade,char sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }



    public String falar(){
        String fala = "bom dia";
        return fala;
    }
}
