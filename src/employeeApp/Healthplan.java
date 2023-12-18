package employeeApp;

public class Healthplan {
    private  int id;
    private  String name;
    private  Plan plan;

    public  Healthplan(int id,String name, Plan plan){
        this.id = id;
        this.name = name;
        this.plan = plan;
    }
    public int getId(){
        return  id;
    }
    public String getName(){
        return  name;
    }
    public Plan getPlan(){
        return  plan;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPlan(Plan plan) {
        this.plan = plan;
    }
<<<<<<< HEAD
    @Override
    public String toString() {
        return "Healthplan{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", plan=" + plan +
                '}';
    }
=======
>>>>>>> 62aa462184b343cd2d16bd73bcc5667030884e9a
}
