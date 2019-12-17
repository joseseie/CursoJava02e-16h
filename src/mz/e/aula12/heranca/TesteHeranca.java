
package mz.e.aula12.heranca;

/**
 *
 * @author joseseie
 */
public class TesteHeranca {
    
    public static void main(String[] args) {
        
//        Pessoa pessoa = new Pessoa();
//        Pessoa funcionario = new Funcionario();
        Pessoa visitante = new Visitante();
        Chefe chefe = new Chefe();
        chefe.setNome("Marcos");
        
        Funcionario director = new Director();
        Faxineiro faxineiro = new Faxineiro();
        
        faxineiro.setNome("Lucas");

        
        chefe.trabalhar();
        faxineiro.trabalhar();
        
//        System.out.println("Chefe: " + chefe.getNome());
//        System.out.println("Faxineiro: " + faxineiro.getNome());
        
    }
    
}
