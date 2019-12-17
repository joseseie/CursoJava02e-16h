
package mz.e.aula12;

import java.util.Scanner;

/**
 *
 * @author joseseie
 */
public class Sobrecarga {
    
    static int lerNumero () {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Digite o numero: ");
        return s.nextInt();
    }
    
    static int lerNumero (String nome) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print(nome + " digite o numero: ");
        return s.nextInt();
    }
    
    static int lerNumero (String nome, int idade) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Digite o numero: ");
        return s.nextInt();
    }
    
    public static void main(String[] args) {
        
        int num = lerNumero("Hugo");
        
        System.out.println("Numero lido: " + num);
        
    }
    
    
}
