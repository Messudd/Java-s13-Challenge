package employeeApp;

public enum Plan {
    Plan_A("A_Planı",1500),
    Plan_B("B_Planı",3000);
    private  String name;
    private  double price;
    Plan(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
}
