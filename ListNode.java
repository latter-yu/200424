import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {
    public ListNode middleNode(ListNode head) {
        //返回链表的中间节点
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public ListNode reverseList1(ListNode head) {
        //反转链表
        //逆置链表超出时间限制
        ListNode node = new ListNode(-1);
        ListNode cur = head;
        ListNode prev = node;
        prev.next = head;

        while(cur.next != null) {
            cur = cur.next;
            prev = prev. next;
        }
        ListNode newHead = cur;
        //逆置
        while(prev != node) {
            cur.next = prev;
            cur = cur.next;
            prev = prev.next;
        }
        return newHead;
    }
    public ListNode reverseList(ListNode head) {
        //反转链表
        ListNode cur = head;
        ListNode prev = null;
        while(cur != null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }

    public ListNode removeElements(ListNode head, int val) {
        //删除链表中等于给定值 val 的所有节点
        ListNode node = new ListNode(-1);
        ListNode cur = node;
        cur.next = head;
        while(cur.next != null ) {
            if(cur.next.val == val) {
                cur.next = cur.next.next;
            }else {
                cur = cur.next;
            }
        }
        return node.next;
    }

    public class A<T> {
        T value;

        A(T value) {
            value = this.value;
        }

        T get() {
            return value;
        }
    }

    public static void main(String[] args) {
        //使用 A 这个泛型类
        Collection<A> collection = new ArrayList<>();
        System.out.println(collection);

        //实现ArrayList 类
        Collection<String> collection1 = new ArrayList<>();
        //实现 LinkedList 类
        List<Integer[]> array = new LinkedList<>();
    }
}