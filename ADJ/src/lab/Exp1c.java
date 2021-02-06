package lab;

import java.util.HashMap;
import java.util.Map;

public class Exp1c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map=new HashMap<Integer,String>();    
		   map.put(1261,"Keerthi");   
		   map.put(1262,"Divya");    
		   map.put(1263,"Priyanka");   
		   map.put(1264,"Snehaja");   
		   map.put(1265,"Bhavya"); 
		   System.out.println("Iterating Hashmap...");  
		   for(Map.Entry m : map.entrySet()){    
		    System.out.println(m.getKey()+" "+m.getValue());    
		   }  

	}

}
