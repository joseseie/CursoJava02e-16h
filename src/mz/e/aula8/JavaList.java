
package mz.e.aula8;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Vector;

/**
 *
 * @author joseseie
 * @author Filipe Mangue
 * @author Horcha Chambule
 * @author Valter Massango
 * @author Aly Macome
 * @author Efraime Mutola
 * 
 */
public class JavaList {
    
    public static void main(String[] args) {
        
         ArrayList<Object> lista = new ArrayList();
         Vector vector= new Vector();
         
         Object[] nomes = new Object[10];
         
         lista.add("Efraime");
         lista.add(10);
         lista.add('W');
         lista.add(90);
         
         vector.add(10);
         vector.add("sdsfd");
         vector.add(89);
         
         nomes[0] = "Stelio";
         nomes[7] = "Mario";
         nomes[3] = 10;
         nomes[8] = 'K';
        
         
         System.out.println("Array elements: " + Arrays.toString(nomes));
         System.out.println("Array size: " + nomes.length);
         
         System.out.println("Lista elements: " + lista.toString());
         System.out.println("Lista size: " + lista.size());
         
         System.out.println("Vector elements: " + vector.toString());
         System.out.println("Vector size: " + vector.size());
         System.out.println("Vector capacity: " + vector.capacity());
         
         
    }
    
}
