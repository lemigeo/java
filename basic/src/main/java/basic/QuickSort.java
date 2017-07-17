package basic;

import java.util.List;

public class QuickSort {
	
	private List<Integer> list = null;
	
	public QuickSort() {
	}
	
	public void sort(List<Integer> list) {
		this.list = list;
		internalSort(0, this.list.size() - 1);
	}
	
	//pivot: the first element of the list
	private void internalSort(Integer left, Integer right)
	{
		int begin = left, end = right;
		int pivot = list.get(left);
		int i = left + 1;
		int j = right;
		
		while (i < j)
		{
			while(i <= end && list.get(i) > pivot)
				i++;
			while(j >= begin && list.get(j) < pivot)
				j--;
			
			if(i < j)
			{
				swap(i, j);
				i++;
				j--;
			}
			else
			{
				swap(j, begin);
			}
		}
		if(begin < j)
			internalSort(begin, j - 1);
		if(i < end)
			internalSort(i, end);
	}

	private void swap(Integer i, Integer j)
	{
		Integer temp = list.get(i);
		list.set(i, list.get(j));
		list.set(j,  temp);
	}
}
