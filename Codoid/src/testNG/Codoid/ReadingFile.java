package testNG.Codoid;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadingFile {

	public static void main(String[] args) {
		 try {
	            File file = new File("./src/testNG/Codoid/file.txt");
	            FileInputStream fis = new FileInputStream(file);
	            BufferedReader br = new BufferedReader(new InputStreamReader(fis));

	            String line;
	            while ((line = br.readLine()) != null) {
	                System.out.println(line);
	            }

	            br.close();
	            fis.close();

	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	}

}
