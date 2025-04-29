public class myVariables {
    void showInterest() {
        double amount;
        double interest; //percentage

        amount = 120000.0;
        System.err.println("Amount: " + amount);

        interest = 3.0;
        amount = amount * (100 + interest) / 100;
        System.err.println("after 2 years: " + amount);
    }

    public static void main(String[] args) {
            
            (new myVariables()).showInterest(); // Create an instance of myVariables and call the showInterest method
    }
}