package DLinkedListPrac;


/**
 *
 * @author Danny Agamera
 */
public class LandDList {
    private Node head;
    
    //constructor
    public LandDList(Land land){
        head = new Node();//instantiated Node
        head.land = land; 
        head.next = null;
        head.previous = null;
    }
    
    //method to insert  new node inside the link list
    public boolean insertItem(Land land){
        Node n = new Node(); //object n of Node 
        n.land = land; //set value to land
        n.previous = null; //set prev of new node n to null
        head.previous = n; //set the prev of original first node to new node n
        n.next = head; //set the next address to the address of the head
        head = n; //set addres of head to n
        return true;
    }
    
    public void printList(){
        Node z = head;
        while(z!=null){
            System.out.println(z.land);
            z = z.next;
        }
    }
    
    public boolean deleteItem(Land land){
        if(head.land == land){
            head = head.next;
            return true;
        }else{
            Node x = head;
            Node y = head.next;
            while(true){
                if(y == null || y.land == land){
                    break;
                } else{
                    x = y;
                    y = y.next;
                }
            }
            if(y != null){
                x.next = y.next;
                return true;
            }else{
                return false;
            }
        }
    }
    
    class Node{
        private Node previous;
        private Land land;
        private Node next;
    }
  
}
