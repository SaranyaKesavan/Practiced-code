import java.time.format.*;
import java.time.*;
class DateDemo
{
	public static void main(String... saran)
	{
		/*System.out.println(LocalDate.now());//now() static method
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		LocalDate date1=LocalDate.of(2015,Month.OCTOBER,20);//give month in uppercase	
		LocalDate date2=LocalDate.of(2015,1,20);// of() static method
	
		System.out.println(date1);
		System.out.println(date2);	
		System.out.println(LocalDate.now().plusDays(2));//can also use your own date like date=date.plusDays(4);
		System.out.println("***"+LocalDate.now().plusWeeks(2));//non static methods
		System.out.println(LocalDate.now().plusMonths(3));
		System.out.println("***"+LocalDate.now().minusWeeks(2));
		System.out.println(LocalDate.now().plusYears(4));
		// in LocalDate we can't use hours and seconds but in LocalDateTime we can use
		System.out.println(LocalDateTime.now().minusHours(4));
		System.out.println(LocalDateTime.now().minusDays(24));
		System.out.println(LocalDateTime.now().minusSeconds(6));
		//period -->cls  ;  ofMonths()-->static mthd , ofWeeks(), ofYears(), ofDays()*/
		Period period =Period.ofMonths(3);		
		System.out.println(LocalTime.now().plus(period));
		//	System.out.println(0);
		// dateformatting
		/*LocalDate date=LocalDate.of(2020,Month.JANUARY,20);
		LocalTime time=LocalTime.of(11,12,34);
		LocalDateTime dateTime = LocalDateTime.of(date,time);
		DateTimeFormatter shortF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
		DateTimeFormatter mediumF = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		System.out.println(shortF.format(dateTime));
		System.out.println(mediumF.format(dateTime));	
		DateTimeFormatter f= DateTimeFormatter.ofPattern("HH-mm-SS-NS");
		System.out.println(f.format(LocalDateTime.now()));	
		//f.format(LocalDate.now());
		System.out.println(f.format(LocalTime.now()));
		DateTimeFormatter f=DateTimeFormatter.ofPattern("MMMM dd yyyy");
		LocalDate date=LocalDate.parse("January 10 1996",f);
		LocalTime time= LocalTime.parse("11:22");
		System.out.println(date);
		System.out.println(time);*/	
			
	}
}                                                                                                                                                                                                                                                   
