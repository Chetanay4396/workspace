package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

  public class FileInteraction {

	
	
	public static Properties getPropertyFile(File file) throws FileNotFoundException,IOException {
		
		FileInputStream fileInput=new FileInputStream(file);
		Properties prop=new Properties();
		prop.load(fileInput);
		fileInput.close();
		
		return prop;
		}
	
	public static void updatePropertyFile(File file,Properties propout) throws FileNotFoundException,IOException {
		
		FileOutputStream fileOut = new FileOutputStream(file);
		
		propout.store(fileOut,null);
		fileOut.close();
		
		System.out.println("Updated the file");
		
		
		}
	

	
	
}