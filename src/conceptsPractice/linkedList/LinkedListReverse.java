package conceptsPractice.linkedList;

public class LinkedListReverse {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    void printList(Node head){
        while(head !=null){
            System.out.println(head.data);
            head=head.next;
        }
    }

    Node reverse(Node node){
        Node head = node;
        Node prev=node;
        Node current = node.next;
        while (current !=null) {
            if (current.next!=null) {
                prev.next = current.next;
            }else{
                prev.next=null;
            }
            current.next=head;
            head=current;
            current =prev.next;
        }
        return head;
    }

    public static void main(String[] args){
        LinkedListReverse list = new LinkedListReverse();
        Node head = list. new Node(85);
        head.next = list.new Node(15);
        head.next.next = list.new Node(4);
        head.next.next.next = list.new Node(20);

        System.out.println("Given linked list");
        list.printList(head);

        head = list.reverse(head);
        System.out.println("Reversed linked list");
        list.printList(head);
    }
}
