package Java_Assignment;
import java.util.Scanner;
public class Leap_Year {

	
		public static void leapYear()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a year to check : ");
			int year = sc.nextInt(); 

			if (year % 400 == 0) {
				System.out.println(year + " is a leap year");
			} else if (year % 100 == 0) {
				System.out.println(year + " is not a leap year");
			} else if (year % 4 == 0) {
				System.out.println(year + " is a leap year");
			}else  {
				System.out.println(year + " is not a leap year");
			}
			sc.close();
		}
		public static void main(String[] args) {
			leapYear();
		}

	}


