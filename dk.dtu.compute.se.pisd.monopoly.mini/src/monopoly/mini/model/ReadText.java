package monopoly.mini.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadText {
	public static String[] file(String fileName) {

		ArrayList<String> lines1 = new ArrayList<String>();

		try {
			BufferedReader reader1 = new BufferedReader(new FileReader(fileName));
			String line = "\r\n";
			while ((line = reader1.readLine()) != null) {
				lines1.add(line);
			}
		
		reader1.close();
	} catch (IOException e) {
		System.out.println("error");
	} finally {
	
	}
	String[] li1 = new String[lines1.size()];
	li1 = lines1.toArray(li1);

	return li1;
	
	}
}
	
		



