package Arrays;

public class StringArray {

	public static void main(String[] args) {
      
		String[] Weekdays = {"monday","tuesday","wednesday",
				"thursday","friday","saturday"};
		String maximumnumber = "";
		for(String day:Weekdays) {
			if(day.length() > maximumnumber.length())
			{
			      maximumnumber = day;
			}
		}
			   
			 System.out.println(maximumnumber);
			 for(int i = Weekdays.length-1; i>=0; i--) {
				  System.out.println(Weekdays[i]);
			 }
		

	}

}
