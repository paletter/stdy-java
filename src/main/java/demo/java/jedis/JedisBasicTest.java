package demo.java.jedis;

import java.util.Map.Entry;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.ScanParams;

public class JedisBasicTest {

	public static void main(String[] args) {
		
//		keyValue();
		sortedSet();
	}
	
	public static void keys() {
		
		Jedis jedis = new Jedis("127.0.0.1");
		
		String key1 = "KeysTest1";
		jedis.set(key1, "KeysTest1");
		String key2 = "KeysTest2";
		jedis.set(key2, "KeysTest2");
		System.out.println(jedis.keys("KeysTest*"));
		jedis.del(key1);
		jedis.del(key2);
		jedis.close();
	}
	
	public static void scan() {
		
		Jedis jedis = new Jedis("127.0.0.1");
		
		String key1 = "ScanTest1";
		jedis.set(key1, "ScanTest1");
		String key2 = "ScanTest2";
		jedis.set(key2, "ScanTest2");
		
		System.out.println(jedis.scan("0").getResult());
		System.out.println(jedis.scan("1").getResult());
		
		ScanParams sp = new ScanParams();
		sp.match("*2");
		System.out.println(jedis.scan("0", sp).getResult());
		
		String key3 = "ScanTest3";
		jedis.hset(key3, "UserId", "1");
		jedis.hset(key3, "Name", "Fangbo");
		for(Entry<String, String> entry : jedis.hscan(key3, "0").getResult()) {
			System.out.println("Key:" + entry.getKey() + ", Value:" + entry.getValue());
		}
		System.out.println(jedis.hscan(key3, "0").getResult());
		
		jedis.del(key1);
		jedis.del(key2);
		jedis.close();
	}
	
	public static void keyValue() {

		Jedis jedis = new Jedis("127.0.0.1");
		
		jedis.set("KeyValueTest", "KeyValueTest-1");
		System.out.println(jedis.get("KeyValueTest"));
		
		jedis.del("KeyValueTest");
		
		jedis.close();
	}
	
	public static void hash() {
		
		Jedis jedis = new Jedis("127.0.0.1");
		
		jedis.hset("UserTable", "UserId", "1");
		jedis.hset("UserTable", "UserName", "FangBo");
		System.out.println(jedis.hget("UserTable", "UserId"));
		System.out.println(jedis.hget("UserTable", "UserName"));
		
		jedis.hdel("UserTable");
		
		jedis.close();
	}
	
	public static void set() {
		
		Jedis jedis = new Jedis("127.0.0.1");
		
		jedis.sadd("SetTest", "101", "2");
		jedis.sadd("SetTest", "7", "-1", "26354");
		System.out.println(jedis.sscan("SetTest", "0").getResult());
		
		jedis.del("SetTest");
		
		jedis.close();
	}
	
	public static void sortedSet() {
		
		Jedis jedis = new Jedis("127.0.0.1");
		
		jedis.zadd("SortedSetTest", 1, "100");
		System.out.println(jedis.zscan("SortedSetTest", "0").getResult());
		
		jedis.del("SortedSetTest");
		
		jedis.close();
	}
}
