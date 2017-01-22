package demo.java.string;

public class StringStdy {

	public static void main(String[] args) {
		
		StringStdy.testConcatString();
	}
	
	public static void testString() {
		// ��String���д���һ������abc����Ȼ������ʱs1ָ����еĶ���abc����
		// �ڶ���ִ��ʱ����Ϊ��abc���Ѿ�������String���ˣ����Բ��ٴ�������s1==s2����true�������ˡ�
		// s2==��abc���϶���ȷ�ˣ���String����ֻ��һ����abc������s1��s2��ָ����еġ�abc���������������
		String s1 = "abc";
		String s2 = "abc";
		
		// ������仰������2��String���󣬶������������䣬ֻ��ջ�ڴ洴��s3���ã��ڶ��ڴ��ϴ���һ��String���������ǡ�abc������s3ָ����ڴ������׵�ַ��
		String s3 = new String("abc");
		
		// 1 String��ı������ַ�����char[]
		// 2  ʹ��Stringʱ����ֱ�Ӹ�ֵ��Ҳ������new���������󣬵�������ߵ�ʵ�ֻ����ǲ�ͬ��
		// 3 Java����ʱά��һ��String�أ����е�String���󲻿��ظ���û�д������������ա�ֱ�Ӹ�ֵ��String����ֵ�������̳߳��С�String�ز����ڶѺ�ջ���������ڳ�����
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
	}
	
	public static void testConcatString() {
		String s1 = new String("a");
		String s2 = s1;
		System.out.println(s1 == s2);
		
		// Stringÿ�θı䶼�ᴴ���µĶ������Ըı��s2��s1ָ���ջ��ַ�Ѿ���ͬ��
		s1 = s1 + "b";
		System.out.println(s1 == s2);
		
		// ======================================
		
		StringBuilder sb1 = new StringBuilder("a");
		StringBuilder sb2 = sb1;
		System.out.println(sb2 == sb1);
		
		// ���ھ��������String��Ҫ��StringBuilder�滻��StringBuilder��ʹ���ݱ���ˣ�ָ���ջ��ַ�ǲ���ġ�
		// �������Ա��ⲻ��Ҫ���ڴ�ռ��˷�
		sb1.append("b");
		System.out.println(sb2 == sb1);
	}
}
