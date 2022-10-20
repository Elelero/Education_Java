package practice;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Integer[] nums = {3,2, 4, 5, 3, 4};
//		Integer[] nums = {3,1,2,3};
		
		Set<Integer> set = new HashSet<Integer>(Arrays.asList(nums));
		
		int seq = nums.length/2;
		int cnt = 0;
		
		for(int i=0; i<seq; i++) {
			Iterator<Integer> it = set.iterator();
			if(set.size()<=seq) {
				cnt = set.size();
			} else if(it.next()!=it.next()) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}

-----------------------------------------------------------------

import java.util.HashSet;
import java.util.Set;
class Solution {
    public int solution(int[] nums) {
        int answer =0;
      Set<Integer> set = new HashSet<>();
      for(int a: nums) {
         set.add(a);
      }
      
      if(nums.length/2<=set.size()) {
         answer = nums.length/2;
      } else {
         answer = set.size();
      }
        return answer;
    }
}
