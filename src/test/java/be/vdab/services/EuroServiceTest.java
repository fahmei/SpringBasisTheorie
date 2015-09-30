package be.vdab.services;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import be.vdab.restclient.DummyKoersenClient;
import be.vdab.restclient.KoersenClient;

public class EuroServiceTest {

	private KoersenClient koersenClient;
	private EuroService euroService;
	
	
	@Before
	public void before(){
		koersenClient = new DummyKoersenClient();
		euroService = new EuroService(koersenClient);
	}
	
	@Test
	public void test() {
		assertEquals(0, BigDecimal.valueOf(3).compareTo(euroService.naarDollar(BigDecimal.valueOf(2))));
	}

}
