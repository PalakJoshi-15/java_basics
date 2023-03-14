package Test;

public class basicSalary {

	public static void main(String[] args) {
		int basicSalary = 50000;
		
	    int DA = basicSalary * 10/100;
		int	HRA = basicSalary * 5/100;
		int	Tax = basicSalary * 13/100;
		int GrossSalary = DA + HRA + Tax;
		
	    System.out.println(" gross salary of the employee:" + GrossSalary);
	}
}
