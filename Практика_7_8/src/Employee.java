public class Employee {
    public double bonus;
    String Surname;                              //Фамилия
    String Name;                                 //Имя
    double baseSalary;                               //Фиксированная часть зарплаты
    public EmployeePosition JobTitle;            //Должность

    public Employee (String Surname, String Name, double baseSalary, EmployeePosition JobTitle) {
        this.Surname=Surname;
        this.Name=Name;
        this.baseSalary=baseSalary;
        this.JobTitle=JobTitle;
    };

    public void setSurname(String Surname) { this.Surname = Surname;}
    public String getSurname() { return Surname;}

    public void setName(String Name) { this.Name = Name;}
    public String getName() { return Name;}

    public void setbaseSalary(double baseSalary) { this.baseSalary = baseSalary;}
    public double getbaseSalary() { return baseSalary;}

    public void setEmployeePosition(EmployeePosition JobTitle) { this.JobTitle = JobTitle;}
    public EmployeePosition getEmployeePosition() { return JobTitle;}


    public double calcSalary()
    {
        return JobTitle.calcSalary(baseSalary);
    }

}
