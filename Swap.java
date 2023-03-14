package Test;

public class Swap {

	public static void main(String[] args) {
		int a=4, b=5;
		int c;
		System.out.println("Value of a and b before swap:" + a + " " + b);
		c=a;
		a=b;
		b=c;
		System.out.println("Value of a and b after swap:" + a + " " + b);
	}

}
