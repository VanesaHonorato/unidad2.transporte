package unidad1.prolineal;

public class GaussRTest {

    // Método para comparar matrices, simulando un assert de prueba
    public static boolean compareMatrices(double[][] A, double[][] B) {
        if (A.length != B.length || A[0].length != B[0].length) return false;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if (Math.abs(A[i][j] - B[i][j]) > 0.0001) {  // Tolerancia a decimales
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Ejemplo de prueba 1
        double[][] matrix1 = {
            {1, -6, -30, -20},
            {0, 1, 1.5, 5.5},
            {0, 0, 1, 2},
            {0, 0, 0, 1}
        };

        double[][] expected1 = {
            {1, 0, -21, -12},
            {0, 1, 1.5, 5.5},
            {0, 0, 1, 2},
            {0, 0, 0, 1}
        };

        double[][] result1 = GaussR.simplex(matrix1, 1, 1);

        if (compareMatrices(result1, expected1)) {
            System.out.println("Prueba 1 PASÓ");
        } else {
            System.out.println("Prueba 1 FALLÓ");
        }

        // Ejemplo de prueba 2 (pivote 0)
        double[][] matrix2 = {
            {1, 0, 0},
            {0, 0, 0},
            {0, 0, 0}
        };

        double[][] result2 = GaussR.simplex(matrix2, 1, 1);
        if (result2 == null) {
            System.out.println("Prueba 2 PASÓ (manejo de pivote 0)");
        } else {
            System.out.println("Prueba 2 FALLÓ (manejo de pivote 0)");
        }

        // Otra prueba más
        double[][] matrix3 = {
            {2, 4, 6},
            {0, 3, 9},
            {1, 2, 3}
        };

        double[][] expected3 = {
            {1, 2, 3},
            {0, 3, 9},
            {0, 0, 0}
        };

        double[][] result3 = GaussR.simplex(matrix3, 0, 0);

        if (compareMatrices(result3, expected3)) {
            System.out.println("Prueba 3 PASÓ");
        } else {
            System.out.println("Prueba 3 FALLÓ");
        }
    }
}



