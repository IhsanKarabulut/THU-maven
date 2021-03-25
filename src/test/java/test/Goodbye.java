package test;

import org.junit.Test;

import maven.Hello;

public class Goodbye {

	@Test
	public void test() {
		Hello goodbye = new Hello();
		assert(goodbye.isAlive());
}

	}


