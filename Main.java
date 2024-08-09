package application;
import entities.Employee;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();
        
        System.out.print("Name: ");
        employee.name = sc.nextLine();
        System.out.print("Gross Salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();
        
        System.out.printf("Employee: %s, %.2f%n", employee.name, employee.netSalary());
        System.out.print("Which percentage to increase salary? ");
	       	double percentage = sc.nextDouble();
        
        employee.increasedSalary(percentage);
        
        double updatedNetSalary = employee.netSalary();
        
        System.out.printf("Updated data: %s, $ %.2f%n", employee.name, updatedNetSalary);
        sc.close();
    }
    
}