import edu.princeton.cs.algs4.*;

/**
 * Created by Lukasz Koziarski (cph-lk139) on 09/03/2017.
 */
public class DoublingTest {
    private static final int MAXIMUM_INTEGER = 1000000;

    // This class should not be instantiated.
    private DoublingTest() { }

    /**
     * Returns the amount of time to call Selection.sort() or InsertionX.sort() or MergeX.sort() with <em>n</em>
     * random 6-digit integers.
     * @param n the number of integers
     * @return amount of time (in seconds) to call 3 mentioned sort algorithms
     *   with <em>n</em> random 6-digit integers
     */
    public static double timeTrial(int n) {
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = StdRandom.uniform(-MAXIMUM_INTEGER, MAXIMUM_INTEGER);
        }
        Stopwatch timer = new Stopwatch();
//        Selection.sort(a);
//        InsertionX.sort(a);
        MergeX.sort(a);
        return timer.elapsedTime();
    }


    /**
     * Prints table of running times to call Selection.sort() or InsertionX.sort() or MergeX.sort()
     * for array of size 1000.
     */
    public static void main(String[] args) {
        for (int n = 1000; true; n += n) {
            double time = timeTrial(n);
            StdOut.printf("%7d %7.1f\n", n, time);
        }
    }
}