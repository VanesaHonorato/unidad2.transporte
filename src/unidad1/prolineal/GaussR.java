package unidad1.proglineal;

public class GaussR {

    public static double[][] simplex(double[][] A, int R, int C) {
        int numRows = A.length;
        int numCols = A[0].length;

        // Comprobamos si el pivote es 0
        if (A[R][C] == 0) {
            System.out.println("-1");
            return null;  // Salida -1 si el pivote es cero.
        }

        // Hacer 1 el elemento pivote dividiendo el renglón R por el elemento en A[R][C]
        double pivot = A[R][C];
        for (int j = 0; j < numCols; j++) {
            A[R][j] /= pivot;
        }

        // Hacer 0 los demás elementos de la columna C
        for (int i = 0; i < numRows; i++) {
            if (i != R) {  // No tocar el renglón pivote
                double factor = A[i][C];
                for (int j = 0; j < numCols; j++) {
                    A[i][j] -= factor * A[R][j];  // Restar un múltiplo del renglón R
                }
            }
        }

        return A;
    }

    // Método para imprimir la matriz
    public static void printMatrix(double[][] A) {
        for (double[] row : A) {
            for (double value : row) {
                System.out.printf("%8.4f", value);
            }
            System.out.println();
        }
    }

}
