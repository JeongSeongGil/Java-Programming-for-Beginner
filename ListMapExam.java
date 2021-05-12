import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ListMapExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Map<String, String>> rList = new ArrayList<Map<String,String>>();
		Map<String, String> pMap = new HashMap<String, String>(); // 객체 메모리에 저장
		pMap.put("name", "이협건");
		pMap.put("email", "h.lee@");
		pMap.put("addr", "서울");
		pMap.put("dept", "데분");
		rList.add(pMap);// 정보가 저장된 HashMap을 List에 저장
		
		pMap = null; // 사용이 끝난HashMap을 변수 메모리에서 삭제
		
		pMap = new HashMap<String, String>(); // 변수에 새롭게 메모리에 올림
		
		pMap.put("name", "홍길동");
		pMap.put("email", "g.hong@");
		pMap.put("addr", "경기");
		pMap.put("dept", "시각");
		rList.add(pMap);
		
		pMap = null;
		
		Iterator<Map<String, String>> it = rList.iterator();
		
		while(it.hasNext()) {
			Map<String, String> rMap = it.next();
			System.out.println(rMap.get("name"));
			System.out.println(rMap.get("email"));
			System.out.println(rMap.get("addr"));
			System.out.println(rMap.get("dept"));
		}
	}

}
