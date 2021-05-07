import java.util.Scanner;

public class GuGuDan {

	public static void main(String[] args) {
		
		System.out.println("몇 단 ? : ");
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		for(int i=1;i<10;i++){
		   System.out.println(number + " x " + i + " = " + number * i);
		}
	}
}
