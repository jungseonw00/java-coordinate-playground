package domain.v1.carInfo;

public abstract class Car {

	public String name;
	public int gasMileage;
	public int distanceToUse;

	public Car(int distanceToUse) {
		this.distanceToUse = distanceToUse;
	}

	public abstract String generateReport();
}
