package kalaidharma5;
import java.util.Scanner;
public class EvenorOdd {
	public static void main(String [] args){
		int number;
		Scanner scan=new Scanner(System.in);
		number=scan.nextInt();
		if(number%2==0){
			System.out.println("even");
		}
		else{
			System.out.println("odd");
		}
	}

}
