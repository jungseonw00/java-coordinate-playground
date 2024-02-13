package domain.v1.carInfo;

public class Avante extends Car {

	public Avante(int distanceToUse) {
		super(distanceToUse);
		this.name = "Avante";
		this.gasMileage = 15;
	}

	@Override
	public String generateReport() {
		int result = this.distanceToUse / this.gasMileage;
		return name + " : " + result + "리터\r\n";
	}
}
