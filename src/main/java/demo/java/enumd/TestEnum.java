package demo.java.enumd;

public enum TestEnum {

	Man("1"),
	Women("2");
	
	private final String value;

	private TestEnum(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
