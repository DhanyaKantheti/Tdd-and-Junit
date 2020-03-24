package com.epam.TddJunit;

import org.junit.Test;

import junit.framework.TestCase;

public class JunitTest extends TestCase {
	@Test
	public void test()
	{
		Junit j=new Junit();
		assertEquals("CD",j.mainn("AACD"));
	}
	@Test
	public void test1()
	{
		Junit j=new Junit();
		assertEquals("BCD",j.mainn("ABCD"));
	}
	@Test
	public void test2()
	{
		Junit j=new Junit();
		assertEquals("BAA",j.mainn("AABAA"));
	}
	@Test
	public void test3()
	{
		Junit j=new Junit();
		assertEquals("",j.mainn("AA"));
	}

}
