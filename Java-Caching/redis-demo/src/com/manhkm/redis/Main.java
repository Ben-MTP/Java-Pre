package com.manhkm.redis;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import redis.clients.jedis.Jedis;

/**
 * @author ManhKM on 2/15/2022
 * @project redis-demo
 */
public class Main {
    static Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        Jedis jedis = new Jedis(String[] args);
        logger.info("Connected");
        logger.info("PING to server: " + jedis.ping());

        // Set/Get String value
        jedis.set("MY_NAME_2", "Tung Huynh, set from Java Application");
        logger.info("MY_NAME_2's value: " + jedis.get("MY_NAME_2"));

        // Set/Get List value
        jedis.lpush("packages", "logging");
        jedis.lpush("packages", "reflect");
        jedis.lpush("packages", "shallowcopy");
        jedis.lpush("packages", "listcollection");
        logger.info("Items of packages: " + jedis.lrange("packages", 0, 4));
    }
}
