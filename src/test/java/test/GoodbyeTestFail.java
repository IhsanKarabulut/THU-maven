package test;

import static org.junit.Assert.*;

import org.junit.Test;

import maven.Hello;

public class GoodbyeTestFail {

	@Test
	public void test() {
		
		Hello goodbye = new Hello();
		assert(goodbye.isAlive());
		 fail();
	}

}

