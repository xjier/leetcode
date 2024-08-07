/**
 * 单链表反转
 */

public class LinkNode {

    private Integer data;
    private LinkNode next;

    LinkNode(Integer data, LinkNode next) {
        this.data = data;
        this.next = next;
    }

    public static void main(String[] args) {

        LinkNode a = new LinkNode(1, null);
        LinkNode b = new LinkNode(2, a);
        LinkNode c = new LinkNode(3, b);
        LinkNode d = new LinkNode(4, c);
        LinkNode e = new LinkNode(5, d);

        LinkNode curr = e;
        while (curr != null) {
            System.out.print(curr.data + "  ");
            curr = curr.next;
        }

        System.out.println("");
        System.out.println("");
        System.out.println("反转后");
        LinkNode l = reversion(e);
        curr = l;
        while (curr != null) {
            System.out.print(curr.data + "  ");
            curr = curr.next;
        }

        System.out.println("");
        System.out.println("");
        System.out.println("再次反转后");
        l = reversion2(l);
        curr = l;
        while (curr != null) {
            System.out.print(curr.data + "  ");
            curr = curr.next;
        }

    }

    public static LinkNode reversion(LinkNode head) {
        if (head == null) {
            return null;
        }
        LinkNode pre = null, next = null;
        LinkNode current = head;
        while (current != null) {
            next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }
        return pre;
    }

    public static LinkNode reversion2(LinkNode current) {
        if (current == null || current.next == null) {
            return current;
        }
        LinkNode last = reversion2(current.next);
        current.next.next = current;
        current.next = null;
        return last;
    }
}
