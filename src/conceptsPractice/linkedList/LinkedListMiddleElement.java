package conceptsPractice.linkedList;


public class LinkedListMiddleElement {

    static public void printList(Node node) {
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    public static void main(String[] args) {
        Node node = new Node(50);
        node.next = new Node(15);
        node.next.next = new Node(4);
//        node.next.next.next=new Node(20);
//        node.next.next.next.next=new Node(1);
//        node.next.next.next.next.next=new Node(2);

        System.out.println("Values in linked list are ");
        printList(node);
        Node mid = node;
        Node counterNode = node;
        boolean isEven = true;

// when size of list is even change below code to counterNode.next!=null to print first value as mid
        while (counterNode != null) {
            counterNode = counterNode.next;
            isEven = !isEven;
            if (isEven) {
                mid = mid.next;
            }
        }
        System.out.println("value at middle node is " + mid.data);
    }
}
