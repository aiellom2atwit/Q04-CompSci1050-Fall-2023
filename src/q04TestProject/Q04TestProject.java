/**
 * 
 */
package q04TestProject;
import java.util.Scanner;




/**
 * 
 */
public class Q04TestProject {

	public static final String ERR_MSG = "Invalid entry! Please ensure spelling is correct and try again.";
	/**
	 * 
	 */
	public Q04TestProject() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.printf("What is your favorite day of the week?");
		String favoriteWeekIn = input.next();
		String favoriteWeekDay = "";
		
		switch (favoriteWeekIn.toLowerCase()) {
		case "monday":
			favoriteWeekDay = "Monday";
			break;
		case "tuesday":
			favoriteWeekDay = "Tuesday";
			break;
		case "wednesday":
			favoriteWeekDay = "Wednesday";
			break;
		case "thursday":
			favoriteWeekDay = "Thursday";
			break;
		case "friday":
			favoriteWeekDay = "Friday";
			break;
		case "saturday":
			favoriteWeekDay = "Saturday";
			break;
		case "sunday":
			favoriteWeekDay = "Sunday";
			break;
		default:
			System.out.printf(ERR_MSG);
			return;
		}
		
		System.out.printf("%n%s is your favorite day of the week.%n", favoriteWeekDay);

	}

}
