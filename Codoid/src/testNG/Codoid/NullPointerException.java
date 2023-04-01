package testNG.Codoid;

public class NullPointerException {

	public static void main(String[] args) {
        String str = null;
        
        /*
         *  since no length is there for string and is declared null, hence nullpointerexception
         *  is shown.
         */
        System.out.println(str.length());
    }
}
