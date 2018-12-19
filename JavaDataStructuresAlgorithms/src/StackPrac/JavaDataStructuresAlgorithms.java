package StackPrac;


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
        Land land1 = new Land(0.5,"Nakuru",300000);
        Land land2 = new Land(2,"Kitale",1400000);
        Land land3 = new Land(0.8,"Kajiado",400000); //pushed last so will be displayed first
        
        LandStack landStack = new LandStack();
        landStack.push(land1);
        landStack.push(land2);
        landStack.push(land3);
        
        System.out.println("Displaying using pop and toString methods");
        System.out.println("-----------------------------------------");
        
        System.out.println(landStack.pop().toString()); //last pushed item displayed first
        System.out.println(landStack.pop().toString());
        System.out.println(landStack.pop().toString());
    }
    
}
