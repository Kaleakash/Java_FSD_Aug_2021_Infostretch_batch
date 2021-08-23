package sort;

public class SortingDemo {
	public static void selectionSort(int num[], int size) {
		for(int i=0;i<size-1;i++) {
			int min =i;							// extra memory space.
				for(int j=i;j<size;j++) {
					if(num[j]<num[min]) {
						min =j;
					}
				}
				int temp = num[i];
				num[i]=num[min];
				num[min]=temp;
		}
	}
	public static void bubbleSort(int num[], int size) {
			for(int i=0;i<size-1;i++) {
				for(int j=0;j<size-1-i;j++) {
					if(num[j]>num[j+1]) {
						int temp  = num[j];
						num[j]=num[j+1];
						num[j+1]=temp;
					}
				}
			}
	}
	public static void main(String[] args) {
		int num[]= {3,4,1,7,5,9,8,2};
		System.out.println("Before sort");
		for(int n:num) {
			System.out.print(n+" ");
		}
		//selectionSort(num, num.length);
		bubbleSort(num, num.length);
		System.out.println();
		System.out.println("After sort");
		for(int n:num) {
			System.out.print(n+" ");
		}
	}

}
