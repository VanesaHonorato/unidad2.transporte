
package unidad2.transporte;

/**
 *
 * @author vanesahonorato
 */
public class TransporteSbfCmTest {

    public static void main(String[] args) {
        int[][] mn = new int[3][4]; 
        int[] d = {12, 8, 4, 6};  
        int[] o = {5, 10, 15};    
        int[][] costos = {
            {2, 3, 5, 6},
            {2, 1, 3, 5},
            {3, 8, 4, 6}
        };

        TransporteSfb transporte = new TransporteSfbCM();
        transporte.sfb(mn, d, o, costos);

        
        System.out.println("Salida");
        for (int i = 0; i < mn.length; i++) {
            for (int j = 0; j < mn[i].length; j++) {
                System.out.print(mn[i][j] + " ");
            }
            System.out.println();
        }
    }
}


