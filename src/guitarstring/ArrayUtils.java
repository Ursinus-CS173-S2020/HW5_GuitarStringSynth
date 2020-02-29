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
}
