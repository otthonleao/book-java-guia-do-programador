import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class P02155SwitchString {
	public static void main (String args[]) {
		if (args.length > 0) {
			switch(args[0].toLowerCase()) {
				case "data":
					System.out.println(DateFormat.getDateInstance().format(new Date()));
					break;
				case "hora":
					System.out.println(DateFormat.getTimeInstance().format(new Date()));
					break;
			}
		}
	}
}
