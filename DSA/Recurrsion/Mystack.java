//UNDERFLOW CONDITION ----> -1      no element present in stack (POP)
//OVERFLOW  CONDITION ---->         EXCIDE THE LIMIT OF ARRAY   (PUSH)

public class Mystack {
     int a[];
     int top;
     int capacity;
      Mystack(int capacity){
        this.capacity = capacity;
        top=-1;
        a=new int[capacity];
      }
    void push(int data){
        if(top==capacity-1){
            System.out.println("OVERFLOW");
            return;
        }
        top++;
        a[top]=data;
    }
    int pop(){
        if(top==-1){
            System.out.println("UNDERFLOW");
            return 0;
        }
        int del = a[top];
        top--;
        return del;
    }
    int peek(){
       if(top==-1){
        System.out.println("UNDERFLOW");
        return 0;
       }
      
        return a[top];
    }
    void Display(){
        for(int i=top; i>=0;i--){
            System.out.println(a[i]+ "  ");
        }
    }
    public static void main(String[] args) {
        Mystack mystack = new Mystack(3);
        mystack.push(33);
        mystack.push(66);
        mystack.pop();
        mystack.Display();
    }
}
