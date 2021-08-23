package searching;

import java.util.Arrays;

public class SearchinDemo {

	public static int linearSearch(int num[],int size,int search) {
		for(int i=0;i<size;i++) {
			if(num[i]==search) {
				return i;
			}
		}
		return -1;
	}
	
	public static int binarySearch(int num[], int first, int last, int search) {
		int mid = (first+last)/2;					// first -0, last 6	, mid is 3
			while(first<=last) {					// 3<6
				if(num[mid]<search) {				// num[3]<1	num[3] = 4 	ie 4<1	
					first = mid +1;						// first = 3+1	4 
				}else if(num[mid]==search) {
					return mid;
					}else {
					last = mid-1;
				}
				mid = (first +last )/2;
			}
			if(first>last) {
				//System.out.println("Element not found");
				return -1;
			}
			return -2;
	}
	public static void main(String[] args) {
		int abc[]= {4,1,5,8,3,2,9};				// 1,2,3,4,5,8,9
		int search =10;
		Arrays.sort(abc);
		int result = binarySearch(abc, 0, abc.length-1, search);
//		int result = linearSearch(abc, abc.length, search);
		if(result==-1) {
			System.out.println("Element not found");
		}else {
			System.out.println("Element present in position "+result);
		}
	}

}
