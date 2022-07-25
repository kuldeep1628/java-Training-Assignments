
public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Car carObjCar = new Car("abc", "white", 1);
     carObjCar.printCarData();
     
     Toyota toyotaObj = new Toyota("xyz","black", 2, 200, 4);
     toyotaObj.printToyataData();
     
     ToyotaAuto autoObjAuto = new ToyotaAuto("ops","yellow", 3, 100, 3, 70);
     autoObjAuto.printToyatoAutoData();
	}

}
class Car{
	
	String model;
	String color;
	int modelNumber;
	public Car(String model, String color, int modelNumber) {
		super();
		this.model = model;
		this.color = color;
		this.modelNumber = modelNumber;
	}
	@Override
	public String toString() {
		return "Car [model=" + model + ", color=" + color + ", modelNumber=" + modelNumber + "]";
	}
	void printCarData() {
		System.out.println("Car.printData()");
		System.out.println("MODEL:"+ model);
		System.out.println("COLOR:"+ color);
		System.out.println("MODELNUMBER:"+ modelNumber);
		System.out.println("-------------------");
	};
}
class Toyota extends Car{

	int enginePower;
	int tyres;
	public Toyota(String model, String color, int modelNumber, int enginePower, int tyres) {
		super(model, color, modelNumber);
		this.enginePower = enginePower;
		this.tyres = tyres;
	}
	@Override
	public String toString() {
		return "Toyota [toString()=" + super.toString() + ", model=" + model + ", color=" + color + ", modelNumber="
				+ modelNumber + ", enginePower=" + enginePower + ", tyres=" + tyres + "]";
	}
	void printToyataData() {
		System.out.println("ToyotaData");
		super.printCarData();
		System.out.println("ENGINEPOWER:"+ enginePower);
		System.out.println("TYRES :"+ tyres);
		System.out.println("-------------------");
	}
	
}
class ToyotaAuto extends Toyota{

	int topSpeed;

	public ToyotaAuto(String model, String color, int modelNumber, int enginePower, int tyres, int topSpeed) {
		super(model, color, modelNumber, enginePower, tyres);
		this.topSpeed = topSpeed;
	}

	@Override
	public String toString() {
		return "ToyotaAuto [toString()=" + super.toString() + ", enginePower=" + enginePower + ", tyres=" + tyres
				+ ", model=" + model + ", color=" + color + ", modelNumber=" + modelNumber + ", topSpeed=" + topSpeed
				+ "]";
	}

	void printToyatoAutoData() {
		System.out.println("ToyotaAutoData");
		super.printToyataData();
		System.out.println("TOPSPEED:"+ topSpeed);
		System.out.println("-------------------");
	}

	
	
}
