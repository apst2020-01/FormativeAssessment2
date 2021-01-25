/*Faculty Training Institute (FTI)
* Module 3,UNIT 3
*Formative Assessment 2 Activity 2.3  Implementing Polymorphism in Java 
*/

package application;

public class employee {
	int employeeNumber;  
	String employeeName;  
	String employeeSurname; 
	double annaulSalary; 
	int numYearsEmployed; 
	int performanceScore; 
	double bonusIncentive;

	public  double CalculateBonusAmount (double annualSalary, int numYearsEmployed, int performanceScore) {
	double bonusIncentive =0;
		bonusIncentive = ((annualSalary * (performanceScore * 0.01 )) + (annualSalary *  (numYearsEmployed * 0.001)));
		return bonusIncentive;
	}
}

class manager extends employee {
	public  double CalculateBonusAmount (double annualSalary, int numYearsEmployed, int performanceScore) {
		double bonusIncentive =0;
		bonusIncentive =((annualSalary * (performanceScore * 0.015)) + (annualSalary *  (numYearsEmployed * 0.0015)));
		return bonusIncentive;

	}
}
	

