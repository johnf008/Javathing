//name: programmerJohn
//pgm desc: demonstrates implementing/creating and using a stack data structure

class Stack{

    //store elements of a stack
    private int arr[];

    private int top; //represents top of the stack

    private int capacity;   //total capacity of the stock

    //creating the stack
    Stack(int size){
        //initialize array and stack variables

        arr = new int[size];
        capacity = size;
        top = -1;
    }

    //push elements on top of the stack
    public void push(int x){
        if (isFull()){
            System.out.println("Stack OverFlow");

            System.exit(1);  //terminates the program
        }
        //insert element value on top of stack
        System.out.println("Inserting " + x);
        arr[++top] = x;
    }

    //pop off elements from top of the stack
    public int pop(){
        //if stack is empty, no elements to pop off
        if(isEmpty()){
            System.out.println("Stack is Empty");

            System.exit(1);   //terminate the program
        }

        //pop off element from top of stack
        return arr[top--];
    }

    //return size of the stack
    public int getSize(){ return top + 1;}

    //check if stack is empty
    public Boolean isEmpty(){
        return top == -1;  //make comparison then send boolean result
    }
    //check if stack is full
    public Boolean isFull(){ return top == capacity - 1;} //make comparison then send boolean result

    //display stack elements
    public void printStack() {
        for( int i = 0; i <= top; i++){
            System.out.print(arr[i] + ", ");
        }
    }
}
public class java134StackImplementation {
    public static void main(String[] args){
        Stack stack = new Stack(5);

        stack.push(214);
        stack.push(713);
        stack.push(956);
        stack.push(817);
        stack.push(281);

        System.out.println("Stack: ");
        stack.printStack();

        //remove last element from stack

        stack.pop();
        System.out.println("\n STACK After popping out an element");
        stack.printStack();

        int element = stack.pop();

        System.out.println("The element last removed is " + element);

        stack.printStack();
    }
}
