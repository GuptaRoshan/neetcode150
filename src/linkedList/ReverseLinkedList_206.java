package linkedList;

public class ReverseLinkedList_206 {


    /**
     * Iterative approach
     *
     * @param head head of the linked list
     * @return reversed linked list
     */
    public static ListNode reverseListIterative(ListNode head) {
        ListNode previous = null;
        ListNode current = head;
        ListNode next;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    /**
     * Recursive approach
     *
     * @param head head of the linked list
     * @return reversed linked list
     */
    public static ListNode reverseListRecursive(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode newHead = reverseListRecursive(head.next);

        head.next.next = head;
        head.next = null;
        return newHead;
    }


    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        PrintLinkedList.print(head);
        PrintLinkedList.print(reverseListIterative(head));
        //PrintLinkedList.print(reverseListRecursive(head));
    }

}
