package conceptsPractice.linkedList;

public class Node {
    int data;
    Node next;
   public Node (int data){
        this.data=data;
    }

    public static void traverse(Node head){
       if(head==null){
           System.out.println("Empty Linked List");
           return;
       }
        while(head != null){
            System.out.println(head.data);
            head=head.next;
        }
    }
    public static void main(String [] args){
       Node n1=new Node(10);
       Node n2=new Node(20);
       Node n3=new Node(30);
       n1.next=n2;
       n2.next=n3;
       traverse(n1);
    }


}
