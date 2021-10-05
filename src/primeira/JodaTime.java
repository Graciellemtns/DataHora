package primeira;

import java.util.Locale;

import org.joda.time.DateTime;

public class JodaTime {
	
	public static void main(String[] args) {
		
		DateTime dateTime = new DateTime(2021,10,05,00,00,00);
		
		System.out.println("dateTime.toString() = " + dateTime.toString("dd-MM-YYYY"));
		
		System.out.println("dateTime.toString() = " + dateTime.toString("dd-MM-YYYY HH:mm:ss"));
		//Apresenta o mês escrito
		System.out.println("dateTime.toString() = " + dateTime.monthOfYear().getAsText());
		
		//Apresenta o mês abreviado
		System.out.println("dateTime.toString() = " + dateTime.monthOfYear().getAsShortText());
		
		
		//Apresenta o mês abreviado
		System.out.println("dateTime.toString() = " + dateTime.monthOfYear().getAsText(Locale.US));
	}

}
