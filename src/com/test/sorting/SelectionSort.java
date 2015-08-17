package com.test.sorting;

public class SelectionSort {

	private long[] a; // ref to array a
	private int nElems; // number of data items

	public SelectionSort(int max) // constructor
	{
		a = new long[max]; // create the array
		nElems = 0; // no items yet
	}

	public void insert(long value) // put element into array
	{
		a[nElems] = value; // insert it
		nElems++; // increment size
	}

	public void display(int array[], int size) // displays array contents
	{
		for (int j = 0; j < size; j++)
			System.out.print(array[j] + " "); // display it
		System.out.println("");
	}

	public void sort(int a[], int size) {
		int out, in, min;
		for (out = 0; out < size - 1; out++) // outer loop
		{
			min = out; // minimum
			for (in = out + 1; in < size; in++) {
				if (a[in] < a[min]) // if min greater,
					min = in; // we have a new min
				
			}
			swap(out, min); // swap them
		} // end for(out)
	}

	private void swap(int one, int two) {
		long temp = a[one];
		a[one] = a[two];
		a[two] = temp;
	}
	
	// 77 99 44 55 22 88 11 0 66 33
	// 0 11 22 33 44 55 66 77 88 99 

	public static void main(String[] args) {
		int array[] = {77, 99, 44, 55, 22, 88, 11, 0, 66, 33};
		
		SelectionSort selectionSort = new SelectionSort(10);
		
		selectionSort.sort(array, 10); // selection-sort them
		selectionSort.display(array, 10); // display them again
	} // end main()

}
