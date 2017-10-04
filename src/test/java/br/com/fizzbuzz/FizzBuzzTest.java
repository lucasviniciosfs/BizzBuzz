package br.com.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
	
	@Test
	public void main(){
		FizzBuzz fizzBuzz = new FizzBuzz();
		
		Assert.assertEquals("Fizz", fizzBuzz.ehFizzBuzz(66));
		Assert.assertEquals("Buzz", fizzBuzz.ehFizzBuzz(65));
		Assert.assertEquals("FizzBuzz", fizzBuzz.ehFizzBuzz(90));
		Assert.assertEquals("Continua o jogo", fizzBuzz.ehFizzBuzz(1));
	}
}
