package StriverSheet.LinkedList;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class implementation{
    Node head = null;
    Node temp;
    void creation(int data){
        Node new_node = new Node(data);
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

    void display(Node head){
        temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }System.out.println();
    }

    int middleElement(Node head){
        Node slow = head,fast = head;
        while (fast.next!=null && fast!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
    Node reverseLList(Node head){
        Node prev = null, temp = head;
        while(temp!=null){
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
}
public class FindMiddleElement {
    public static void main(String[] args) {
       implementation i = new implementation();
       int[] arr = {1,2,3,4,5};
       for(int ii:arr) {
           i.creation(ii);
       }
       i.display(i.head);
       System.out.println(i.middleElement(i.head));
       Node new_head = i.reverseLList(i.head);
       i.display(new_head);
    }
}
