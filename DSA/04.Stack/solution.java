import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
             if (stack.size()==0 &&(s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']')){
                return false;
            } 
            else if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            }
            else if (stack.size()!=0 &&(s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']')) {
                if (stack.peek() =='(' && s.charAt(i)==')'
                   ||stack.peek() =='{' && s.charAt(i)=='}'
                   ||stack.peek() =='[' && s.charAt(i)==']'
                ) {
                     stack.pop();
                }
                else{
                   return false;
                }
            }
        }
        System.out.print(stack);
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Solution sl=new Solution();
        System.out.println(sl.isValid("[])"));
    }
}