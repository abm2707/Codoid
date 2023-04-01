package testNG.Codoid;

public class MethodOverloadingDT {

	public int sum(int a, int b) {
		return a + b;
	}

	public double sum(double a, double b) {
		return a + b;
	}

	public int subtract(int a, int b) {
		return a - b;
	}

	public double subtract(double a, double b) {
		return a - b;
	}

	public static void main(String[] args) {
		MethodOverloadingDT obj = new MethodOverloadingDT();
		System.out.println(obj.sum(10, 20));
		System.out.println(obj.sum(200.0, 20.0));
		System.out.println(obj.subtract(50, 20));
		System.out.println(obj.subtract(100.0, 20.0));
	}

}
