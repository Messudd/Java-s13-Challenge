package employeeApp;

public class Employee {
    private  int id;
    private  String fullName;
    private  String email;
    private  int password;
    private  String[] healthplans;

    public Employee(int id, String fullName, String email, int password, String[] healthplans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthplans = healthplans;
    }


}
