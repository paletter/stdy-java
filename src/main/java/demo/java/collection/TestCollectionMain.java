package demo.java.collection;


public class TestCollectionMain {

	public static void main(String[] args) {

//		ArrayListStdy.testIterate();
//		HashSetStdy.testIterate();
//		TreeSetStdy.testIterate();
		
//		HashSetStdy.testInsertElement(500000);
//		LinkedHashSetStdy.testInsertElement(500000);
		
		
		HashSetStdy.testInsertOrder();
		LinkedHashSetStdy.testInsertOrder();
		TreeSetStdy.testInsertOrder();
	}
	
	public static void testInsert() {
		int num = 500000;
		ArrayListStdy.testInsertElementInLast(num);
		LinkedListStdy.testInsertElementInLast(num);
		HashSetStdy.testInsertElement(num);
		TreeSetStdy.testInsertElementInLast(num);
	}
	
	public static void testRemove() {
		ArrayListStdy.testRemoveByObj();
		LinkedListStdy.testRemoveByObj();
	}
	
	public static void testRemoveByIndex() {
		ArrayListStdy.testRemoveByIndex();;
		LinkedListStdy.testRemoveByIndex();;
	}
}
