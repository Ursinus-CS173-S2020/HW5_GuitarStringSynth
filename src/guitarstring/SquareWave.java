/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guitarstring;

/**
 *
 * @author ctralie
 */
public class SquareWave {
    public static final int FS = StdAudio.SAMPLE_RATE;
    
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
     * @param T The length of each peak or valley region
     * @param a The max/min value of the square wave
     * @param duration The length in seconds of the wave
     * @return 
     */
    public static double[] getSquareWave(int T, double a, double duration) {
        int N = (int)Math.round(duration*FS);
        double[] audio = new double[N];
        for (int i = 0; i < N; i++) {
            if (i/T %2 == 0) {
                audio[i] = a;
            }
            else {
                audio[i] = -a;
            }
        }
        return audio;
    }
    public static void main(String[] args) {
        double[] x = getSquareWave(50, 0.3, 1);
        double[] y = getSquareWave(30, 0.3, 1);
        double[] z = sumArrays(x, y);
        StdAudio.play(z);
    }
}
