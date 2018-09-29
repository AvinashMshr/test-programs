package Checks_Prgrams.test_programs;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAdditionAndDeletion {
	
	List<Integer> list = new ArrayList<>();
	
	public void add() {
		for(int i=0;i<10;i++) {
			list.add(i);
			System.out.println("Size: " + list);
		}
	}


}
