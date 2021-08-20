package utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) throws Exception{
		int abc[]= {2,1,5,3,7,9,4};
		System.out.println("Before sort");
		for(int n:abc) {
			System.out.println(n);
		}
							Arrays.sort(abc);
							
		//System.out.println("After sort");
		for(int n:abc) {
			System.out.println(n);
		}
	
		System.out.println("binary search ");
		int res1 = Arrays.binarySearch(abc, 9);
		int res2 = Arrays.binarySearch(abc, 15);
		System.out.println(" "+res1);
		System.out.println(" "+res2);
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Enter the name");
//		String name = br.readLine();
//		FileOutputStream fs = new FileOutputStream(name);
		
//		String name = "abc.txt";
//		File ff = new File("D:\\"+name);
//		ff.createNewFile();
	}

}
