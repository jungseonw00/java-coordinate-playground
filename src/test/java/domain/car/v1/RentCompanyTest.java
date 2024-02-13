package domain.car.v1;

import static org.assertj.core.api.Assertions.assertThat;

import domain.v1.carInfo.RentCompany;
import domain.v1.carInfo.Avante;
import domain.v1.carInfo.K5;
import domain.v1.carInfo.Sonata;
import org.junit.jupiter.api.Test;

public class RentCompanyTest {

	private static final String NEWLINE = System.getProperty("line.separator");

	@Test
	void boil() {
	    // given
		RentCompany company = RentCompany.create();
		company.addCar(new Sonata(150));
		company.addCar(new K5(260));
		company.addCar(new Sonata(120));
		company.addCar(new Avante(300));
		company.addCar(new K5(390));

		String report = company.generateReport();
		assertThat(report).isEqualTo(
			"Sonata : 15리터" + NEWLINE +
			"K5 : 20리터" + NEWLINE +
			"Sonata : 12리터" + NEWLINE +
			"Avante : 20리터" + NEWLINE +
			"K5 : 30리터" + NEWLINE);
	}
}