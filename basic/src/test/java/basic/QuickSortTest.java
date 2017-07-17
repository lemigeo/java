package basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuickSortTest {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		Random rand = new Random();
		for(int i=0; i<10; i++)
		{
			list.add(rand.nextInt(100));
		}
		QuickSort qs = new QuickSort();
		qs.sort(list);
		for(Integer i : list)
		{
			System.out.println(i.toString());
		}
	}
}