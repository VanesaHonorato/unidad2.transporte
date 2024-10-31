
package unidad2.transporte;

/**
 *
 * @author vanesahonorato
 */
public class TransporteSbfEnTest {
    public static void main(String[] args) {
        int[][] mn = new int[3][4]; 
        int[] d = {2, 4, 2, 1};   
        int[] o = {5, 1, 3};     

        TransporteSfb transporte = new TransporteSfbEN();
        transporte.sfb(mn, d, o);

       
        System.out.println("Salida");
        for (int i = 0; i < mn.length; i++) {
            for (int j = 0; j < mn[i].length; j++) {
                System.out.print(mn[i][j] + " ");
            }
            System.out.println();
        }
    }
}

