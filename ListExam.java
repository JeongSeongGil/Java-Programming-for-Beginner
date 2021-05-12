import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> rList = new LinkedList<String>();
		rList.add("이협건");
		rList.add("홍길동");
		rList.add("임꺽정");
		rList.add("고길동");

		System.out.printf("배열의 크기 = %d\n", rList.size());

		for (int i = 0; i < rList.size(); i++) {
			System.out.printf("%d번째 배열 기억공간 : %s\n", i, rList.get(i));
		}
	}

}
