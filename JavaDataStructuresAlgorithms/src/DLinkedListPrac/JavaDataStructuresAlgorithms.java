package DLinkedListPrac;

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
        Land land1 = new Land(0.5,"Kajiado",250000);
        
        LandDList list = new LandDList(land1);
        list.insertItem(land1);
        list.printList();
        System.out.println("* ----- *");
        list.deleteItem(land1);
        list.printList();
    }
    
}
