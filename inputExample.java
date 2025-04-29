import java.util.Scanner; // Import the Scanner class to read input from the console
public class inputExample {
    Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input from the console

    public void readNameAndAge() {
        String name;
        int age; //in years
        System.out.print("Enter your name: ");
        name = scanner.next(); // Read a string input for the name
        
        System.out.print("Enter your age: ");
        age = scanner.nextInt(); // Read an integer input for the age

        System.out.println("Hello " + name + ", you are " + age + " years old.");
        
    
        }
        public static void main(String[] args) {
            (new inputExample()).readNameAndAge(); // Create an instance of inputExample and call the readNameAndAge method
        }
   
   
    }
