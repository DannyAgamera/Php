package QueuePrac;


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
        
        Land land1 = new Land(1, "Nairobi", 500000);
        Land land2 = new Land(1.5, "Mombasa", 650000);
        Land land3 = new Land(3, "Kisumu", 950000);
        
        LandQueue land = new LandQueue();
        land.enqueue(land1);
        land.enqueue(land2);
        land.enqueue(land3);
        
        System.out.println("*******");
        System.out.println("enqueue");
        land.displayAll();
        
        System.out.println("*******");
        System.out.println("dequeue");
        land.dequeue();
        land.displayAll();
    }
    
}
