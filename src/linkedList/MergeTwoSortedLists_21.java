package linkedList;

public class MergeTwoSortedLists_21 {


    /**
     * Merge two sorted linked lists and return it as a sorted list. The list should be made by splicing together the nodes of the first two lists.
     * <p>
     * Iterative approach
     *
     * @param list1 head of the first list
     * @param list2 head of the second list
     * @return head of the merged list
     */
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        current.next = (list1 != null) ? list1 : list2;
        return dummy.next;
    }


    /**
     * Merge two sorted linked lists and return it as a sorted list. The list should be made by splicing together the nodes of the first two lists.
     * <p>
     * Recursive approach
     *
     * @param l1 head of the first list
     * @param l2 head of the second list
     * @return head of the merged list
     */
    public static ListNode mergeTwoListsRecursive(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val < l2.val) {
            l1.next = mergeTwoListsRecursive(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoListsRecursive(l1, l2.next);
            return l2;
        }
    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode head2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        PrintLinkedList.print(mergeTwoLists(head1, head2));

        head1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        head2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        PrintLinkedList.print(mergeTwoListsRecursive(head1, head2));
    }
}
