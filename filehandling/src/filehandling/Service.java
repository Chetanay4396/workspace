package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Scanner;

public class Service {
 
	Properties prop;
	
	public void getdata(File file){
	   
	try {
		prop = FileInteraction.getPropertyFile(file);
	
		Enumeration enumkey=prop.keys();
		while(enumkey.hasMoreElements()){
		String key=(String)enumkey.nextElement();
		String value=prop.getProperty(key);
		System.out.println("User ID:" +  key +"\tValue:      "+value);
	}}catch(FileNotFoundException e){
		System.out.println("Unable to Load the File");
	} 
	catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	
	public void setdata(File file){
		   
	try {
		prop = FileInteraction.getPropertyFile(file);
		Scanner scn=new Scanner(System.in);
		String input="Y";
		while(input.toUpperCase().equals("Y")){
			System.out.println("Enter Key");
			String key=scn.nextLine();
			System.out.println("\nEnter Value");
			String value=scn.nextLine();
			if((key!=null && value!=null)&&(!key.isEmpty()&&!value.isEmpty())){
				prop.setProperty(key, value);
			}
			
		System.out.println("Press Y to update more values else anything else");
		input=scn.nextLine();
		}
		FileInteraction.updatePropertyFile(file,prop);
	}catch(FileNotFoundException e){
		System.out.println("Unable to Load the File");
	} 
	catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	
	public void deletedata(File file){
		try {
			prop = FileInteraction.getPropertyFile(file);
			Scanner scn=new Scanner(System.in);
			String input="Y";
			while(input.toUpperCase().equals("Y")){
				System.out.println("Enter Key to remove");
				String key=scn.nextLine();
				
				if((key!=null)&&(!key.isEmpty())){
					prop.remove(key);
					FileInteraction.updatePropertyFile(file, prop);
				}
				System.out.println("Press Y to update more values else anything else");
				input=scn.nextLine();
			
		}}catch(FileNotFoundException e){
			System.out.println("Unable to Load the File");
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}