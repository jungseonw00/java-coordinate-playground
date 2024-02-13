package domain.v1.carInfo;

public class K5 extends Car {

	public K5(int distanceToUse) {
		super(distanceToUse);
		this.name = "K5";
		this.gasMileage = 13;
	}

	@Override
	public String generateReport() {
		int result = this.distanceToUse / this.gasMileage;
		return name + " : " + result + "리터\r\n";
	}
}
