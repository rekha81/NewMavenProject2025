package packmaven;

public class FullTimeEmployee extends EmployeeSc{
	
	double salaryPerHr;
	public FullTimeEmployee(double salaryPerHr)
	{
		this.salaryPerHr=salaryPerHr;
	}
	
	@Override
	public void calculateSalary(){
	
		double totalSalary=salaryPerHr*8;
		System.out.println("Total Salary of Fulltimeemployee "+totalSalary);
		
	}


	public static void main(String[] args) {
	
		FullTimeEmployee a=new FullTimeEmployee(250);
		a.calculateSalary();
	}


}
