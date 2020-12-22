package com.vtiger.contact;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CreatecontactTest 
{
@Test
public void sum() 
{
	System.out.println("sum");
	int a=20;
	int b=30;
	Assert.assertEquals(50, a+b);
}
@Test
public void sub() 
{
	System.out.println("sub");
	int a=20;
	int b=30;
	Assert.assertEquals(10,b-a);
}
@Test
public void mul() 
{
	System.out.println("mul");
	int a=20;
	int b=30;
	Assert.assertEquals(600, a*b);
}
@Test
public void div() 
{
	System.out.println("div");
	int a=10;
	int b=20;
	Assert.assertEquals(2, b/a);
}
}
