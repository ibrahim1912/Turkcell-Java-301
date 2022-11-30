package collections.boxingAndUnboxing;

import java.util.ArrayList;

public class AutoBoxingLab {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(20);
		
		int x = 10;
		arrayList.add(x); //autoboxing

		int y = arrayList.get(1); //unboxing
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.BYTES);
	}

}
