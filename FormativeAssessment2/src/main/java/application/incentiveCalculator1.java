/*Faculty Training Institute (FTI)
* Module 3,UNIT 3
*Formative Assessment 2 Activity 2.3  Implementing Polymorphism in Java 
*/

package application;
import java.util.*;
public class incentiveCalculator1 {
	public static void main (String[] args) {
		double bonusincentive = 0; 
		employee Employee = new employee (); 
		 
		 //enter employee number
		 System.out.println("Enter the employee number");
		 Scanner a = new Scanner (System.in);
		 Employee.employeeNumber = a.nextInt(); //employee name variable is read-in for an Employee object
		 
		 System.out.println("Enter the employee name");
		 Scanner b = new Scanner (System.in);
		 Employee.employeeName = b.next(); //employee name variable is read-in for an Employee object
		 
		 
		 System.out.println("Enter the employee surname: ");
		 Scanner c = new Scanner (System.in);
		 Employee.employeeSurname = c.next();
		 
		 
		 System.out.println("Enter the employee's annual salary R: ");
		 Scanner d = new Scanner (System.in);
		 Employee.annaulSalary = d.nextDouble();
		 
		 System.out.println("Enter the employee's number of years employed: ");
		 Scanner e = new Scanner (System.in);
		 Employee.numYearsEmployed = e.nextInt();
		 
		 System.out.println("Enter the employee's performance score:  ");
		 Scanner f = new Scanner (System.in);
		 Employee.performanceScore = f.nextInt();
		 
		 bonusincentive = Employee.CalculateBonusAmount( Employee.annaulSalary, Employee.numYearsEmployed, Employee.performanceScore);
		 System.out.println("The employee incentive bonus amount is:  " +  bonusincentive);
		 	 
}
	}
