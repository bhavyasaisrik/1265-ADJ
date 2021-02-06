package lab;

import java.util.Hashtable;
import java.util.Map;

public class Exp1b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
		  
		  hm.put(1261,"Keerthi");  
		  hm.put(1262,"Divya");  
		  hm.put(1263,"Priyanka");  
		  hm.put(1264,"Snehaja");  
		  hm.put(1265,"Bhavya");
		  for(Map.Entry m:hm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  

	}

}
