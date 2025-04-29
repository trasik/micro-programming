import problems.AddTwoNumbers;
import problems.MergeStringsAlternately;
import problems.PalindromeNumber;
import problems.TwoSum;
import problems.util.ListNode;

import java.util.Arrays;

public class Driver {

    public static void main(String[] args) {
        testMergeStringsAlternately();
        testTwoSum();
        testAddTwoNumbers();
        testPalindromeNumber();
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

    private static void testAddTwoNumbers() {
        ListNode atn1a = new ListNode(2);
        atn1a.next = new ListNode(4);
        atn1a.next.next = new ListNode(3);

        ListNode atn1b = new ListNode(5);
        atn1b.next = new ListNode(6);
        atn1b.next.next = new ListNode(4);

        ListNode atn2a = new ListNode(0);
        ListNode atn2b = new ListNode(0);

        AddTwoNumbers atn1 = new AddTwoNumbers(atn1a, atn1b);
        AddTwoNumbers atn2 = new AddTwoNumbers(atn2a, atn2b);

        System.out.println("2. Add Two Numbers \n");
        System.out.println("Example 1: \n");
        System.out.println(atn1);
        ListNode result1 = atn1.solve();
        System.out.println("Result:");
        System.out.println(atn1.printList(result1));
        System.out.println();

        System.out.println("Example 2: \n");
        System.out.println(atn2);
        ListNode result2 = atn2.solve();
        System.out.println("Result:");
        System.out.println(atn1.printList(result2));
        System.out.println();
    }

    private static void testPalindromeNumber() {
        PalindromeNumber pn1 = new PalindromeNumber(121);
        PalindromeNumber pn2 = new PalindromeNumber(-121);
        PalindromeNumber pn3 = new PalindromeNumber(10);

        System.out.println("9. Palindrome Number \n");
        System.out.println("Example 1: \n");
        System.out.println(pn1);
        System.out.println(pn1.solve());
        System.out.println();

        System.out.println("Example 2: \n");
        System.out.println(pn2);
        System.out.println(pn2.solve());
        System.out.println();

        System.out.println("Example 3: \n");
        System.out.println(pn3);
        System.out.println(pn3.solve());
        System.out.println();
    }

}
