import java.time.format;
import java.time.*;
class check
{
	public static void main(String... a)
	{
		DateTimeFormatter f=DateTimeFormatter.ofPattern("MMMM dd yyyy");
		LocalDate date=LocalDate.parse("January 10 1996",f);
	}
}
