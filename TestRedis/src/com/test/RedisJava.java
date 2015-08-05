package com.test;
import redis.clients.jedis.Jedis;
public class RedisJava {
	 public static void main(String[] args) {
		   //Connecting to Redis server on localhost
	      Jedis jedis = new Jedis("localhost");
	      System.out.println("Connection to server sucessfully");
	      //set the data in redis string
	      jedis.set("tutorial-name", "Redis tutorial");
	     // Get the stored data and print it
	     System.out.println("Stored string in redis:: "+ jedis.get("tutorial-name"));
	     try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
}
