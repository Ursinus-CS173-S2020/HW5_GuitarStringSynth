package guitarstring;

public class AudioFiltering {
    
    /**
     * Create an array that only has samples in high energy regions.
     * This will get rid of quiet parts in the audio
     * 
     * @param x An array of audio samples
     * @param win The window to use in the filtering
     * @param cutoff The energy cutoff below which to exclude audio
     *               (between 0 and 1)
     * @return 
     */
    public static double[] filterLoudness(double[] x, int win, double cutoff) {
        double[] energy = ArrayUtils.getLocalEnergy(x, win);
        // TODO: Fill this in.  If the energy at each sample
        // is greater than a certain amount, then it should
        // make it to the filtered array.  Otherwise, it should not
        
        double[] y = {}; // TODO: This is a dummy variable
        return y;
    }
    
    /**
     * Create an array that only has samples with a low number of 
     * zero crossings within a window around them.  This will tend 
     * to get rid of consonants in the audio
     * 
     * @param x An array of audio samples
     * @param win The window to use in the filtering
     * @param maxzcs The maximum number of zero crossings allowed
     *               for a sample to make it to the final array
     * @return 
     */
    public static double[] filterZCS(double[] x, int win, int maxzcs) {
        int[] allzcs = ArrayUtils.getZeroCrossings(x, win);
        // TODO: Fill this in.  If the zero crossings at a particular
        // sample are less than a certain amount, then that sample should
        // make it to the filtered array.  Otherwise, it should not
        
        double[] y = {}; // TODO: This is a dummy variable
        return y;
    }
    
    public static void main(String[] args) {
        double[] x = StdAudio.read("femalecountdown.wav");
        //double[] y = filterLoudness(x, 100, 0.005);
        double[] y = filterZCS(x, 2000, 150);
        System.out.print("Original length " + x.length);
        System.out.println(", filtered down to " + y.length + " samples");
        StdAudio.play(y);
    }
}
