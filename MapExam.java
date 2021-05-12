import java.util.HashMap;
import java.util.Map;

public class MapExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> pMap = new HashMap<String, String>();
		// key, value를 가지고 있고, 중복 X
		
		pMap.put("name", "정성길");
		pMap.put("email", "dataofsg02@gmail.com");
		pMap.put("dept", "데이터분석과");
		pMap.put("value", "정성길");
		
		
		System.out.println("---------------------------------------");
		System.out.println(pMap.get("name"));
		System.out.println(pMap.get("email"));
		System.out.println(pMap.get("dept"));	
		System.out.println("---------------------------------------");
		System.out.printf("\t\t\t%s", pMap.get("name"));
	}

}
