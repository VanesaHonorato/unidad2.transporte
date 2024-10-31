package unidad2.transporte;

public class TransporteSfbEN extends TransporteSfb {

    @Override
    public void sfb(int[][] mn, int[] d, int[] o) {
        int r = mn.length;
        int c = mn[0].length;
        int i = 0, j = 0;

        while (i < r && j < c) {
            int a = Math.min(o[i], d[j]);
            mn[i][j] = a;
            o[i] -= a;
            d[j] -= a;

            if (o[i] == 0) i++;
            if (d[+j] == 0) j++;
        }
    }
}
