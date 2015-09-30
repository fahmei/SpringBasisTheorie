package be.vdab;

import java.util.Properties;

public class HelpDeskMedewerkers {

	private final Properties medewerkers;
	
	public HelpDeskMedewerkers(Properties medewerkers) {
		this.medewerkers = medewerkers;
	}
	
	@Override
	public String toString() {
		return medewerkers.toString();
	}
	
}
