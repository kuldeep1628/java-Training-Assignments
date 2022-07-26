public class ProducingObjectAssignment {
	public static void main(String[] args) {
	
		Processor processor = new Processor(3,"Intel", 89);
		
		Data data = new Data("int",34);
		
		Data data2 = new Data("int",20);
		
		CamQuality camQuality = new CamQuality("Sony","0.6f");
		
		Mode mode =new Mode("Night", "Low");
		
		//Picture picture = new Picture("400", "1890 x 1200");
		
		Output output = new Output("int",54);
		
		//Calculation calculation=new Calculation("scientific","44ms");
		
		Laptop lappy = new Laptop(1212357,"Dell",89000.00f,processor,"i3","DELL-1305");
		Calculation calculation=lappy.cal(processor,data,data2,output);
		
		Picture picture = lappy.pic(mode, camQuality);
		

	}
}
class Computer{ 
	int serialNumber;
	String company;
	float cost;
	
	public Computer(int serialNumber, String company, float cost) {
		super();
		this.serialNumber = serialNumber;
		this.company = company;
		this.cost = cost;
	}
}
class Laptop extends Computer //isA
{
	Processor processor ; //hasA
	String version; //intel i3,i5
	String brand;
	
	public Laptop(int serialNumber, String company, float cost, Processor processor, String version, String brand) {
		super(serialNumber, company, cost);
		this.processor = processor;
		this.version = version;
		this.brand = brand;
	}
	
	Calculation cal(Processor pro, Data d, Data e, Output o) {
			System.out.println("The processor used for calculation is "+ pro.version + "i");
			System.out.println("Data used for Calculation are "+ d.dataType + " and " + e.dataType);
			System.out.println("The Output for the Calculation of "+ d.value + " and "+e.value +" is "+o.value + " of type "+ o.dataType);
			
			Calculation calculation =new Calculation(version, brand);
		return calculation;
	}
	Picture pic(Mode mode, CamQuality cam) {
		
		System.out.println("The picture was taken using the "+ mode.modeName + " mode in " + mode.light +" Light" );
		System.out.println("The camera quality : ");
		System.out.println("Camera lens : " + cam.lens);
		System.out.println("lensFocalLength : "+cam.lensFocalLength);
		
		
		Picture p = new Picture("","");
		return p;
	}
}

class Calculation{
	String calType;
	String calculatorSpeed;
	
	public Calculation(String calType, String calculatorSpeed) {
		super();
		this.calType = calType;
		this.calculatorSpeed = calculatorSpeed;
	}
}
class Processor{
	int version;
	String brand;
	int efficiency;
	
	public Processor(int version, String brand, int efficiency) {
		super();
		this.version = version;
		this.brand = brand;
		this.efficiency = efficiency;
	}
	
}
class Data{
	
	String dataType;
	int value;
	public Data(String dataType, int value) {
		super();
		this.dataType = dataType;
		this.value = value;
	}
	
}
class Output{
	String dataType;
	int value;
	public Output(String dataType, int value) {
		super();
		this.dataType = dataType;
		this.value = value;
	}
}
class Picture{
	
	String pixels;
	String dimensions;
	public Picture(String pixels, String dimensions) {
		super();
		this.pixels = pixels;
		this.dimensions = dimensions;
	}
}
class Mode{
	
	String modeName;
	String light;
	public Mode(String modeName, String light) {
		super();
		this.modeName = modeName;
		this.light = light;
	}
}
class CamQuality{
	
	String lens;
	String lensFocalLength;
	
	public CamQuality(String lens, String lensFocalLength) {
		super();
		this.lens = lens;
		this.lensFocalLength = lensFocalLength;
	}	
}
