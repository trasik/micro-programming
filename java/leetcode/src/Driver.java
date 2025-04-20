import problems.MergeStringsAlternately;

public class Driver {

    public static void main(String[] args) {
        testMergeStringsAlternately();
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

}
