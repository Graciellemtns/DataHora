package utilitarios;

import java.util.Locale;

import org.joda.time.DateTime;

public class Utilitarios {

	public static void formato1(DateTime data) {
		
		//Imprime somente data
		System.out.println("dateTime.toString() = " + data.toString("dd-MM-YYYY"));

	}
	
	public static void formato2(DateTime data) {
		
		//Imprime data e hora
		System.out.println("dateTime.toString() = " + data.toString("dd-MM-YYYY HH:mm:ss"));

	}
		//Imprime o mês escrito
	public static void formato3(DateTime data) {

		System.out.println("dateTime.toString() = " + data.monthOfYear().getAsText());

	}
	
	public static void formato4(DateTime data) {

		//Imprime o mes abreviado
		System.out.println("dateTime.toString() = " + data.monthOfYear().getAsShortText());

	}
	
	public static void formato5(DateTime data) {

		//Imprime o mes em inglês
		System.out.println("dateTime.toString() = " + data.monthOfYear().getAsText(Locale.US));

	}
	
	

	/*
	 * public boolean isAfterPayDay(DateTime datetime) { if
	 * (datetime.getMonthOfYear() == 2) { // February is month 2!! return
	 * datetime.getDayOfMonth() > 26; } return datetime.getDayOfMonth() > 28; }
	 */

}
