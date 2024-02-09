import java.util.Scanner;
class Node{

    int data;
    Node next;
}

public class linkedlist {

    static Node head=null;

    public static Node createNode(int item) {

        Node newNode=new Node();
        newNode.data=item;
        newNode.next=null;
        return newNode;

    }


    public static Node insertNode() {

        int item;
        Scanner sc=new Scanner(System.in);
        item=sc.nextInt();

        if(head==null)
        {
            head=createNode(item);
            return head;
        }
        else {
            Node temp=head;
            while(temp.next!=null)//traverses till last node
                temp=temp.next;

            Node newNode =createNode(item);
            temp.next=newNode;
            return temp;
        }




    }

    public static Node insertNodeAtPos(int pos) {
        int i=1;
        if(head==null) {
            System.out.println("no linked list");
            return null;
        }
        else {
            Node temp=head;

            System.out.println(temp.data);
            while(i<pos-1) {
                temp=temp.next;
                i++;
            }
            int item;
            Scanner sc=new Scanner(System.in);
            item=sc.nextInt();
            Node newNode=createNode(item);
            newNode.next=temp.next;
            temp.next=newNode;

            System.out.println("node inserted");

            return temp;

        }
    }

    public static void display() {

        Node temp=head;
        while(temp!=null) {
            System.out.print(temp.data+"--->");
            temp=temp.next;
        }
    }


    public static void main(String[] args) {

        insertNode();
        insertNode();
        insertNode();
        display();
        System.out.println("After inserting element at given position");
        insertNodeAtPos(3);
        display();


    }
    }

