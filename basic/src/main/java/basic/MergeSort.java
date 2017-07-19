package basic;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
	
	public MergeSort() {
	}
	
	public void sort(List<Integer> list) {
		int size = list.size();
		if(size == 1)
			return;
		List<Integer> first = new ArrayList<Integer>(list.subList(0, size / 2));
		List<Integer> second = new ArrayList<Integer>(list.subList(size / 2, size));
		
		sort(first);
		sort(second);
		
		merge(first, second, list);
	}
	
	private void merge(List<Integer> first, List<Integer> second, List<Integer> list) {
		int listIdx = 0;
		int firstIdx = 0, secondIdx = 0;
		while(firstIdx<first.size()) {
			int temp1 = first.get(firstIdx);
			while(secondIdx<second.size()) {
			    	int temp2 = second.get(secondIdx);
			    	if(temp1 < temp2) {
			    		break;
			    	}
			    	else {
			    		list.set(listIdx, temp2);
			    		secondIdx++;
			    		listIdx++;
			    	}
			}
			list.set(listIdx, temp1);
			firstIdx++;
			listIdx++;
		}
		while(secondIdx<second.size()) {
			list.set(listIdx, second.get(secondIdx));
	    		secondIdx++;
	    		listIdx++;
		}
	}
}
