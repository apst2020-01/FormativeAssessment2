/*Faculty Training Institute (FTI)
* Module 3,UNIT 3
*Formative Assessment 2 Activity 2.3  Implementing Polymorphism in Java 
*/

package application;
import java.util.*;
public class incentiveCalculator2 {
	public static void main (String[] args) {
		  double bonusincentive = 0; 
		  manager Manager = new manager (); 
		 
		 //enter employee number
		 System.out.println("Enter the employee number");
		 Scanner g = new Scanner (System.in);
		 Manager.employeeNumber = g.nextInt(); //employee name variable is read-in for an Employee object
		 
		 System.out.println("Enter the employee name");
		 Scanner h = new Scanner (System.in);
		 Manager.employeeName = h.next(); //employee name variable is read-in for an Employee object
		 
		 
		 System.out.println("Enter the employee surname: ");
		 Scanner i = new Scanner (System.in);
		 Manager.employeeSurname = i.next();
		 
		 
		 System.out.println("Enter the employee's annual salary: ");
		 Scanner j = new Scanner (System.in);
		 Manager.annaulSalary = j.nextDouble();
		 
		 System.out.println("Enter the employee's number of years employed: ");
		 Scanner k = new Scanner (System.in);
		 Manager.numYearsEmployed = k.nextInt();
		 
		 System.out.println("Enter the employee's performance score:  ");
		 Scanner l = new Scanner (System.in);
		 Manager.performanceScore = l.nextInt();
		 
		 bonusincentive = Manager.CalculateBonusAmount( Manager.annaulSalary, Manager.numYearsEmployed, Manager.performanceScore);
		 System.out.println("The employee incentive bonus amount is:  " + bonusincentive);
		 	 
}
	}

