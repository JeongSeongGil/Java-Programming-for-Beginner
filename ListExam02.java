import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

public class ListExam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> rList = new LinkedList<String>();
		rList.add("이협건");
		rList.add("홍길동");
		rList.add("임꺽정");
		rList.add("고길동");
		
		System.out.printf("배열의 크기 = %d\n", rList.size());
		Iterator<String> it = rList.iterator();// Iterator = 반복의 조건을 알기 위해서 / 조건만들기

		while (it.hasNext()) {
			String name = (String) it.next();
			System.out.printf("name = %s\n", name);
		}

	}

}
