package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionPractice {
	public static void main(String[] args) {
		// list 선언
		ArrayList<String> list = new ArrayList<>();
		
		// list.add(e)
		list.add("초콜릿");
		list.add("사이다");
		list.add("볶음밥");
		
		// list.add(int index, e)
		list.add(1, "파스타");
		
		// list.set(int index, e)
		String result = list.set(1, "닭갈비");
		
		// list.remove
		list.remove("볶음밥");
		
		// 향상된 for문
		for(String s : list) {
			System.out.println(s);
		}
		System.out.println("---------------------");
		System.out.println(result);
		
		System.out.println("---------------------");
		String result2 = list.get(2);
		System.out.println(result2);
		
		// set 선언
		Set<Integer> set = new HashSet<>();
		set.add(5);
		set.add(45);
		set.add(87);
		set.add(1);
		set.add(33);
		set.add(99);
		set.add(5456);
		for(int i : set) {
			System.out.println(i);
		}
		System.out.println("--------------");
		Set<Integer> set2 = new TreeSet<>();
		set2.add(5);
		set2.add(45);
		set2.add(87);
		set2.add(1);
		set2.add(33);
		set2.add(99);
		set2.add(5456);
		
		for(int i : set2) {
			System.out.println(i);
		}
		
		set.
	}
}
