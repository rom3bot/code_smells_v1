public class Customer {
    private String name;
    private String email;       // Added from CODE SMELL: dispensable
    private String password;    // Added from CODE SMELL: dispensable
    private String address;
    private String[] orderHistory; 

    private int income;

    public Customer(String name, String address, String[] orderHistory, int income, String email, String password) {
        this.name = name;
        this.email = email;       // Added from CODE SMELL: dispensable
        this.password = password; // Added from CODE SMELL: dispensable
        this.address = address;
        this.orderHistory = orderHistory;
        this.income = income;
    }

    public int getIncome() {return income;}

    public void setIncome(int income) {this.income = income;}

    public String getName() { return name;}
}
