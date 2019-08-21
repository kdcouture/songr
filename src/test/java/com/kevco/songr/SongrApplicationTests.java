package com.kevco.songr;

import com.kevco.songr.controllers.HomeController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SongrApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test public void testReverse() {
		assertEquals("test1 test2 > ","test2 test1", HomeController.reverseString("test1 test2"));
		assertEquals("hello goodbye > ","goodbye hello", HomeController.reverseString("hello goodbye"));
	}

	@Test public void testCapitalize() {
		assertEquals("test > TEST", "TEST", HomeController.capitalizeString("test"));
		assertEquals("tEsE > TEST", "TEST", HomeController.capitalizeString("tEsT"));
	}

}
