package domain.v2.carInfo;

import java.util.ArrayList;
import java.util.List;

public class RentCompany {

	private List<Car> companys = new ArrayList<>();

	public static RentCompany create() {
		return new RentCompany();
	}

	public void addCar(Car car) {
		companys.add(car);
	}

	public String generateReport() {
		String result = "";
		for (Car company : companys) {
			result += company.generateReport();
		}
		return result;
	}
}
