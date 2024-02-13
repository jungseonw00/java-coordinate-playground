package domain.v2.carInfo;

import static domain.v2.carInfo.CarInfo.SONATA;

public class Sonata implements Car {

	private final String name = SONATA.getName();
	private final int gasMileage = SONATA.getGasMileage();
	private final int distanceToUse;

	public Sonata(int distanceToUse) {
		this.distanceToUse = distanceToUse;
	}

	@Override
	public String generateReport() {
		int result = this.distanceToUse / this.gasMileage;
		return this.name + " : " + result + "리터\r\n";
	}
}
