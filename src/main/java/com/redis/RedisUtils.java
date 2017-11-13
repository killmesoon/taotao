package com.redis;

import redis.clients.jedis.Jedis;

public class RedisUtils {
	
	private static Jedis jedis;
	
	
	public void startUp() {
		jedis = new Jedis("127.0.0.1", 6379);
		
	}

	
	public void testString () {
//		jedis.set("name", "kobe");
		System.out.println("Name:" + jedis.get("myKey"));
		
	    
	}
	
	
	public static void main(String[] args) {
		RedisUtils ru = new RedisUtils();
		ru.startUp();
		ru.testString();
		
	}
}
