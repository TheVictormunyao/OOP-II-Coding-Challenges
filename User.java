public class User extends Account {
    public User(int id, String name) {
        super(id, name);
    }

    @Override
    public void processAccount() {
        System.out.println("Processing User account: " + getName());
    }
}