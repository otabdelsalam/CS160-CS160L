public class Linked {
    private Node head;
    private Node tail;
    private int size;

    public Linked()
    {

    }

    public void insertFirst(int val)
    {
        Node newNode = new Node(val);
        if(this.head == null)
        {
            this.head = newNode;
            this.tail = newNode;
        }
        else if(this.head.next == null)
        {
            this.tail = head;
            newNode.next = this.head;
            this.head = newNode;
            return;
        }
        else{
            newNode.next = this.head;
            this.head = newNode;
        }
        size++;
    }

    public void insertLast(int val)
    {
        Node newNode = new Node(val);
        if(this.tail == null)
        {
            this.insertFirst(val);
        }
        else{
            tail.next = newNode;
            tail = tail.next;
        }
        size++;
    }

    public void deleteFirst() {
        if (this.head == null)
            return;
        this.head = this.head.next;
        size--;
    }

    public void delete(int index)
    {

        size--;
    }

    public void printAll(){

    }

    public void update(int index, int val)
    {


    }

    public int size()
    {
        return size;
    }

    public void clear()
    {

    }
}
