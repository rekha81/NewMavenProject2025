package packmaven;

public class HDFC  implements RBI{
	
	double amount;
	int duration;
	@Override
	public void recurringDeposit(double amount, int duration) {
		this.amount=amount;
		this.duration=duration;
		double totalAmount=amount *(1+r*duration);
		 System.out.println("Customer totalamount is "+totalAmount);
			
	}

	public static void main(String[] args) {
		RBI p=new HDFC();
		p.recurringDeposit(50000,5);
		 

	}

	}


