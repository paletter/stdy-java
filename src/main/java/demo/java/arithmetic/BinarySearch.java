package demo.java.arithmetic;

public class BinarySearch {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		int target = 7;
		
		int start = 0;
		int end = arr.length - 1;
		
		int middle = end / 2;
		int middleValue = arr[middle];
		
		int cnt = 0;
		while(end > start) {
		
			cnt ++;
			System.out.println("Cnt: " + cnt);
			
			if(target != middleValue && target < middleValue) {
				
				end = middle;
				
				middle = end / 2;
				middleValue = arr[middle];
				
			} else if(target != middleValue && target > middleValue) {
				
				start = middle;
				
				middle = (end - start) / 2;
				middleValue = arr[middle];
				
			} else {
				
				System.out.println("find target: " + target);
				break;
			}
		}
	}
}
