public class Recursive{

    public static int SumRecursive(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + SumRecursive(n - 1);
        }

    }
public static void main(String []args){
    int n = SumRecursive(2);
    System.out.println(n);
}
}