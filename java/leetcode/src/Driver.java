import problems.MergeStringsAlternately;
import problems.TwoSum;

import java.util.Arrays;

public class Driver {

    public static void main(String[] args) {
        testMergeStringsAlternately();
        testTwoSum();
    }

    private static void testMergeStringsAlternately() {
        MergeStringsAlternately msa1 = new MergeStringsAlternately("abc", "pqr");
        MergeStringsAlternately msa2 = new MergeStringsAlternately("ab", "pqrs");
        MergeStringsAlternately msa3 = new MergeStringsAlternately("abcd", "pq");

        System.out.println("1768. Merge Strings Alternately \n");
        System.out.println("Example 1: \n");
        System.out.println(msa1);
        System.out.println(msa1.solve());
        System.out.println();

        System.out.println("Example 2: \n");
        System.out.println(msa2);
        System.out.println(msa2.solve());
        System.out.println();

        System.out.println("Example 3: \n");
        System.out.println(msa3);
        System.out.println(msa3.solve());
        System.out.println();
    }

    private static void testTwoSum() {
        TwoSum ts1 = new TwoSum(new int[]{2,7,11,15}, 9);
        TwoSum ts2 = new TwoSum(new int[]{3,2,4}, 6);
        TwoSum ts3 = new TwoSum(new int[]{3,3}, 6);

        System.out.println("1. Two Sum \n");
        System.out.println("Example 1: \n");
        System.out.println(ts1);
        System.out.println(Arrays.toString(ts1.solve()));
        System.out.println();

        System.out.println("Example 2: \n");
        System.out.println(ts2);
        System.out.println(Arrays.toString(ts2.solve()));
        System.out.println();

        System.out.println("Example 3: \n");
        System.out.println(ts3);
        System.out.println(Arrays.toString(ts3.solve()));
        System.out.println();
    }

}
