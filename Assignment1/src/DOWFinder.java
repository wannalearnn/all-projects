import java.util.Scanner ; 

public class DOWFinder {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in); 
		int date  = sc.nextInt() ; 
		int month = sc.nextInt() ; 
		int year =  sc.nextInt() ; 
		int days  = 0 ; 
		for(int i=1900;i<=year-1;i++)
		{
			days = days + 365 ; 
			if(leapyear(i) == true){
				days = days + 1 ; 
			}
		}
		
		int monthinfo[] = {0,31,28,31,30,31,30,31,31,30,31,30,31} ; 
		
		for(int i=1;i<=month-1;i++)
		{
			days = days +  monthinfo[i] ; 
		}
		
		if(leapyear(year) == true && month>2){
			days=days+1 ; 
		}
		days = days + date - 1 ; 
		int temp = days%7 ; 
		String todays_day = ""  ;
		if(temp == 0)
		{
			todays_day  = todays_day + "Monday" ; 
		}
		if(temp == 1)
		{
			todays_day  = todays_day + "Tuesday" ; 
		}
		if(temp == 2)
		{
			todays_day  = todays_day + "Wenesday" ; 
		}
		if(temp == 3)
		{
			todays_day  = todays_day + "Thursday" ; 
		}
		if(temp == 4)
		{
			todays_day  = todays_day + "Friday" ; 
		}
		if(temp == 5)
		{
			todays_day  = todays_day + "Saturday" ; 
		}
		if(temp == 6)
		{
			todays_day  = todays_day + "Sunday" ; 
		}
		
		System.out.println("Current day is : " + todays_day);
	}

	private static boolean leapyear(int i) {
		if(i%4 != 0 )
		{
			return false ; 
		}
		else
		{
			if(i%100 == 0)
			{
				if(i%400 == 0){
					return true ; 
				}
				else
				{
					return false ; 
				}
			}
			else
			{
				return true ; 
			}
		}
	}

}
