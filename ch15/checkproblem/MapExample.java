package ch15.checkproblem;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		
		//Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<>();
		
		//엔트리 저장
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		//최고 점수를 받은 아이디를 저장하는 변수
		String name = null;
		//최고 점수를 저장하는 변수
		int maxScore = 0;
		//점수 합계를 저장하는 변수
		int totalScore = 0;
		
		
		//여기에 코드를 작성하세요.
		//엔트리 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
/*		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Entry<String, Integer> entry = entryIterator.next();
			String k = entry.getKey();
			int v = entry.getValue();
			//최고 점수 & 최고 점수를 받은 아이디
			if(maxScore<v) {
				maxScore = v;
				name = k;
			}
			// 총합
			totalScore += v;
		}
		//평균점수
		totalScore = totalScore / map.size();
*/
		
		//답지
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		
		
		
		//출력코드
		System.out.println(name);
		System.out.println(maxScore);
		System.out.println(totalScore);
		
		
		
	}

}
