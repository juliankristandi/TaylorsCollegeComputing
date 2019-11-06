
/**
 * Assignment 2 (Computing)
 * 
 * Proceed as per the assignment's instructions
 * 
 */
 
import java.util.Random;

public class Speed {
    private static final int NSPEED = 125;
    private static final double mean = 65.0;
    private static final double std = 15.0;

    /**
     * Returns an array of NSPEED integer speed approximately normally distributed,
     * with specified mean (mean) and standard deviation (std),
     * and with values outside 0..100 removed.
     * @return the array of marks.
     */
    public static int[] getSpeed() {
        Random rand = new Random(1001L);
        int speed;
        int[] theSpeed = new int[NSPEED];
        int n = 0;
        while (n < NSPEED) {
            speed = (int) Math.round(std*rand.nextGaussian() + mean);
            if (speed >= 0 && speed <= 100)
                theSpeed[n++] = speed;
        }
        return theSpeed;
    }
}