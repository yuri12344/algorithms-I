/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            if (StdRandom.bernoulli()) {
                StdOut.println(args[i]);
            }
        }
    }
}