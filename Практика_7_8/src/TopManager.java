import java.util.Scanner;

public class TopManager implements EmployeePosition
{
    private Company company;
    public TopManager(Company company){
        this.company=company;
    }

    public String getJobTitle() {
        return "TopManager";
    }

    public double calcSalary(double baseSalary) {
        if (company.getIncome() > 10000000)
            {return baseSalary + (baseSalary * 1.5);}
        else return baseSalary;
    }
}
