package array;

import java.util.ArrayList;

public class AddingArrylist {
	public static void main(String[] args) {
		ArrayList<Integer> myList = new ArrayList<Integer>(3);
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(4);
		/*myList.add(5);
		myList.add(5);*/
		for(Integer x: myList)
		{
			System.out.println(x);
		}
		System.out.println("size"+myList.size());
	}

}
