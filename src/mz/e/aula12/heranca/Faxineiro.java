
package mz.e.aula12.heranca;

/**
 *
 * @author joseseie
 */
public class Faxineiro extends Funcionario {

    @Override
    public void atrasar() {

        System.out.println("EIsh, o faxineiro atrasou...");
    }
    
    @Override
    public void trabalhar() {
        
        System.out.println("O faxineiro trabalha.");

    }
    
    
    
}
