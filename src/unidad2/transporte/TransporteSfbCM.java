package unidad2.transporte;

public class TransporteSfbCM extends TransporteSfb {

    @Override
    public void sfb(int[][] mn, int[] d, int[] o, int[][] costos) {
        int r = mn.length;
        int c = mn[0].length;
        boolean[] rU = new boolean[r];
        boolean[] cU = new boolean[c];

        while (true) {
            int minCostos = Integer.MAX_VALUE;
            int minI = -1;
            int minJ = -1;

        
            for (int i = 0; i < r; i++) {
                if (rU[i]) continue;
                for (int j = 0; j < c; j++) {
                    if (cU[j]) continue;
                    if (costos[i][j] < minCostos) {
                        minCostos = costos[i][j];
                        minI = i;
                        minJ = j;
                    }
                }
            }

            
            if (minI == -1 || minJ == -1) break;

           
            int amount = Math.min(o[minI], d[minJ]);
            mn[minI][minJ] = amount;
            o[minI] -= amount;
            d[minJ] -= amount;

           
            if (o[minI] == 0) rU[minI] = true;
            if (d[minJ] == 0) cU[minJ] = true;
        }
    }
}
