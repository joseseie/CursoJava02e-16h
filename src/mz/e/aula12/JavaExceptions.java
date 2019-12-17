
package mz.e.aula12;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author joseseie
 */
public class JavaExceptions {
    
    static int lerNumero () throws Exception {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Digite o número: ");
        int num = s.nextInt();

        return num;
            
    }
    
    public static void main(String[] args) {
        
      
        try {
            
            int num = lerNumero();
            System.out.println("Numero lido: " + num);
            
        } catch (Exception ex) {
            System.err.println("Ocorreu um erro, mas foi tratado, erro: " + ex.getMessage());
        }
        
    }
    
}
