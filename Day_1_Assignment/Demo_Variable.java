package Java_Assignment;

public class Demo_Variable 
{
		   static int x = 10;
		   static int y;
		   static void func(int z) {
		      System.out.println("x = " + x);
		      System.out.println("y = " + y);
		      System.out.println("z = " + z);
		   }
		   static {
		      System.out.println("Running static initialization block.");
		      y = x + 5;
		   }
		   public static void main(String args[]) {
		      func(8);
		   }
		}
