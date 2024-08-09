package entities;

public class Employee {
    public String name;
    public Double grossSalary;
    public Double tax;
    
    public Double netSalary(){
     return   grossSalary - tax;
    } public void increasedSalary(double percentage){
        grossSalary += grossSalary * percentage / 100;
    }
}