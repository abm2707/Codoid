package testNG.Codoid;

public class ReverseString {

	public static void main(String[] args) {
		String original = "AkhilBMenon";
		String reversed = "";
		for(int i = original.length()-1 ; i>=0; i-- ) {
			reversed = reversed + original.charAt(i);
		}
		System.out.println("The original string is "+original);
		System.out.println("The reversed string is "+reversed);
	}
}
