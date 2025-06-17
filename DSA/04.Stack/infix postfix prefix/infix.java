import java.util.*;
class infix{
    public static void main(String[] args) {
    Stack<Integer> st = new Stack<Integer>();
    Stack<Character> op = new Stack<>();
    String str = "9*4+1/8";
    for(int i = 0; i <str.length();i++){
        char ch=str.charAt(i);
        int ascii=(int)ch;
        if(ascii>=48 && ascii<=57) st.push(ascii-48);
        else if(op.isEmpty()) op.push(ch);
        else{
            if(ch=='-'||ch=='+'){
              int val2=st.pop();
              int val1=st.pop();
              if(op.peek()=='+') st.push(val1+val2);
              if(op.peek()=='-') st.push(val1-val2);
              if(op.peek()=='*') st.push(val1*val2);
              if(op.peek()=='/') st.push(val1/val2);
              op.pop();
              op.push(ch);
            }
            if(ch=='*'||ch=='/'){
            if(op.peek()=='*'|| op.peek()=='/'){
              int val2=st.pop();
              int val1=st.pop();
              if(op.peek()=='*') st.push(val1*val2);
              if(op.peek()=='/') st.push(val1/val2);
              op.pop();
              op.push(ch);
              }else op.push(ch);
            }
        } 
    }
    while (st.size()>1) {
              int val2=st.pop();
              int val1=st.pop();
              if(op.peek()=='+') st.push(val1+val2);
              if(op.peek()=='-') st.push(val1-val2);
              if(op.peek()=='*') st.push(val1*val2);
              if(op.peek()=='/') st.push(val1/val2);
              op.pop();
    }
     System.out.println(st.peek()); 
    }
}