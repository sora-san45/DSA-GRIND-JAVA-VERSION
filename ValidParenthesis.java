import java.util.*;

class ValidParenthesis {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string with only []{}():");
        String s = sc.next();
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<s.length();i++){
            char st = s.charAt(i);
            if(st =='(' || st == '{' || st == '['){
                stack.push(st);
            }
            else if(st==')' || st=='}' || st==']'){
                if(stack.isEmpty()){
                    System.out.println("Invalid");
                }
                char st1 = stack.peek();
                if((st==')' && st1=='(') || (st=='}' && st1=='{') || (st==']' && st1=='[')){
                    stack.pop();
                }
                else{
                    System.out.println("Invalid");
                }
            }
        }
        if(stack.isEmpty()){
            System.out.println("Valid");
        }
        else{
            System.out.println("Invalid");
        }
    }
}