package demo.java.string;

public class StringStdy {

	public static void main(String[] args) {
		
		StringStdy.testConcatString();
	}
	
	public static void testString() {
		// 在String池中创建一个对象”abc”，然后引用时s1指向池中的对象”abc”。
		// 第二句执行时，因为”abc”已经存在于String池了，所以不再创建，则s1==s2返回true就明白了。
		// s2==”abc”肯定正确了，在String池中只有一个”abc”，而s1和s2都指向池中的”abc”，就是这个道理。
		String s1 = "abc";
		String s2 = "abc";
		
		// 单独这句话创建了2个String对象，而基于上面两句，只在栈内存创建s3引用，在堆内存上创建一个String对象，内容是”abc”，而s3指向堆内存对象的首地址。
		String s3 = new String("abc");
		
		// 1 String类的本质是字符数组char[]
		// 2  使用String时可以直接赋值，也可以用new来创建对象，但是这二者的实现机制是不同的
		// 3 Java运行时维护一个String池，池中的String对象不可重复，没有创建，有则作罢。直接赋值的String对象，值保存在线程池中。String池不属于堆和栈，而是属于常量池
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
	}
	
	public static void testConcatString() {
		String s1 = new String("a");
		String s2 = s1;
		System.out.println(s1 == s2);
		
		// String每次改变都会创建新的对象，所以改变后s2与s1指向的栈地址已经不同了
		s1 = s1 + "b";
		System.out.println(s1 == s2);
		
		// ======================================
		
		StringBuilder sb1 = new StringBuilder("a");
		StringBuilder sb2 = sb1;
		System.out.println(sb2 == sb1);
		
		// 对于经常变更的String，要用StringBuilder替换。StringBuilder即使内容变更了，指向的栈地址是不变的。
		// 这样可以避免不必要的内存空间浪费
		sb1.append("b");
		System.out.println(sb2 == sb1);
	}
}
