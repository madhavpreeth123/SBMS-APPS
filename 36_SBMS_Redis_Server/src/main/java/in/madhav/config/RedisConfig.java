package in.madhav.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import in.madhav.binding.Country;

@Configuration
public class RedisConfig {

	@Bean
	public JedisConnectionFactory jedisConn() {
		JedisConnectionFactory jedis=new JedisConnectionFactory();
		//in real time we set redis server propertis
		return jedis;
	}
	
	@Bean
	public RedisTemplate<String, Country> redisTemplate(){
		RedisTemplate<String, Country> redis=new RedisTemplate<>();
		redis.setConnectionFactory(jedisConn());
		
		return redis;
	}
}
