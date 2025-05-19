abstract public class Account {
    protected int id;
    protected String name;
    private DataSource myData;

    // Constructor
    public Account(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void performOperation(DataSource _myData) {
        myData = _myData;
        myData.execute();
    }

    // Abstract method that subclasses must implement
    abstract public void processAccount();
}