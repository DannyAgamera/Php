package TreePrac;

/**
 *
 * @author Danny Agamera
 */
public class LandBinarySearchTree {
    private Node root; //setting the root node
    public LandBinarySearchTree(){
        root = null; //setting to null meaning it does not have left and right children
    }
    
    public boolean insert(Land land){
        Node n = new Node(); //creating a new node
        n.land = land; //adding data to node
        n.lc = null; //not going to have left child
        n.rc = null; // not having right child
        //root is null meaning we havent added any node or children inside the tree yet
        if(root == null){
            root = n;
            return true;
        }
        Node p = root;
        Node c = root;
        while(c != null){
            p = c;
            if(land.getLocation().compareTo(c.land.getLocation()) < 0){
                c = c.lc;
            }else{
                c = c.rc;
            }
        }
        if(land.getLocation().compareTo(p.land.getLocation()) < 0){
            p.lc = n;
        }else{
            p.rc = n;
        }
        
        return true;
    }
    
    public Node findNode(String key){
        Node c = root;
        while(c != null){
            if(key.compareTo(c.land.getLocation()) == 0){
                break;
            } if(key.compareTo(c.land.getLocation()) < 0){
                c = c.lc;
            } else {
                c = c.rc;
            }
        }
        return c;
    }
    
    public Node findParent(String key){
        Node p = root;
        Node c = root;
        do{
            if(key.compareTo(c.land.getLocation())==0){
                break;
            }
            p = c;
            if(key.compareTo(c.land.getLocation()) < 0){
                c = c.lc;
            }else{
                c = c.rc;
            }
        } while(c != null);
        System.out.println(">> " + p.land.getLocation());
        if( c!= null){
            return p;
        } else{
            return null;
        }
    }
    
    public Land getData(Node n){
        return n.land;
    }
    
    public void showAll(Node n){
        Node p = n;
        if(p != null){
            System.out.println(" " + p.land);
            showAll(p.lc);
            showAll(p.rc);
        }
    }
    
    //nested class for node
    public class Node{
        private Node lc;
        private Land land;
        private Node rc;
    }
}
