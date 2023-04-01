package codoid;

public class MethodOverloadingArguments {

	public int sum(int a, int b) {
		return a + b;
	}

	public int sum(int a, int b, int c) {
		return a + b + c;
	}

	public int subtract(int a, int b) {
		return a - b;
	}

	public int subtract(int a, int b, int c) {
		return a - b - c;
	}

	public static void main(String[] args) {
		MethodOverloadingArguments obj = new MethodOverloadingArguments();
		System.out.println(obj.sum(10, 20));
		System.out.println(obj.sum(10, 20, 30));
		System.out.println(obj.subtract(50, 20));
		System.out.println(obj.subtract(50, 20, 10));
	}

}
