package Um;

public class Primeiro {

    //Uma classe basica em java !!!

    /*public class <nome> {
     public static void main(String args[]) {
     declarações;
     comandos;
     }
    }*/

    // Os Comandos a seguir são executados diretamente no terminal

    //Iniciando o jshell
    /*
        C:\>jshell
        | Welcome to JShell -- Version 9
        | For an introduction type: /help intro
        jshell>
     */

    //Saindo do Jshell
    /*
    jshell> /exit
    | Goodbye
     */

    //Iniciando no modo Verbose
    /*
    c:\>jshell -v
    | Welcome to JShell -- Version 9
    | For an introduction type: /help intro
     */

    //Declarando uma variável e atribuindo a ela um valor (é retornado um feedback do que foi processado neste comando):
    /*
    jshell> int x = 45
    x ==> 45
    | created variable x : int
     */

    //Expressões criadas e que não tenham variáveis declaradas fazem com que
    //o JShell crie variáveis anônimas. Métodos podem ser criados e executados
    //dinamicamente (métodos, variáveis e declarações serão detalhados em
    //capítulos posteriores).
    /*
    jshell> 2 + 2
    $3 ==> 4
    | created scratch variable $3 : int
    jshell> String twice(String s) {
     ...> return s + s;
     ...> }
    | created method twice(String)
    jshell> twice(“Java”)
    $5 ==> “JavaJava”
    | created scratch variable $5 : String
     */
}
