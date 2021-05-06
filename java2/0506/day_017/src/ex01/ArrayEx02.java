package ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ArrayEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] nums = {5,2,3,1,4};
		
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		//ascii
		String[] names = {"xMan","Alex","XMAN","Bob","Curl","flex","alex"};
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		
		//배열 ->list->배열
		List<String> lists = Arrays.asList(names);
		//강제 형변환 문제
		//ArrayList<String> lists = (ArrayList)Arrays.asList(names);
		for(String list : lists) {
			System.out.println(list);
		}
		
	}

}
