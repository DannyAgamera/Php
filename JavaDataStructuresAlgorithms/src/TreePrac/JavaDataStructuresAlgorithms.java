package TreePrac;


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
        Land land1 = new Land(1,"Nairobi",1000000);
        Land land2 = new Land(1.5,"Kayole",1500000);
        Land land3 = new Land(1.2,"Meru",800000);
        Land land4 = new Land(0.7,"Nyeri",1000000);
        
        LandBinarySearchTree lbst = new LandBinarySearchTree();
        lbst.insert(land1);
        lbst.insert(land2);
        lbst.insert(land3);
        lbst.insert(land4);
        
        lbst.showAll(lbst.findNode("Nyeri"));
        Land land = lbst.getData(lbst.findParent("Meru"));
        System.out.println(land.toString());
        
    }
    
}
