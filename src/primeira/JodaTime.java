package primeira;

import java.util.Locale;

import org.joda.time.DateTime;

import utilitarios.Utilitarios;

public class JodaTime {
	
	public static void main(String[] args) {
		
		DateTime data = new DateTime(2021,10,06,10,25,00);
		
		Utilitarios.formato1(data);
		
		Utilitarios.formato2(data);
		
		Utilitarios.formato3(data);
		
		Utilitarios.formato4(data);
		
		Utilitarios.formato5(data);
		
	}

}
