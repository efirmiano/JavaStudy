package Nove;

public class ClasseFuncionarioHeranca extends ClassePessoaHeranca{

    private int numeroCracha;
    private String email;

    public ClasseFuncionarioHeranca(){}
    public ClasseFuncionarioHeranca(String n,int e,char s, int h, String g){
        //Desta forma passo os dados direto ao construtor da classe super, porem o recomendado é acessar através dos metodos Getters e Setters
        super("Andre",40,'M');

        //Desta forma não acesso através do SUPER
        setNome(n);
        setIdade(e);
        setSexo(s);
        this.numeroCracha = h;
        this.email = g;
    }
    public String getEmail(){
        return email;
    }
    public int getNumeroCracha(){
        return numeroCracha;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setNumeroCracha(int numeroCracha){
        this.numeroCracha = numeroCracha;
    }
//   Usando o Super para acessar os atributos e metodos diretamente a classe PessoaHeranca(SuperClasse)
    public void imprimir(){
        System.out.println("Nome: "+super.getNome());
        System.out.println("idade: "+super.getIdade());
        System.out.println("Sexo: "+super.getSexo());
        System.out.println("Email: "+email);
        System.out.println("Numero Cracha: "+numeroCracha);

    }
//    Qualquer referência com o operador super dentro de uma subclasse será feita
//    diretamente para a superclasse.




}
