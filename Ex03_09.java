
public class Ex03_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c, d;
		a = 100 + 100; // 200
		b = a + 100; // 300
		c = a + b - 100; // 200 + 300 - 100 = 400
		d = a + b + c; // 200 + 300 + 400 = 900

		System.out.printf("a, b, c, d의 값 ==> %d, %d, %d, %d\n\n", a, b, c, d);

		a = b = c = d; // a <- b <- c <- d 순으로 오른쪽에서 왼쪽으로 입력 / 900
		System.out.printf("a, b, c, d의 값 ==> %d, %d, %d, %d\n\n", a, b, c, d);

		a = b = c = d = 100;

		System.out.printf("a, b, c, d의 값 ==> %d, %d, %d, %d\n\n", a, b, c, d);

		a = 100;
		a += 200; // a <- (a + 200) / 300
		System.out.printf("a의 값 ==> %d\n", a);
		
		
		
		

	}

}
