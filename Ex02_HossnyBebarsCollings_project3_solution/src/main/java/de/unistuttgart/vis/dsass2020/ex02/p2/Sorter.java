package de.unistuttgart.vis.dsass2020.ex02.p2;

public class Sorter {
	

	public static <T extends Comparable<T>> void bubbleSort(ISimpleList<T> list) {
		boolean sorted = false;
		int n = list.size() -1;
		
		while(sorted != true) {
			sorted = true;
			
			for(int i = 0; i<n; i++){ 
				
				if(list.get(i).compareTo(list.get(i+1)) > 0){
					list.swap(i, i+1);
					sorted = false;
				}
				
			}
		}
	}
		
	public static <T extends Comparable<T>> void selectionSort(ISimpleList<T> list) {
		int n = list.size() -1;
		int smallestIndex;
		
		for(int i =0; i< n; i++) {
			smallestIndex = i;
			
			for(int j = i+1; j<=n; j++) {
				
				if(list.get(j).compareTo(list.get(smallestIndex))<0) {
					smallestIndex = j;
				}
				
			list.swap(i, smallestIndex);
			}
			
		}
	}
	
	public static <T extends Comparable<T>> void insertionSort(ISimpleList<T> list) {
		int n = list.size() -1;
		
		for(int i = 0; i < n ; i++) {
			int j = i+1;
			
			while(j>0) {
				
				if(list.get(j).compareTo(list.get(j-1))< 0) {
					list.swap(j-1, j);
				}
				
				j--;
			}
		}
	}

}
