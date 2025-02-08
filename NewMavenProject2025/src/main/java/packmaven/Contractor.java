package packmaven;

public class Contractor extends EmployeeSc{
	
	double salaryPerHr;
	public Contractor(double salaryPerHr,int workingHrs)
	{
		this.salaryPerHr=salaryPerHr;
		EmployeeSc.workingHrs=workingHrs;
	}
	
	@Override
	public void calculateSalary(){
	
		double totalSalary=salaryPerHr*workingHrs;
		System.out.println("Total Salary of Contract Employee "+totalSalary);
		
	}


	public static void main(String[] args) {
	
		Contractor a=new Contractor(250,12);
		a.calculateSalary();
	}



}
