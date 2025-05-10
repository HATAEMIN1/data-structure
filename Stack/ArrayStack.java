package Stack;

public class ArrayStack {
    int[] stack;
    int top;

    public ArrayStack(int capacity){
        stack = new int[capacity];
        top=-1;
    }
    void push(int value){
        stack[++top] = value;
    }

    int pop(){
        return stack[top--];
    }
}
