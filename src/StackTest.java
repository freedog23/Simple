public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack1 = new Stack<String>();
        for(String s : "My dog has fleas".split(" "))
            stack1.push(s);
        
        while(!stack1.empty()) {
            System.out.print(stack1.pop() + " ");
        }
        System.out.println();
    
        java.util.Stack<String> stack2 = new java.util.Stack<String>();
        for(String s : "My dog has fleas".split(" "))
            stack2.push(s);
        
        while(!stack2.empty())
            System.out.print(stack2.pop() + " ");
        System.out.println();
    }
}
