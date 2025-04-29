public class myClasses { //Class declaration
    
    void greet() {
        System.out.println("Hi there!");
    }

    public static void main(String[] args) {
        (new myClasses()).greet(); // Create an instance of myClasses and call the greet method
    }
}
