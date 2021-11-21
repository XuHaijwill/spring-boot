package customertest.utils;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class RedisUtilsTest {

	@Resource
	private RedisUtils redisUtils;

	@Test
	void set() {
		redisUtils.set("redis_key", "redis_vale");
	}

    @Test
    void get() {
		String value = redisUtils.get("redis_key");
		System.out.println(value);
    }
}