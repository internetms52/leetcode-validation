package hobby.internetms52.leetcode.definition;

public class ListNode implements Comparable<ListNode> {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public int compareTo(ListNode o) {
        if (val == o.val) {
            if (next != null && o.next != null) {
                return next.compareTo(o.next);
            }
            if (next == null && o.next == null) {
                return 0;
            }
        }
        return -1;
    }
}
