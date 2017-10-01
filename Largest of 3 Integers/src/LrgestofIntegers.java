//Largest of 3 Integers LrgestofIntegers Cali Mikson Finds largest of 3 integers//
import java.util.Scanner ;

public class LrgestofIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader= new Scanner(System.in);
		int num1 ;
		int num2 ;
		int num3 ;
		int largest ;
		int largest2 ;
		int largestof3 ;
		System.out.println("Enter number 1");
		num1=reader.nextInt();
		System.out.println("Enter number 2");
		num2=reader.nextInt();
		System.out.println("Enter number 3");
		num3=reader.nextInt();
		System.out.println("The largest integer is ");
		System.out.println(largest(num1,num2);
		  
		
		
		
		
		
		
	}
	public static int largest(int num1, int num2) {
		int largest= Math.max(num1, num2) ;
		return largest;
	
	}
	public static int largest2(int num2, int num3) {
		int largest2= Math.max(num2, num3) ;
		return largest2; 
		
	}
	public static int largestof3(int largest, int largest2) {
		int largestof3= Math.max(largest, largest2) ;
		return largestof3 ;
	}
}
