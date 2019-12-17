
package mz.e.aula12.recursividade;

/**
 *
 * @author joseseie
 */
public class Recursividade {
    
    static int factorial (int n) {
        
        if (n == 0) 
            return 1;
        
        return n * factorial(n-1);
        
    }
    
    static int soma (int num) {
        
        if (num == 0) 
            return 0;
       
        return num + soma(num-1);
        
    }
    
    // Mateus = M.a.t.e.u.s, Helio => H.e.l.i.o
    // 3 = 3 + 2 + 1 + 0;
    
    public static void main(String[] args) {
        
        int valor = factorial(5);
        
        int soma = soma(100);
        
        System.out.println("Soma: " + soma);
//        System.out.println("Factorial: " + valor);
        
    }
}
