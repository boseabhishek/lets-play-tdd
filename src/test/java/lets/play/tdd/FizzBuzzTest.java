package lets.play.tdd;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void testFizzBuzzReturnsFizzWhenPassed3(){
        FizzBuzz fb = new FizzBuzz();
        String result = fb.orange(3);
        assertEquals("Fizz", result);
    }

    @Test
    public void testFizzBuzzReturnsBuzzWhenPassed5(){
        FizzBuzz fb = new FizzBuzz();
        String result = fb.orange(5);
        assertEquals("Buzz", result);
    }

    @Test
    public void testFizzBuzzReturns1WhenPassed1(){
        FizzBuzz fb = new FizzBuzz();
        String result = fb.orange(1);
        assertEquals("1", result);
    }

    @Test
    public void testFizzBuzzReturnsFizzWhenPassed6(){
        FizzBuzz fb = new FizzBuzz();
        String result = fb.orange(6);
        assertEquals("Fizz", result);
    }

    @Test
    public void testFizzBuzzReturnsBuzzWhenPassed10(){
        FizzBuzz fb = new FizzBuzz();
        String result = fb.orange(10);
        assertEquals("Buzz", result);
    }

    @Test
    public void testFizzBuzzReturnsFizzBuzzWhenPassed15(){
        FizzBuzz fb = new FizzBuzz();
        String result = fb.orange(15);
        assertEquals("FizzBuzz", result);
    }

    @Test
    public void testFizzBuzzReturnsFizzBuzzWhenPassed120(){
        FizzBuzz fb = new FizzBuzz();
        String result = fb.orange(120);
        assertEquals("FizzBuzz", result);
    }
}
