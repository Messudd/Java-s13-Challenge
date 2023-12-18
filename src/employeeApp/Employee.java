package employeeApp;
import java.util.Arrays;
public class Employee {
    private  int id;
    private  String fullName;
    private  String email;
    private  int password;
    private  String[] healthplans;

    public Employee(int id, String fullName, String email, int password) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthplans = new String[4];
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String[] getHealthplans() {
        return healthplans;
    }

    public void addHealtPlan(int index , String name){
        try {
            if(healthplans[index] != null){
                System.out.println("This field is full");
            }
            else healthplans[index] = name;
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", password=" + password +
                ", healthplans=" + Arrays.toString(healthplans) +
                '}';
    }
}

