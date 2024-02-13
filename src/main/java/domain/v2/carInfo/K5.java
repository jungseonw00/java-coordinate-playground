package domain.v2.carInfo;

import static domain.v2.carInfo.CarInfo.K5;

public class K5 implements Car {

	private final String name = K5.getName();
	private final int gasMileage = K5.getGasMileage();
	private final int distanceToUse;

	public K5(int distanceToUse) {
		this.distanceToUse = distanceToUse;
	}

	@Override
	public String generateReport() {
		int result = this.distanceToUse / this.gasMileage;
		return this.name + " : " + result + "리터\r\n";
	}
}
