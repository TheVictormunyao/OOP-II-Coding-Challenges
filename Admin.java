// filepath: d:\OOP-II Coding Challenges\Admin.java
public class Admin extends Account {
    private String authPassword;

    public Admin(int id, String name, String password) {
        super(id, name);
        this.authPassword = password;
    }

    @Override
    public void processAccount() {
        System.out.println("Processing Admin account: " + getName());
    }
}