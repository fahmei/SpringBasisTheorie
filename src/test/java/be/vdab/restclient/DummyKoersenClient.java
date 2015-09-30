package be.vdab.restclient;

import static java.math.BigDecimal.valueOf;
import java.math.BigDecimal;

public class DummyKoersenClient implements KoersenClient {

	@Override
	public BigDecimal getDollarKoers() {
		return valueOf(1.5);
	}

}
