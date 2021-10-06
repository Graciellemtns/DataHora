package primeira;

import org.joda.time.DateTime;

public class Teste {
	
		public boolean isAfterPayDay(DateTime datetime) {
			if (datetime.getMonthOfYear() == 2) { // February is month 2!!
				return datetime.getDayOfMonth() > 26;
			}
			return datetime.getDayOfMonth() > 28;
		}
	
}
