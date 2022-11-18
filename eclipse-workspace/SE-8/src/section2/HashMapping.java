package section2;

import java.util.HashSet;
import java.util.Set;

public class HashMapping {
	public static void main(String[] args) {
		Set<Integer> hashSet=new HashSet<>();
		hashSet.add(23);
		hashSet.add(4);
		hashSet.add(10);
		
		for(int element: hashSet) {
			System.out.println(element+ " ");
		}
	}

}
