package guitarstring;
// The three imports below are for the extra credit
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class GuitarString {
    public static final int FS = StdAudio.SAMPLE_RATE; // The sample rate
    
    /**
     * 
     * @param halfstep The number of halfsteps above a 440hz A
     *                 this note is.
     *                 NOTE: This also be negative, in which case
     *                 the note will be below concert A
     * @return The period of that note
     */
    public static int getPeriod(int halfstep) {
        int T = 100; // TODO: Update this based on note
        
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
     * @param halfstep The number of halfsteps above 440hz A it should be
     * @param duration The duration of the array
     * @param decay The decay parameter (a number between 0.0 and 1.0)
     * @return An array of audio samples
     */
    public static double[] getPluckedSound(int halfstep, double duration, double decay) {
        double[] samples = {};
        // TODO: Fill this in
        return samples;
    }
    
    /**
     * EXTRA CREDIT: Open up a text file that has on each line
     *               halfstep,duration,decay
     *               And play each line one by one
     * @param filename A path to the file that should be played
     */
    public static void playFile(String filename) {
        File inputFile = new File(filename);
        Scanner in;
        try {
            in = new Scanner(inputFile);
            while (in.hasNextLine()) {
                String line = in.nextLine();
                // TODO: Fill this in
            }
        }
        catch (FileNotFoundException exception) {
            System.out.println(filename + " not found!");
        }
    }
    
    /**
     * Play two octaves of a chromatic progression 
     * starting at a concert A
     */
    public static void playChromaticProgression() {
        for (int i = 0; i < 24; i++) {
            StdAudio.play(getPluckedSound(i, 0.5, 0.98));
        }
    }
    
    /**
     * Fill an array with one second of noise, play it,
     * and then save it to the file "noise.wav"
     */
    public static void playNoise() {
        double[] samples = new double[FS];
        fillRandomSamples(samples, FS);
        StdAudio.play(samples);
        StdAudio.save("noise.wav", samples);
    }
    
    public static void main(String[] args) {
        playChromaticProgression();
    }
}
