package testNG.Codoid;

public class DuplicatesInString {
		
		public static void main(String[] args) {
	        String inputString = "hello world";
	        String duplicates = findDuplicateCharacters(inputString);
	        System.out.println("The duplicate characters in the string are: " + duplicates);
	    }

	    public static String findDuplicateCharacters(String s) {
	        String result = "";
	        for(int i = 0; i < s.length(); i++) {
	            char currentChar = s.charAt(i);
	            if(s.indexOf(currentChar) != s.lastIndexOf(currentChar) && !result.contains(currentChar + "")) {
	                result += currentChar;
	            }
	        }
	        return result;
	}
}
