
public class Ex03_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100, b = 200;
		float result, c = 200;
		result = a / b;
		System.out.printf("a / b => %f\n", result);
		result = a / c; // 연산에 실수가 하나라도 들어 있으면 그 결과는 실수 / (c = 실수, b = 정수)
		System.out.printf("a / c => %f\n", result);
		
		
		
		
		
		System.out.println((int) 1 + (float) 2.0);

	}

}
