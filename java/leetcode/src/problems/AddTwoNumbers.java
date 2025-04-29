package problems;

import problems.util.ListNode;

public class AddTwoNumbers {

    private ListNode l1;
    private ListNode l2;

    public AddTwoNumbers(ListNode l1, ListNode l2) {
        this.l1 = l1;
        this.l2 = l2;
    }

    public ListNode solve() {
        ListNode result = new ListNode(0);
        ListNode current = result;
        int carry = 0;

        while(l1 != null || l2 != null || carry != 0) {
            int sum = 0;

            if(l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if(l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            sum += carry;
            carry = sum / 10;

            current.next = new ListNode(sum % 10);
            current = current.next;
        }

        return result.next;
    }

    public String printList(ListNode node) {
        StringBuilder list = new StringBuilder("[");

        while(node != null) {
            list.append(node.val);
            if(node.next != null) list.append(",");
            node = node.next;
        }

        list.append("]");
        return list.toString();
    }

    @Override
    public String toString() {
        return "ListNode 1: \n" +
                printList(l1) +
                "\nListNode 2: \n" +
                printList(l2);
    }
}
