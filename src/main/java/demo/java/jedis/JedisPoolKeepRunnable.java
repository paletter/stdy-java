package demo.java.jedis;

import java.util.Date;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class JedisPoolKeepRunnable implements Runnable {

	private JedisPool jedisPool;
	
	@Override
	public void run() {
		
		Jedis jedis = jedisPool.getResource();
		
		jedis.set("time", (new Date()).toString());
	}

	public JedisPool getJedisPool() {
		return jedisPool;
	}

	public void setJedisPool(JedisPool jedisPool) {
		this.jedisPool = jedisPool;
	}
	
}
