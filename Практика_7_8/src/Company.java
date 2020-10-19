import java.util.ArrayList;
import java.util.List;

public class Company {
    public double income;
    private ArrayList<Employee> employees;

    public Company(int income) {
        this.income=income;
        employees = new ArrayList<Employee>();
    }

    public void hire(Employee a) {
        employees.add(a);
    }

    public void hireAll(ArrayList<Employee> obj) {
        employees.addAll(obj);
    }

    public void fire(int i) {
        if (i > -1 && i < employees.size()) {
            employees.remove(i);
        }
    }

    public int getSize() {
        return employees.size();
    }

    public double getIncome() {
        return income;
    }

    public List<Employee> getTopSalaryStaff(int count) {
        if (count < 0 && count > employees.size()) {
            return null;
        }
        for (int i = 0; i < employees.size(); i++) {
            for (int j = 0; j < employees.size() - 1 - i; j++) {
                if (employees.get(j).calcSalary() < employees.get(j + 1).calcSalary()) {
                    Employee t;
                    t = employees.get(j);
                    employees.set(j, employees.get(j + 1));
                    employees.set(j + 1, t);
                }

            }
        }

        List<Employee> topSalary = new ArrayList<Employee>();
        for (int i = 0; i < count; i++) {
            topSalary.add(employees.get(i));
        }
        return topSalary;
    }

    public List<Employee> getLowestSalaryStaff(int count) {
        if (count < 0 && count > employees.size()) {
            return null;
        }
        for (int i = 0; i < employees.size(); i++) {
            for (int j = 0; j < employees.size() - 1 - i; j++) {
                if (employees.get(j).calcSalary() > employees.get(j + 1).calcSalary()) {
                    Employee t;
                    t = employees.get(j);
                    employees.set(j, employees.get(j + 1));
                    employees.set(j + 1, t);
                }
            }
        }

        List<Employee> lowerSalary = new ArrayList<Employee>();
        for (int i = 0; i < count; i++) {
            lowerSalary.add(employees.get(i));
        }
        return lowerSalary;
    }
}