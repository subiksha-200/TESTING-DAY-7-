package com.example.testing;

import org.testng.annotations.Test;

import org.testng.Assert;

public class CalculatorTest{
	int num1=50;
	int num2=10;
	
  @Test(priority = -1)
  public void Addition() {
	  int sum=num1+num2;
	  Assert.assertEquals(sum, 60);
  }
  @Test(priority = -2)
  public void Subtraction() {
	  int diff=num1-num2;
	  Assert.assertEquals(diff, 40);
  }
  @Test(priority = -3)
  public void Multiplication() {
	  int product=num1*num2;
	  Assert.assertEquals(product, 500);
  }
  @Test(priority = -4)
  public void Division() {
	  int div=num1/num2;
	  Assert.assertEquals(div, 5);
  }
  
  
}
