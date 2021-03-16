
public class EX03_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		char c, d;
		a = 0xF90A; // a에 16진수를 대입 / 0x를 붙이면 16진수 / F 9 0 A     16^3 16^2 16 1
		b = 0x50;

		System.out.printf("%c\n", a);

		c = (char) b;
		System.out.printf("%c\n", c);

		d = '#';
		System.out.printf("%c의 ASCII값은 %d 입니다\n", d, (int) b); // 문자형 변수 d를 두가지 형태로 출력
		
		
		
		int z = 63754;   // a의 10진수 / 0xF90A
		
		System.out.printf("z => %c", z);

	}

}
