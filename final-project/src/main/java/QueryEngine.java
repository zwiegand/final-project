import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import edu.stanford.nlp.simple.Sentence;

public class QueryEngine {
	
	public static void readWikiPages() {
		ClassLoader classLoader = QueryEngine.class.getClassLoader();
		File dir = new File(classLoader.getResource("wikiPages").getPath());
		File[] dirList = dir.listFiles();
		if(dirList != null) {
			for (File child : dirList) {
				try (Scanner inputScanner = new Scanner(child)) {
		            while (inputScanner.hasNextLine()) {
		            	String line = inputScanner.nextLine();
		            	System.out.println(line);
		            	break;
		            }
		            inputScanner.close();
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
			}
		} 
	}
	public static void main(String[] args ) {
		readWikiPages();
    }
}
