public class VariableScope {
    final double PI = 3.14159;         // final instance variable
    static String name = "Variables";  // static variable
    int sum = 10;                       // instance variable

    public static void main(String[] args) {
        int num = 21; // local variable
        
        VariableScope vs = new VariableScope(); 
        
        {
            boolean b = true; // block variable
            if (b) {
                System.out.println("Block variable: " + b);
            }
        }
        
        System.out.println("Static variable: " + name);
        System.out.println("Local variable: " + num);
        System.out.println("Instance variable : " + vs.sum);
        System.out.println("Final variable : " + vs.PI);
    }
}

	