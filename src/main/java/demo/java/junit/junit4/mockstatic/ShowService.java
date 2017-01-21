package demo.java.junit.junit4.mockstatic;

public class ShowService {

	public String showStr() {
		String str = CommonStaticUtil.show();
		System.out.println(str);
		return str;
	}
}
