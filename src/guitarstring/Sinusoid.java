/**
 * Purpose: To Generate Sinusoidal Audio
 */
package guitarstring;

/**
 *
 * @author ctralie
 */
public class Sinusoid {
    public static final int FS = StdAudio.SAMPLE_RATE;
    
    /**
     * 
     * @param T The period of the sinusoid
     * @param a The amplitude of the sinusoid
     * @param duration The length in seconds of the wave
     * @return 
     */
    public static double[] getSinusoid(int T, double a, double duration) {
        int N = (int)Math.round(duration*FS);
        double[] audio = new double[N];
        for (int i = 0; i < N; i++) {
            audio[i] = a*Math.sin(2*Math.PI*(double)i/T);
        }
        return audio;
    }
    public static void main(String[] args) {
        double[] x = getSinusoid(100, 0.8, 1);
        double[] y = getSinusoid(60, 0.8, 1);
        StdAudio.save("Sinusoid100.wav", x);
        StdAudio.save("Sinusoid60.wav", y);
    }
}
