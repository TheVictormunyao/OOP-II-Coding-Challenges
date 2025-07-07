
public class Factorial {
    
    //factorial method 
    public static int factorial(int n) {
        //Base case
        if (n == 1 || n == 0) {
            return 1;
        } else {
            //Recursive case
            return n * factorial(n - 1);
        }

    }
    
    public static void main(String[] args) {
        int x = factorial(4);
        System.out.println(x);
    }
    
}