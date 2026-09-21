import java.util.*;

public class LinkedList {

    public static Node deleteAtTheBeginning(Node head) {
        if(head == null)
        {
            return null;
        }
        return head.next;
    }

    public static Node deleteLast(Node head){
        if(head == null)
        {
            return null;
        }
        if(head.next == null)
        {
            return null;
        }
        Node dummy = head;
        while(dummy.next.next != null)
        {
            dummy = dummy.next;
        }
        dummy.next = null;
        return head;
    }

    public static Node insertAtTheBeginning(Node head, int val){
        if(head == null)
        {
            return new Node(val);
        }
        else{
            Node newNode = new Node(val);
            newNode.next = head;
            return newNode;
        }
    }

    public static Node insertAtTheEnd(Node head, int data) {
        Node newNode = new Node(data);

        if(head == null) {
            return newNode;
        }
        Node dummy = head;
        while(dummy.next != null){
            dummy = dummy.next;
        }
        dummy.next = newNode;
        return head;
    }

    public static Node insertNodeAtIndex(Node head, int index, int val) throws ArrayIndexOutOfBoundsException {
        if(index == 0)
        {
            return insertAtTheBeginning(head, val);
        }
        Node dummy = head;
        for(int i = 0; i < index-1; i++)
        {
            dummy = dummy.next;
            if(dummy == null)
            {
                throw new ArrayIndexOutOfBoundsException("Linked list does not extend to index " + index);
            }
        }
        insertAfter(dummy,val);
        return head;
    }

    public static void insertAfter(Node prevNode, int val) {
        Node newNode = new Node(val);

        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    public static void printAllNodes(Node head) {
        Node dummy = head;
        while(dummy != null) {
            System.out.print(dummy.data + " ");
            dummy = dummy.next;
        }
    }

    public static void main(String[] args) {
        Linked myLink = new Linked();
    }

}