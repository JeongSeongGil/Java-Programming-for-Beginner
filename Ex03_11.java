
public class Ex03_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a = 0.1234567890123456789012345f; // 4바이트 / 일곱 자리까지 정상
		double b = 0.1234567890123456789012345f; // 8바이트 / 열다섯 자리까지 정상

		System.out.printf("%30.25f\n", a);
		System.out.printf("%30.25f\n", b);
		
		
		
		//
		char ch = 'a';
		System.out.printf("%d\n", (int)ch);
		

		float i = 200.12f;
		System.out.printf("%d\n", (int) i);       //   double을 int로 전환
		
		// int j = 100.123;      불가능 but
		int j = (int) 100.123;   // int로 바꿔서 k에 넣어야 함
		System.out.printf("%d", j);
		

	}

}
