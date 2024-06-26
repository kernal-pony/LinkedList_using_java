/*
 * Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3). Search for the number 7 & display its index.
 */



public class LinkedList_hw_1
{
    
    
    Node head;
    int size;
    int count_index;
 
    LinkedList_hw_1 () // constructor of linkedlist class
    {
        size = 0;
        count_index=1;
    }
 
 
    public class Node // similar to struc in c++
    {
        int data; // string type data>>  can be any type
        Node next;
 
 
        Node(int  data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }
 
 
    public void addFirst(int data) {
        Node newNode = new Node(data); // obj node creating of node class
        newNode.next = head;
        head = newNode;
    }
 
 
    public void addLast(int data) {
        Node newNode = new Node(data); // creating new node everytime
 
 
        if(head == null) {
            head = newNode;
            return;
        }
 
 
        Node currNode = head;
        while(currNode.next != null) {
            currNode = currNode.next;
        }
 
 
        currNode.next = newNode;
    }
 
 
    public void printList() {
        Node currNode = head; // for traversing in linkedList without distbing the starting head or 1st list
 
 
        while(currNode != null) {
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
 
 
        System.out.println("null");
    }
 
 
   
 
    public int getSize() {
        return size;
    }
  
    public void printIndex( int elementt)
    {
        if(head == null) {
            System.out.println("Empty List, nothing to search");
            return ;
        }
        Node currNode = head;

        
        while(currNode != null && currNode.data!= elementt)
        {
            currNode = currNode.next;
           count_index++;
        }

        System.out.println("The searched element is found at-->"+count_index);

    }
 
 
    public static void main(String args[]) 
    {
        


        LinkedList_hw_1 list = new LinkedList_hw_1();
        
        
        
        list.addFirst(5);
        list.addLast(334);
        list.addLast(3);

       
        list.addLast(7);
        list.addLast(8);
        list.addLast(2);
        list.addLast(3);
        list.addLast(10);

        list.printList();
        
        list.printIndex(334);
 
       
        System.out.println(list.getSize()); 
}
}