package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;
import java.util.Scanner;
import java.util.Vector;

public class ReadPropertyFile {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file=new File("src/test.properties");
		Service serv=new Service();
		String input="YES";
		while(input.toUpperCase().equals("YES")){
			System.out.println("Please give the Operation to Perform\n R/r: For Reading \n W/w: For Writing \n D/d: For Deleting a Key");
			Scanner scn=new Scanner(System.in);
			String decision=scn.nextLine();
		switch(decision.toUpperCase()){
		case "R":
			System.out.println("Reading Data From File");
			serv.getdata(file);
			break;
		case "W":
			System.out.println("Updating Data From File");
			serv.setdata(file);
			break;
		case "D":
			System.out.println("Deleting key From File");
			serv.deletedata(file);
			break;
		default:
			System.out.println("Please Give Proper Input");
			
		}
		System.out.println("If you want to continue enter Yes else No");
		input=scn.nextLine();
		
		
		}
		System.out.println("Thank You for Using this Application");
		
		
		
	}

}
