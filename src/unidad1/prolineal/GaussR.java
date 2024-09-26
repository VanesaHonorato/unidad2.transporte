package unidad1.prolineal;

/**
 * para evitar errores generador de codigo
 *
 * @author vanesahonorato
 */
public class GaussR {

    private int c;
    private int r;
    private double[][] pl;

    public GaussR(int c, int r, double[][] pl) {
        this.c = c;
        this.r = r;
        this.pl = pl;
    }

   
    public double[][] getPl() {
        return pl;
    }

    public int getR() {
        return r;
    }

    public int getC() {
        return c;
    }

    public void pivoting() {
        double piv = pl[r][c];
        for (int j = 1; j < pl[0].length; j++) 
            pl[r][j] = pl[r][j] / piv;
        
        
        
        for (int i = 0; i <pl.length; i++) {
            if (i != r){
                 double fact =-pl[i][c]; 

                for (int j = 0; j < pl[0].length; j++) 
                                  
                pl[i][j]= pl[r][j]* fact + pl[i][j];
                
             }
        } 
    }

    public void print() {
        System.out.println("pl:--------------------------------");
        for (int i = 0; i < pl.length; i++) {
            for (int j = 0; j < pl[0].length; j++) {
                System.out.printf("%+6.3f ", pl[i][j]);
            }
            System.out.println("");
        }
    }
}
