package DSA;
import java.util.*;
public class ReverseName {
    
    char[] stack;
    int top;

    ReverseName(int size){
        stack = new char[size];
        top = -1;
    }

    void push(char ch) { 
        if(top==stack.length){
            System.out.println("Stack is Full !!!");
            return;
        }
        top++; 
        stack[top]=ch;
    }

    void pop(){
        if(top==-1){
            System.out.println("Stack is Empty!!");
        }else{
            stack[top]=0;
            top--;
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
        ReverseName r = new ReverseName(10);

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
   
        for(int i=0;i<name.length();i++){
            r.push(name.charAt(i));
        }
        r.display();


        sc.close();
    }


}
