package be.vdab;

import java.math.BigDecimal;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import be.vdab.services.EuroService;

public class Main {

	//private final static String TELLER1 = "teller1";
	//private final static String TELLER2 = "teller2";
	
	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("container.xml")) {
		
			
			System.out.println(context.getBean(EuroService.class).naarDollar(BigDecimal.valueOf(2)));
			
			/*context.getBean(TELLER1, Teller.class).verhoog();
			context.getBean(TELLER1, Teller.class).verhoog();
			
			Teller teller2 = context.getBean(TELLER2, Teller.class);
			teller2.verhoog();
			
			context.getBean(TELLER2, Teller.class).verhoog();
			
			
			
			
			/*System.out.println(context.getBean("classA", ClassA.class).getBoodschap());
			System.out.println(context.getBean("classB", ClassB.class).getBoodschap());
			
			System.out.println(context.getBean(ClassA.class).getBoodschap());
			System.out.println(context.getBean(InterfaceB.class).getBoodschap());
			
			System.out.println(context.getBean(ClassA.class).getTelefoonNrHelpDesk());
			
			ClassA objectA = context.getBean(ClassA.class);
			System.out.println(objectA.getKoersenURL());
			System.out.println(objectA.getDefaultTaalEnLand().getDisplayName());
			System.out.println("Bestand bestaat: " + objectA.getImportData().exists());
			System.out.println(objectA.getDefaultBladRichting());
			System.out.println(objectA.getWebMasterEMailAdres());
			
			System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(objectA.getWebsiteGestart()));
			
			ClassB objectB = context.getBean(ClassB.class);
			System.out.println(objectB.getTelefoonNrHelpDesk());
			System.out.println(objectB.getAantalPogingenUpdateKlant());
			
			System.out.println(context.getBean(HelpDeskMedewerkers.class));*/
		}

	}
	

}
