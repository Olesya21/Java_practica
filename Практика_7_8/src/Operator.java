import java.util.Scanner;

public class Operator implements EmployeePosition
{
    private Company company;
    public Operator(Company company){
        this.company=company;
    }

    public String getJobTitle() {
        return "Operator";
    }

    public double calcSalary(double baseSalary) {
        return baseSalary;
    }
}
