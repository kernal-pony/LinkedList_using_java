/*
 * Take elements(numbers in the range of 1-50) of a Linked List as input from the user. 
 * Delete all nodes which have values greater than 25.
 */


public class LinkList_HW_2 
{
    Node head;
    int size;
    static int count;
 
    LinkList_HW_2 () // constructor of linkedlist class
    {
        size = 0;
        count=0;
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
 

    public void popItems()
    {
     
        if(head == null) {
            System.out.println("Empty List, nothing to pop!");
            return ;
        }
        Node currNode = head;
        
        
        Node lastNode =head.next;
        
        while(lastNode != null)
        {
            
            if(lastNode.data >= 25)
            {
                
                //System.out.println("The element popped now -->"+ lastNode.data);
                currNode.next =lastNode.next;
            }
            
            lastNode= lastNode.next;
            currNode= currNode.next;
         
        }
            

    }
    public void count_GreaterThan25()
    {
        
        if(head == null) {
            System.out.println("Empty List, nothing to count!");
            return ;
        }
        Node currNode = head;
        
        while(currNode!= null)
        {
          
            if(currNode.data >=25)
            {
                count++;
           
        }
            currNode =currNode.next;
            
        }
  
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

    public static void main(String args[]) 
    {
        


        LinkList_HW_2 list = new LinkList_HW_2();
        
        
        
        list.addLast(1);
        list.addLast(2); 
        list.addLast(3);

       
        list.addLast(4);
        list.addLast(26);

        
        list.addLast(27);
        list.addLast(30);
        list.addLast(33);
        list.addLast(34);
        list.addLast(55);
        list.addLast(60);
        list.addLast(23);
        list.addLast(22);
        
        list.count_GreaterThan25();
       //list.popItems();
        for(int i=1;i<=count;i++)
        {
            list.popItems();
        }

        
        list.printList();

}
}
