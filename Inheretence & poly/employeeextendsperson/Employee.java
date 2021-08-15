package com.yash.employeeextendsperson;

public class Employee extends Person
{
	double annualSalary;
	int startingYear;
	String nationalInsuranceNumber;
	
	Employee(String employeeName, double annualSalary, int startingYear, String nationalInsuranceNumber)
	{
		super(employeeName);
		this.annualSalary=annualSalary;
		this.startingYear=startingYear;
		this.nationalInsuranceNumber=nationalInsuranceNumber;
	}

	@Override
	public String toString() {
		return "Employee [annualSalary=" + annualSalary + ", startingYear=" + startingYear
				+ ", nationalInsuranceNumber=" + nationalInsuranceNumber + ", employeeName=" + employeeName + "]";
	}

	

	


	
	

}
