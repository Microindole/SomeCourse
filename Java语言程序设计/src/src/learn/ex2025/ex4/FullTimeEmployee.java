package learn.ex2025.ex4;

public class FullTimeEmployee extends Employee{

    private double monthSalary;

    FullTimeEmployee(){}

    FullTimeEmployee(String name,int id,double monthSalary){
        setName(name);
        setId(id);
        this.monthSalary = monthSalary;
    }

    public double getMonthSalary() {
        return monthSalary;
    }

    public void setMonthSalary(double monthSalary) {
        this.monthSalary = monthSalary;
    }

    public double giveYearEndBonus(){
        return 4 * monthSalary;
    }

    @Override
    public double calculateSalary(){
        return 12 * monthSalary + giveYearEndBonus();
    }

    public void showYearEndBonus(){
        System.out.println(getName()+"的年终奖金为"+giveYearEndBonus());
    }

    @Override
    public void showInfo(){
        System.out.println(getName()+"的详细信息为：ID: "+getId()+"月薪: "+getMonthSalary()+"本年度公司应该支付的薪水: "+calculateSalary());
    }


}
