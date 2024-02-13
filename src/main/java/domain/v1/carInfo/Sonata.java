package domain.v1.carInfo;

public class Sonata extends Car {

	public Sonata(int distanceToUse) {
		super(distanceToUse);
		this.name = "Sonata";
		this.gasMileage = 10;
	}

	@Override
	public String generateReport() {
		int result = this.distanceToUse / this.gasMileage;
		return name + " : " + result + "리터\r\n";
	}
}
