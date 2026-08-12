package StriverSheet.LinkedList;

class PNode{
    int data;
    PNode next;

    PNode(int data){
        this.data = data;
        this.next = null;
    }
}
class implement{
    PNode head = null;
    PNode temp;
    void creation(int data){
        PNode new_node = new PNode(data);
        if(head==null){
            head = new_node;
            return;
        }
        temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = new_node;
    }

    void display(PNode head){
        temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }System.out.println();
    }

    boolean isPalindrome(PNode head){
        PNode first = head,second = reverse(head);
        while (first!=null && second!=null){
            if(first.data != second.data){
                return false;
            }
            first = first.next;
            second = second.next;
        }
        return true;
    }

    static PNode reverse(PNode head){
        PNode prev = null,temp=middleElement(head);
        while (temp!=null){
            PNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }

    static PNode middleElement(PNode head){
        PNode slow = head,fast = head;
        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
public class PalindromeList {
    public static void main(String[] args) {
        implement i = new implement();
        int[] arr = {1,2,3,4,1};
        for(int ii:arr) {
            i.creation(ii);
        }
        i.display(i.head);
        System.out.println(i.isPalindrome(i.head));
    }
}
