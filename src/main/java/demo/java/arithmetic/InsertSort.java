package demo.java.arithmetic;

public class InsertSort {

	public static void main(String[] args) {
		
		int[] a = {1, 5, 4, 3, 2};
		int len = a.length;
		
		for(int i = 2; i < len; i ++) {
			
			System.out.println("==========================");
			System.out.println(a[i - 1] + "-" + a[i]);
			System.out.println("i:" + i);
			
			if(a[i - 1] > a[i]) {
				a[0] = a[i];
				a[i] = a[i - 1];

				show(a);
				
				int j = 0;
				for(j = i - 2; a[j] > a[0]; j --) {
					System.out.println("j:" + j);
					a[j + 1] = a[j];
					
					show(a);
				}
				
				a[j + 1] = a[0];
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
