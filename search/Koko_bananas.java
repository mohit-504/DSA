package search;

import java.util.Arrays;

public class Koko_bananas {
    public static int minEatingSpeed(int[] piles, int h) {
        int start = 1;
        int end = Arrays.stream(piles).max().getAsInt(); // max pile size
        int k = end;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            long hours = 0;
            for (int pile : piles) {
                hours += (pile + mid - 1) / mid;  // ceiling division
            }

            if (hours <= h) {
                k = mid;         // try to minimize
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        int h=8;
        System.out.println("Minimum eating speeed needed = "+minEatingSpeed(piles, h));
    }
}
