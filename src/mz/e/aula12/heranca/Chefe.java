
package mz.e.aula12.heranca;

/**
 *
 * @author joseseie
 */
public class Chefe extends Funcionario {

    @Override
    public void atrasar() {
        System.out.println("Opah, o chefe atrasou que triste");
    }

    @Override
    public void trabalhar() {
        
        System.out.println("O chefe trabalha.");

    }
    
    
    
}
