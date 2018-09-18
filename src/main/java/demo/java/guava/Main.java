package demo.java.guava;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

public class Main {

	public static LoadingCache<String, String> cache;
	
	public static void main(String[] args) throws ExecutionException {
		
//		basic();
		
		loader();
	}
	
	public static void basic() {

		Cache<String, Person> cache = CacheBuilder.newBuilder()
				.initialCapacity(10)
				.concurrencyLevel(5)
				.expireAfterWrite(10, TimeUnit.SECONDS)
				.build();
		
		Person p = new Person("Fang");
		cache.put("Test1", p);
		System.out.println(cache.getIfPresent("Test2").getName());
	}
	
	public static void loader() throws ExecutionException {
		
		cache = CacheBuilder.newBuilder()
				.build(new CacheLoader<String, String>() {

					@Override
					public String load(String key) throws Exception {
						System.out.println("-------------------------------");
						return load(key);
					}
				});
		
		cache.put("Test1", "Test2");
		
		System.out.println(cache.getUnchecked("Test1"));
	}
	
	public static String load(String key) {
		String result = "";
		try {
			result = cache.get(key);
		} catch (ExecutionException e) {
			System.out.println("Error!");
//			e.printStackTrace();
		}
		return result;
	}
}
