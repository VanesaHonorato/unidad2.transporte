
package unidad1.prolineal;

/**
 * ITESS-TICS AGO-DIC 2024 
 * MATEMATICAS PARA LA TOMA DE DECISIONES
 * DOCENTE:FRANCISCO JAVIER MONTECILLO 
 * PROGARMADOR: VANESA GONZALEZ HONORATO
 * DESCRIPCCION: PROBLEMA DE LA PRACTICA
 * FECHA;19/SEP/24
 */
public class DivisionCrazyTest {
    public static void main(String... args) {
        double[] columna1 = {1, 2, 0, 1, -3};
         double[] columna2 = {1, 0, -6, 8, -4};
        
        DivisionCrazy dc = new DivisionCrazy(columna1,columna2);
        dc.resolver();
        dc.print();
        
    }
}
