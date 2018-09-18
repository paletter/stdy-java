package demo.java.jedis;

import redis.clients.jedis.Jedis;

public class JedisListTest {

	public static void main(String[] args) {
		
		Jedis jedis = new Jedis("127.0.0.1");
		
		jedis.del("t");
		
		jedis.lpush("t", "1");
		jedis.lpush("t", "2");
		jedis.lpush("t", "3");
		System.out.println(jedis.lrange("t", 0, -1));
		System.out.println(jedis.lrange("t", 0, 0));
		jedis.lpop("t");
		System.out.println(jedis.lrange("t", 0, -1));
		
		jedis.del("t");
		
		jedis.rpush("t", "1");
		jedis.rpush("t", "2");
		jedis.rpush("t", "3");
		System.out.println(jedis.lrange("t", 0, -1));
		System.out.println(jedis.lrange("t", 0, 0));
		jedis.rpop("t");
		System.out.println(jedis.lrange("t", 0, -1));
	}
}
