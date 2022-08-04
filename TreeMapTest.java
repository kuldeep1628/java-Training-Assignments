import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Engines2 Engine1 = new Engines2(1, "Diesel");
		Engines2 Engine2 = new Engines2(2, "petrol");
		Engines2 Engine3 = new Engines2(3, "EV");
		
	
		TreeMap<Integer,Engines2> engines = new TreeMap<Integer,Engines2>();
		
		engines.put(1,Engine1);
		engines.put(2,Engine3);
		engines.put(3,Engine2);
		
//		Set set = engines.entrySet();
//		Iterator it = set.iterator();
//		 
//	    while(it.hasNext()) {
//	      Map.Entry me = (Map.Entry)it.next();
//	      System.out.print("Key is: "+me.getKey() + " & ");
//	      System.out.println("Value is: "+me.getValue());
	//}
		
		for(Map.Entry m:engines.entrySet())  
	      {  
	          System.out.println(m.getKey()+" "+m.getValue());      
	      }  
	
}
}
class Engines2{
	
	int model;
	String type;
	String mFdate;
	public Engines2(int model, String type) {
		super();
		this.model = model;
		this.type = type;
	}
	@Override
	public String toString() {
		return "Engines [model=" + model + ", type=" + type + "]";
	}
}
