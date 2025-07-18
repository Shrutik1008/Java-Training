package DSA;

public class Stack {
    int[] stack ;
    int top;

    Stack(int size){
        stack = new int[size];
        top=-1;
    }

    void push(int n){
        if(top==stack.length){
            System.out.println("Stack is Full !!!");
            return;
        }

        top++; 
        stack[top]=n;
    }

    void pop(){
        if(top==-1){
            System.out.println("Stack is Empty !!!");
        }

        stack[top]=0;
        top--;
    }

    void peek(){
        if(top==-1){
            System.out.println("Underflow");
        }else if(top==stack.length){
            System.out.println("OverFlow");
        }else{
            System.out.println("Top Element is "+stack[top]);
        }
    }

    void display(){
        if(top==-1){
            System.out.println("Underflow");
        }else if(top==stack.length){
            System.out.println("OverFlow");
        }else{
            for(int i=top;i>=0;i--){
                System.out.print(stack[i]+" ");
            }
        }
    }
 public static void main(String[] args) {
    Stack s = new Stack(5);
    s.push(10);
    s.push(2);
    s.push(13);
    s.push(15);
    s.push(12);

    s.pop();
    s.pop();

    s.peek();
    s.display();
 }
}
