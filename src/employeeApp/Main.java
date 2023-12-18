package employeeApp;
/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 *
 */
public class Main
{
    /**
     * Uygulamadaki tüm işlemler bu metotda yapılmalı
     */
    private static void workWithData ()
    {
        Employee employee = new Employee(10,"Mesud","eem.mesud.28@gmail.com",145334);
        Company com = new Company("8","Yusuf",-4);
        Healthplan healthplan = new Healthplan(5,"Mesud",Plan.Plan_A);
        employee.addHealtPlan(0,"Mesud");
        com.addEmploye(1,"Taha");
        com.addEmploye(8,"Ozgur"); // ArrayIndexOutOfBound Exception

        System.out.println(healthplan);
        System.out.println(employee);
        System.out.println(com);
    }
    /**
     * Bu projenin ana(main) metodu. Java uygulamalarında main metot küçük bir metot olur.
     * Bir Java programınd ilgili işlemlerin çoğunluğu başka metodlarda yapılır.
     * Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun içi kalabalık bir hale gelmemiş olur.

     *
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman alan
     *             bir uygulamamız olsaydı kullanılacaktı.
     */
    public static void main(String[] args)
    {
        workWithData();
    }
}
