
public class Ex03_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// string = %s 문자열 / 입력한 글자 수 X 2 바이트 / 저장되는 모든 값을 글자로 저장됨
		String str1 = "IT CookBook 입니다.";
		String str2 = "10";
		String str3 = "20";

		str1 = "Java 입니다.";

		System.out.printf("%s\n", str1);
		System.out.printf("%s\n", str2 + str3); // 숫자가 아닌 문자 / 10+20 = 30 X, 1020
		
		
		String str4 = "123", str5 = "456";
		
		System.out.printf("%s", str4 + str5);

		

	}

}
