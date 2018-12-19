package StackPrac;

/**
 *
 * @author Danny Agamera
 */
public class LandStack {
    private Land [] landstack;
    private int top; //the last input value
    private int size; //total length of the stack array
    
    //default constructor
    public LandStack(){
        top = -1; //array start at 0
        size = 50;
        landstack = new Land[50];
    }
    
    //constructor with one parameter
    public LandStack(int size){
        top = -1;
        this.size = size;
        landstack = new Land[this.size];
    }
    
    //push method
    public boolean push(Land land){
        if(!isFull()){
            top++;
            landstack[top] = land;
            return true;
        }else{
            return false;
        }
    }
    
    //pop method
    public Land pop(){
        return landstack[top--];
    }
    
    //method to check if the stack is empty
    public boolean isEmpty(){
        return(top == -1);
    }
    
    //method to check if the stack is full
    public boolean isFull(){
        return(top == landstack.length -1);
    }
    
}
