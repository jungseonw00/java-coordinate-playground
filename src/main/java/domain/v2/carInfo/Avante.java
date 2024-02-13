package domain.v2.carInfo;

import static domain.v2.carInfo.CarInfo.AVANTE;

public class Avante implements Car {

	private final String name = AVANTE.getName();
	private final int gasMileage = AVANTE.getGasMileage();
	private final int distanceToUse;

	public Avante(int distanceToUse) {
		this.distanceToUse = distanceToUse;
	}

	@Override
	public String generateReport() {
		int result = this.distanceToUse / this.gasMileage;
		return this.name + " : " + result + "리터\r\n";
	}
}
