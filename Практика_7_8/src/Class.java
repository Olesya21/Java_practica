import java.util.ArrayList;
import java.util.List;

public class Class {
    public static void main(String[] args)
    {
        Company company=new Company(12000000);
        for(int  i=0;i<180;i++)
        {
            Employee employee=new Employee("Name","Surname",12000, new Operator(company) {
                public int getBonus() {
                    int i1 = 0;
                    return i1;
                }
            });
            company.hire(employee);
        }
        for(int  i=0;i<80;i++)
        {
            Employee employee=new Employee("Name","Surname",20000, new Manager(company) {
                public int getBonus() {
                    int i1 = 0;
                    return i1;
                }
            });
            company.hire(employee);
        }

        ArrayList<Employee> topManager = new ArrayList<Employee>();

        for(int  i=0;i<10;i++)
        {
            Employee employee=new Employee("Name","Surname",50000, new TopManager(company) {
                public int getBonus() {
                    return 0;
                }
            });
            topManager.add(employee);
        }
        company.hireAll(topManager);

        List<Employee> topSalary=company.getTopSalaryStaff(10);
        for(Employee obj: topSalary)
        {
            System.out.printf("%d Руб.\n",(int)obj.calcSalary());
        }

        List<Employee> lowerSalary=company.getLowestSalaryStaff(30);
        for(Employee obj: lowerSalary)
        {
            System.out.printf("%d Руб.\n",(int)obj.calcSalary());
        }

        System.out.println(company.getSize()+" -Размер до удаления");

        int len=company.getSize()/2;
        for(int i=0;i<len;i++)
        {
            int index=(int)(Math.random()*company.getSize());

            company.fire(index);
        }

        System.out.println(company.getSize()+" -Размер после удаления");

        topSalary=company.getTopSalaryStaff(10);
        for(Employee obj: topSalary)
        {
            System.out.printf("%d руб.\n",(int)obj.calcSalary());
        }

        lowerSalary=company.getLowestSalaryStaff(30);
        for(Employee obj: lowerSalary)
        {
            System.out.printf("%d руб.\n",(int)obj.calcSalary());
        }
    }
}