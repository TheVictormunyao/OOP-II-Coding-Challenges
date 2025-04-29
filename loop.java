import java.util.*;
class loop {
    Scanner sc = new Scanner(System.in);

    void showHello() {
        String choice;

        System.out.println("For Hello type h, anything else to terminate");
        choice = sc.next();
        while ("h".equals(choice)) {
            System.out.println("Hello World!");
            choice = sc.next();
        }
    }

    public static void main(String[] args) {
        loop obj = new loop();
        obj.showHello();
    }
    // The main method creates an instance of the loop class and calls the showHello method to start the program.
}