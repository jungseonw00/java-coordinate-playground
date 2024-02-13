package domain.v2.carInfo;

public enum CarInfo {
	AVANTE("Avante", 15),
	SONATA("Sonata", 10),
	K5("K5", 13);

	private final String name;
	private final int gasMileage;

	CarInfo(String name, int gasMileage) {
		this.name = name;
		this.gasMileage = gasMileage;
	}

	public String getName() {
		return name;
	}

	public int getGasMileage() {
		return gasMileage;
	}
}
