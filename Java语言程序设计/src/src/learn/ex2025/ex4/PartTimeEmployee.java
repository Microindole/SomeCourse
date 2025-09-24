package learn.ex2025.ex4;

public class PartTimeEmployee extends Employee{

    private double hoursSalary;
    private int hoursWorked;

    PartTimeEmployee(){}

    PartTimeEmployee(String name, int id, double hoursSalary, int hoursWorked){
        setName(name);
        setId(id);
        this.hoursSalary = hoursSalary;
        this.hoursWorked = hoursWorked;
    }
    public double getHoursSalary() {
        return hoursSalary;
    }

    public void setHoursSalary(double hoursSalary) {
        this.hoursSalary = hoursSalary;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary(){
        return hoursWorked * hoursSalary;
    }

    @Override
    public void showInfo(){
        System.out.println(getName()+"的详细信息为：ID: "+getId()+"时薪: "+getHoursSalary()+"本年度公司应该支付的薪水: "+calculateSalary());
    }
}
