package employeeApp;
import java.util.Arrays;

public class Company {
    private  String id;
    private String name;
    private  int giro;
    private  String[] developerNames;

    public Company(String id , String name ,int giro){
        this.id = id;
        this.name = name;
        this.developerNames = new String[4];
        this.giro = giro < 0 ? 0 : giro;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getGiro() {
        return giro;
    }
    public void setGiro(int giro) {
        this.giro = giro;
    }
    public String[] getDeveloperNames() {
        return developerNames;
    }
    public void addEmploye (int idx , String name) {
        try {
            if(developerNames[idx] != null){
                System.out.println("This index is full.");
            }
            else developerNames[idx] = name;

        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }
    }
    @Override
    public String toString() {
        return "Company{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", giro=" + giro +
                ", developerNames=" + Arrays.toString(developerNames) +
                '}';
    }
}
