public class Manager implements EmployeePosition
{
    private Company company;
    public Manager(Company company){
        this.company=company;
    }

    public String getJobTitle() {
        return "Manager";
    }

    public double bonus = 115000 + Math.random() * 25000;
    public double calcSalary(double baseSalary) {
        return baseSalary + 0.05*bonus;
    }
}
