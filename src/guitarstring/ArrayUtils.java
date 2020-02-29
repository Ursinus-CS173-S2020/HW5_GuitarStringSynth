/**
 * Some array processing methods we worked on in class
 */
package guitarstring;


public class ArrayUtils {
    /**
     * 
     * @param x An array of length N
     * @param y Another array of length N
     * @return An array which holds the element by element
     *         sum of x and y
     */
    public static double[] sumArrays(double[] x, double[] y) {
        double[] z = {};
        if (x.length != y.length) {
            System.out.println("ERROR: Arrays should be same length");
        } 
        else {
            z = new double[x.length];
            int i;
            for (i = 0; i < z.length; i++) {
                z[i] = x[i] + y[i];
            }
        }
        return z;
    }
    
    /**
     * 
     * @param x An array of N samples
     * @return An array of N-1 samples, where each sample is the
     *         average of each pair of adjacent samples in x
     */
    public static double[] getAvgAdjacent(double[] x, double decay) {
        double[] y = new double[x.length-1];
        for (int i = 0; i < y.length; i++) {
            y[i] = 0.5*(x[i] + x[i+1]);
        }
        return y;
    }
    
    /**
     * 
     * @param x An array of N audio samples
     * @param win Half the length of a window
     * @return An array returning the mean energy at each sample 
     *         in a window
     */
    public static double[] getLocalEnergy(double[] x, int win) {
        int N = x.length;
        double[] energy = new double[N];
        for (int i = 0; i < N; i++) {
            int start = (int)Math.max(i-win, 0);
            int end = (int)Math.min(N-1, i+win);
            double ei = 0.0;
            for (int j = start; j <= end; j++) {
                ei += x[j]*x[j];
            }
            energy[i] = ei/(end-start+1);
        }
        return energy;
    }
    
    /**
     * Count the number of zero crossings in a window
     * around each sample
     * 
     * @param x An array of N audio samples
     * @param win Half the length of a window in which to count
     *            zero crossings
     * @return An array returning number of zero crossings in
     *         each window
     */
    public static int[] getZeroCrossings(double[] x, int win) {
        int N = x.length;
        int[] zcs = new int[N];
        for (int i = 0; i < N; i++) {
            int start = (int)Math.max(i-win, 0);
            int end = (int)Math.min(N-1, i+win);
            int zcsi = 0;
            for (int j = start; j < end; j++) {
                if (x[j+1] > 0 && x[j] < 0) {
                    zcsi++;
                }
                if (x[j+1] < 0 && x[j] > 0) {
                    zcsi++;
                }
            }
            zcs[i] = zcsi;
        }
        return zcs;
    }
}
