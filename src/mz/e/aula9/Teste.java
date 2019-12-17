
package mz.e.aula9;

//import mz.e.aula8.Gato;

/**
 *
 * @author joseseie
 */
public class Teste {
    
    public static void main(String[] args) {
        
        Funcionario f1 = new Funcionario("Abel", 32, 2500.00, "Gestor");
        Funcionario f2 = new Funcionario("Mario", 40, 2500.00, "Fachineiro");
        Funcionario f3 = new Funcionario("Júlio", 50, 2500.00, "Motorista");
                
        Gato g = new Gato();
        
        f1.setNome("Estevao");
        
        System.out.println("Funcionario 2, nome: " + f1.getNome());
        System.out.println("Funcionario 2, nome: " + f2.getNome());
        System.out.println("Funcionario 2, nome: " + f3.getNome());
        
        
        
    }
    
}
