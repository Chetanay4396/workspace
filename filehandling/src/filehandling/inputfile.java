package filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class inputfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File f=new File("src/test2.txt");
		try {
			FileReader fp =new FileReader(f);
			BufferedReader reader=new BufferedReader(fp);
			StringBuffer string=new StringBuffer();
			
			String line;
			while((line=reader.readLine())!=null){
				string.append(line);
				string.append('\n');
			}
			System.out.println(string);
			fp.close();
			String converion=string.toString();
			String sb=converion.replaceAll("hj", "fgh");
			System.out.println(sb);
			FileWriter fw=new FileWriter(f);
			fw.write(sb);
			fw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
