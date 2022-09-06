package Chapter007;

abstract class Employee {
    public abstract double earnings();
}
class YearWorker extends Employee {
    public double earnings() {
        return  12000; //重写earnings方法，返回按年领取的薪水，每年12000元
    }
}

class MonthWorker extends Employee {
    public double earnings() {
        return 2300 * 12; //重写earnings方法，返回按月领取的薪水，每月2300元
    }
}

class WeekWorker extends Employee {
    public double earnings() {
        return 780 * 52; //重写earnings方法，返回按周领取的薪水，每周780元，共52周。
    }
}

class Company {
    Employee[] employee;
    double salaries = 0;
    Company(Employee[] employee) {
        this.employee = employee;
    }
    public double salariesPay() {
        //计算公司所有员工的薪水总额。
        salaries = 0;
        for (int i = 0; i < employee.length; i++) {
            if (i % 3 == 0)
                salaries += employee[i].earnings();
            else if (i % 3 == 1)
                salaries += employee[i].earnings();
            else if (i % 3 == 2)
                salaries += employee[i].earnings();
        }
        return salaries;
    }
}

public class CompanySalary {
    public static void main(String args[]) {
        Employee[] employee = new Employee[29];
        for (int i = 0; i < employee.length; i++) {
            if (i % 3 == 0)
                employee[i] = new WeekWorker();
            else if (i % 3 == 1)
                employee[i] = new MonthWorker();
            else if (i % 3 == 2)
                employee[i] = new YearWorker();
        }
        Company company = new Company(employee);
        System.out.println("公司薪水总额："+ company.salariesPay() + "元");
    }
}
