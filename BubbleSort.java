import java.util.*;
public class BubbleSort {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BubbleSort a = new BubbleSort();
		
		System.out.println("Enter No of ELEMENT in Array");
		int no = sc.nextInt();
		int []array = new int[no];
		array=a.getArray(no);
		System.out.println("Sorted list of Array");
		a.bubble(array, no);
	}
	
	int[]getArray(int n){
		Scanner sc = new Scanner(System.in);
		int []arr = new int[n]; 
		for(int i = 0 ; i < n ; i++ ) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}
	
	void bubble (int []x, int y) {
		int temp;
		for(int i = 0 ; i < y-1 ; i++) {
			for(int j = 0 ; j < y-1-i ; j++) {
				if(x[j] > x[j+1]) {
					temp = x[j];
					x[j] = x[j+1];
					x[j+1] = temp;
				}
			}
		}
		for(int i = 0 ; i < y ; i++) {
			System.out.println(x[i]);
		}
	}
}
		
		
		