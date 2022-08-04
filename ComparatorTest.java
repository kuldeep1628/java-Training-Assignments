import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ComparatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Engines Engine1 = new Engines(1, "Diesel", "20/2/2020");
		Engines Engine2 = new Engines(2, "petrol", "20/2/2021");
		Engines Engine3 = new Engines(3, "EV", "20/2/2022");
		
	
		ArrayList<Engines> engines = new ArrayList<Engines>();
		
		engines.add(Engine1);
		engines.add(Engine3);
		engines.add(Engine2);
		
		Iterator<Engines> iterator = engines.iterator();
		
		 
			// call the sort function
		Collections.sort(engines, new Engines(0, null, null));
			for (Engines e : engines) {
						System.out.println(e);
					} 
			 

	}

}
class Engines implements Comparator<Engines>{
	
	int model;
	String type;
	String mFdate;
	public Engines(int model, String type, String mFdate) {
		super();
		this.model = model;
		this.type = type;
		this.mFdate = mFdate;
	}
	@Override
	public String toString() {
		return "Engines [model=" + model + ", type=" + type + ", mFdate=" + mFdate + "]";
	}
	@Override
	public int compare(Engines o1, Engines o2) {
		// TODO Auto-generated method stub
		System.out.println("Comparing "+o1.model + " with " + o2.model);
		return Integer.compare(o1.model, o2.model);
	}
	
	
	
}
