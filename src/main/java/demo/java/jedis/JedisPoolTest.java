package demo.java.jedis;

import java.util.Date;

import org.apache.commons.pool2.impl.GenericObjectPool;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class JedisPoolTest {

	public static void main(String[] args) {
		
		JedisPoolConfig config = new JedisPoolConfig();
		config.setMaxIdle(5);
		config.setMaxTotal(1024);
		config.setMaxWaitMillis(5000);
		
		JedisPool pool = new JedisPool(config, "localhost", 6379);
		
		for(int i = 0; i < 100; i ++) {
			
			JedisPoolKeepRunnable r2 = new JedisPoolKeepRunnable();
			r2.setJedisPool(pool);
			
			Thread t2 = new Thread(r2);
			t2.start();

			JedisPoolRunnable r = new JedisPoolRunnable();
			r.setJedisPool(pool);
			
			Thread t = new Thread(r);
			t.start();
			
			System.out.println(i);
		}
		
		System.out.println("End");
	}
}
