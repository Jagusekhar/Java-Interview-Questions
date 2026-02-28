package Java;

import java.util.ArrayList;

public class Array_and_ArrayList {


	public static void main(String[] args) {

		//Array

		int[] marks = new int[3];

		marks[0]=10;
		marks[1]=20;
		marks[2]=30;
		//marks[3]=10;
		System.out.println(marks[1]);

		//Array List
		
		ArrayList<Integer> employee = new ArrayList<>();
		employee.add(100);
		employee.add(200);
		employee.add(300);
		employee.add(400);
		employee.add(500);
		employee.remove(1);
		
		
		
		System.out.println(employee);
		
		
	}
}
