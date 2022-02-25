package in.co.rays.basics;

public class SwitchPrintDayName {
	public static void main(String[] args)
	{
		int day=3;
		String dayString;
		switch(day)
		{
		case 5:
		dayString= "Sunday";
		break;
		
		case 1:
		dayString= "Monday";
		break;
		
		default:
			dayString=("abc");
		
		}
		System.out.println(dayString);
	}

}
