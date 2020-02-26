package guitarstring;


public class GuitarString {
    public static final int FS = StdAudio.SAMPLE_RATE; // The sample rate
    
    /**
     * 
     * @param note The number of halfsteps above a 440hz A
     *              this note is
     * @return The period of that note
     */
    public static int getPeriod(int note) {
        int T = 100; // TODO: Update this
        
        return T;
    }
    
    /**
     * Fill a contiguous chunk of samples at the beginning
     * of an array with random values between -1 and 1
     * If the numSamples > arr.length, then simply fill the
     * entire array
     * @param arr An array to partially fill
     * @param numSamples The number of samples to fill
     */
    public static void fillRandomSamples(double[] arr, int numSamples) {
        // TODO: Fill this in
    }
    
    /**
     * Return an array holding the audio samples of a synthesized
     * guitar string pluck
     * @param note The number of halfsteps above 440hz A it should be
     * @param duration The duration of the array
     * @param decay The decay parameter
     * @return An array of audio samples
     */
    public static double[] getPluckedSound(int note, double duration, double decay) {
        double[] samples = {};
        // TODO: Fill this in
        return samples;
    }
    
    public static void main(String[] args) {
        // Play a chromatic progression
        for (int i = 0; i <= 24; i++) {
            StdAudio.play(getPluckedSound(i, 0.5, 0.98));
        }
    }
}
