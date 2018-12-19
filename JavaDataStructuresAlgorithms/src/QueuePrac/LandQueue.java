package QueuePrac;

/**
 *
 * @author Danny Agamera
 */
public class LandQueue {
    private Land[] q; //array q with type of class Land
    private int size; //size of the array
    private int total; //total number of the elemnts int the array
    private int front;
    private int rear;
    
    //default constructor
    public LandQueue(){
        size = 50; //size set 
        total = 0;
        front = 0;
        rear = 0;
        q = new Land[size]; //array with the size
    }
    
    //constuctor with one parameter
    public LandQueue(int size){
        this.size = 50; 
        total = 0;
        front = 0;
        rear = 0;
        q = new Land[size]; //array with the size
    }
    
    public boolean enqueue (Land land){
        if(isFull()){
            return false;
        }else{
            total++;
            q[rear] = land;
        rear = (rear + 1) % size;
            return true;        }
    }
    
    public Land dequeue(){
        Land land = q[front];
        total--;
        front = (front + 1)% size;
        return land;
    }
    
    //method to check if the queue is full
    public boolean isFull(){
        if(size == total){
            return true;
        }else{
            return false;
        }
    }
    
    //method to display
    public void displayAll(){
        int start = front;
        if(total != 0){
            for(int i = 0; i < total; i++){
                System.out.println(" :-> " + q[start].toString());
                start = (start+1) % size;
            }
        }
    }
    
}
