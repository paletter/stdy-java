package demo.java.arithmetic;

public class BubbleSort {

	public static void main(String[] args) {
		int[] a = {99, 5, 3, 4, 1};
		
		int temp = 0;
		for(int i = 0; i < a.length - 1; i ++) {
			for(int j = 0; j < a.length - 1 - i; j ++) {
				if(a[j] > a[j + 1]) {
					temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
				}
			}
			
			show(a);
		}
		
		show(a);
	}
	
	public static void show(int[] a) {

		String r = "";
		for(int z = 0; z < a.length; z ++) {
			r += a[z] + ",";
		}
		System.out.println(r);
	}
}
