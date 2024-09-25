package unidad1.prolineal;

/**indice mas negativo
 * @author vanesahonorato
 */
public class NumeroOpt {
//variables

    private int[] arreglo;
//constructor

    public NumeroOpt(int[] arreglo) {
        this.arreglo = arreglo;
    }

    public void setArreglo(int[] arreglo) {
        this.arreglo = arreglo;
    }

//calcular
    public int calcular() {
        int min = arreglo[0];
        int index = 0;

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] < min) {
                index = i;
                min = arreglo[i];

            }
        }
        return min >= 0 ? -1 : index;

    }
}
