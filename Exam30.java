import java.util.Scanner;

public class Exam30 {

	public static  int sum(int i, int j) {
		int sum = 0;
		for (int z = i; z < j+1; z++) {
			sum+= z;
		}
		return sum;
	}
	
	public static void main(String[] args) {
	
	// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("num1 : ");
		int a = sc.nextInt();
		System.out.printf("num2 : ");
		int b = sc.nextInt();
		System.out.printf("sum : %d", sum(a, b));
	}

}
