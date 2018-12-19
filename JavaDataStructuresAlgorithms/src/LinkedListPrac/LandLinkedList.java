package LinkedListPrac;

/**
 *
 * @author Danny Agamera
 */
public class LandLinkedList {
    
    private Node head;
    
    //constructor with one parameter
    public LandLinkedList(Land land){
        head = new Node();//instantiated Node
        head.land = land;
        head.link = null;
    }
    //constructor
    public LandLinkedList(){
        head = new Node();//instantiated Node
        head.land = null; //no value
        head.link = null;
    }
    
    //function to insert  new node inside the link list
    public boolean insertItem(Land land){
        Node n = new Node();
            
        Node new_node;
        new_node = head; //taking the address from head
        while(new_node.link != null){
            new_node = new_node.link; //while the link is not null keep on iterating
        }
        n.land = land; //item in the node n
        n.link = null; //address is set to null
        new_node.link = n; //storing the adres of n in the link of last node
        return true;
    }
    
    public void printList(){
        Node z = head;
        while(z!=null){
            System.out.println(z.land.toString());
            z = z.link;
        }
    }
    
    public boolean deleteItem(String location){
        if(location.equals(head.land.getLocation())){
            head.link = head.link.link;
            return true;
        }else{
            Node x = head;
            Node y = head.link;
            while((y == null) && (y.land.getLocation().equals(location))){
                x = y;
                y = y.link;
            }
            if(y != null){
                x.link = y.link;
                return true;
            }else{
                return false;
            }
        }
    }
    
    //nested class Node with two instances one of class Land and another of class Node
    class Node{
        private Land land;
        private Node link;
    }
}
