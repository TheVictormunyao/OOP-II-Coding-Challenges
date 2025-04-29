import java.util.Scanner;

public class ifElse {
    
    double price;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price: ");
        double price = sc.nextDouble();

        if (price < 25) {
            System.out.println("I will buy!");
        } else {
            System.out.println("Too expensive!");
        }
        sc.close();
    }
}
