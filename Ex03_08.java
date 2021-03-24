
public class Ex03_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		float c, d;
		a = 100;
		b = a;
		c = 111.1f; // 숫자 뒤에 f를 붙이지 않으면 float가 아닌 double형으로 인식하여 오류 발생
		d = c;
		System.out.printf("a, b의 값 ==> %d, %d \n", a, b);
		System.out.printf("c, d의 값 ==> %5.1f, %5.1f\n", c, d);

	}

}
