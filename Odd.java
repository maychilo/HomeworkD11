package datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Odd {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 100, 400, 15, 15, 15, 15, 15, 15, 15, 15 };

		
			System.out.println("Odd Times Appear Num is "+findOddTimesAppearNum(arr));

		
	}

	public static List<Integer> findOddTimesAppearNum(int[] arr) {
		HashMap<Integer, Integer> numMap = new HashMap<Integer,Integer>();
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {

			if (numMap.containsKey(arr[i])) {

				int value = numMap.get(arr[i]);
				numMap.put(arr[i], value + 1);
			} else {
				numMap.put(arr[i], 1);
			}
		}

		for (Integer a : numMap.keySet()) {
			if (numMap.get(a) % 2 != 0) {
				list.add(a);
			}
		}

		return list;
	}
}
