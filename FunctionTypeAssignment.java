
public class FunctionTypeAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findflat flat = new findflat();
		flat.findflatWithoutAnyone();
		flat.findflatWithAnyoneAndLessBudget("aman", "raman");
		String output = flat.findflatWithAnyoneAndSufficientBudget("aman" , "raman") ;
		System.out.println("flat decided is "+ output);
		String fun4Output = flat.finding();
		System.out.println("action taken : "+ fun4Output);
	}
}
	class findflat{
		
	void findflatWithoutAnyone() {
		System.out.println("finding flat Without Anyone , should go for pg");
		System.out.println("--------------------");
	}
	void findflatWithAnyoneAndLessBudget(String x, String y) {
		System.out.println("two people , less budget");
		System.out.println( x + " and "+ y +" should go for a pg");
		System.out.println("--------------------");
	}
	String findflatWithAnyoneAndSufficientBudget(String x, String y) {
		System.out.println("two people , sufficient budget");
		System.out.println( x +" and "+ y +" should go for 1BHK");
		System.out.println("--------------------");
		return "1BHK";
	}
	String finding() {
		System.out.println("--------------------");
		return "Trying";
	}
  }
