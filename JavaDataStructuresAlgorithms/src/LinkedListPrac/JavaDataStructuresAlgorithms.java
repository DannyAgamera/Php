package LinkedListPrac;

/**
 *
 * @author Danny Agamera
 */

//main class
public class JavaDataStructuresAlgorithms {

    //main method
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Land land1 = new Land(0.5,"Kakamega", 300000);
        Land land2 = new Land(1.5,"Murang'a", 1500000);
        Land land3 = new Land(0.8,"Voi", 600000);
        
        LandLinkedList list = new LandLinkedList(land1);
        list.insertItem(land2);
        list.insertItem(land3);
        list.printList();
        
    }
    
}
