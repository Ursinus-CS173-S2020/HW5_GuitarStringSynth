/**
 * Purpose: To generate square wave audio
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
     * @param T The period of the square wave
     * @param a The max/min value of the square wave
     * @param duration The length in seconds of the wave
     * @return 
     */
    public static double[] getSquareWave(int T, double a, double duration) {
        // Create enough samples to hold "duration" seconds of audio
        int N = (int)Math.round(duration*FS);
        double[] audio = new double[N];
        // Loop through and fill in the array with the 
        // square wave pattern that repeats every T samples
        for (int i = 0; i < N; i++) {
            if (i/(T/2) %2 == 0) {
                // The first half of the square pattern
                // is positive
                audio[i] = a;
            }
            else {
                // The second half of the square pattern
                // is negative
                audio[i] = -a;
            }
        }
        return audio;
    }
    public static void main(String[] args) {
        double[] x = getSquareWave(100, 0.3, 1);
        double[] y = getSquareWave(60, 0.3, 1);
        double[] z = ArrayUtils.sumArrays(x, y);
        StdAudio.save("SquareWave100.wav", x);
        StdAudio.save("SquareWave60.wav", y);
        StdAudio.save("2SquareWaves.wav", z);
    }
}
