package test;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a=5;
		System.out.println("hello" + a);
        Map<String,String> map1=new HashMap<String,String>();
        map1.put("1234", "arg1");
        map1.put("5678","hello");
        map1.put("890", "String");
        
        
        for(Map.Entry<String, String> it : map1.entrySet()){
        	
        	System.out.println(it.getKey());
        	System.out.println(it.getValue());
        }
	}

}
