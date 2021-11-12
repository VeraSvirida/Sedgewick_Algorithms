public class Ex1_3_12 {
    public static Stack<String> copy(Stack<String> stack) {
        Stack<String> tmp = new Stack<String>();
        Stack<String> copyStack = new Stack<String>();
        for (String s : stack) {
            tmp.push(s);
        }
        for (String s : tmp) {
            copyStack.push(s);
        }
        return copyStack;
    }

    public static void main(String[] args) {
        Stack<String> inpStack = new Stack<String>();
        inpStack.push("1");
        inpStack.push("2");
        inpStack.push("3");
        StdOut.println("Copy Stack:");
        for (String s : copy(inpStack)) {
            StdOut.println(s);
        }
        StdOut.println("Input Stack:");
        for (String s : inpStack) {
            StdOut.println(s);
        }
    }
}