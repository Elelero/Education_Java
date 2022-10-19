package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		
		String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
// 		String[] participant = {"a", "b", "b", "b", "b"};
		String[] completion = {"josipa", "filipa", "marina", "nikola"};
// 		String[] completion = {"b", "b", "b", "b"};

		String answer = "";
		
		Map<String, Integer> map = new HashMap<String, Integer>();
    
		for(String i : participant) {
			int cnt = 1; //value 값
			if (map.containsKey(i)) { //동명이인일 경우
				cnt = map.get(i); //기존에 있는 사람의 키값
				cnt++;
			}
			map.put(i, cnt); //맵에 참가자 저장
		}
    
		Iterator<String> keys = map.keySet().iterator();
		while(keys.hasNext()) {
			String strKey = keys.next();
			for(String st : completion) {
				if(st.equals(strKey)) {
					int cnt = map.get(strKey);
					map.put(strKey, --cnt);
				}
			}
		}
		
		for(Map.Entry<String, Integer> k : map.entrySet()) {
			if(k.getValue()==1) {
				System.out.println(k);
			}
		}
		
	}
}
