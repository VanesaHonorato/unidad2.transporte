
package unidad1.prolineal;

/**
 *
 * @author vanesahonorato
 */
public class NumeroOptTest {
    public static void main (String ...args){
        
        int [] arr = {1, -3, -9, 0, 1, -2};
        int[] arr2 = {1, 2, 3};
               
        NumeroOpt nop = new NumeroOpt(arr);
        System.out.println("nop:" + nop.calcular());
        
        
        nop.setArreglo(arr2);
        System.out.println("nop:" + nop.calcular());
    }
}
