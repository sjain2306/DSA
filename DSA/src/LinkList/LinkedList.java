package LinkList;

class Node{
    int data;
    Node next;

    Node(int data)
    {
        this.data =data;
        this.next = null;
    }
}

public class LinkedList {

    Node head=null;
    public void add(int data){
        Node newNode= new Node(data);
        Node current =head;
        if(head==null)
        {
            head= newNode;
        }
        else
        {
            while(current.next!=null)
            {
                current = current.next;
            }
            current.next=newNode;
        }

    }
    public void delete(int data)
    {
        Node current =  head;
        if(head.data==data)
        {
            head=head.next;
        }
        else {
            while (current.next!= null && current.next.data!=data) {
                current=current.next;
                }
            }
        if (current.next!=null) {
            current.next = current.next.next;
        }
    }
    public void addFirst(int data)
    {
        Node newnode= new Node(data);
       // newnode.data=data;
        newnode.next=head;
        head =newnode;
    }
    public void show()
    {
        Node current = head;
        while(current!=null)
        {
            System.out.println(current.data);
            current=current.next;
        }
    }
}
